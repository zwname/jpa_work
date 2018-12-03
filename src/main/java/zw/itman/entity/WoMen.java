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
* @version: 创建时间：2018年12月3日 下午11:04:23
* @description:
*/
@Entity
public class WoMen {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(length=20,unique=true,nullable=false)
	private String name;
	@ManyToMany(mappedBy="womenList")
	private List <Man> manList;
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
	public List<Man> getManList() {
		return manList;
	}
	public void setManList(List<Man> manList) {
		this.manList = manList;
	}
	@Override
	public String toString() {
		return "WoMen [id=" + id + ", name=" + name + ", manList=" + manList + "]";
	}
	
	
}
