package zw.itman.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
* @author: zhengwei E-mail:613295775@qq.com
* @version: 创建时间：2018年12月3日 下午11:01:34
* @description:
*/
@Entity
public class Man {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(length=20,nullable=false,unique=true)
	private String name;
	@JoinTable(name="man_woman",joinColumns=@JoinColumn(name="man_id"),
			inverseJoinColumns=@JoinColumn(name="women_id"))
	@ManyToMany
	//@JoinTable注解的name属性指定关联表的名字，joinColumns指定外键的名字，关联到关系维护端(Man)
	//inverseJoinColumns,指定外键的名字，关联到关系被维护端(WoMen)
	private List<WoMen> womenList;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<WoMen> getWomenList() {
		return womenList;
	}
	public void setWomenList(List<WoMen> womenList) {
		this.womenList = womenList;
	}
	@Override
	public String toString() {
		return "Man [id=" + id + ", name=" + name + ", womenList=" + womenList + "]";
	}
	
	

}
