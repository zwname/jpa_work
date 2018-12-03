package zw.itman.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
* @author: zhengwei E-mail:613295775@qq.com
* @version: 创建时间：2018年12月3日 下午9:23:17
* @description:
*/
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable=false,unique=true,length=20)
	private String name;
	@JoinColumn(name="banJi_id")
	@ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},optional=false)
	private BanJi banJi;
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
	public BanJi getBanJi() {
		return banJi;
	}
	public void setBanJi(BanJi banJi) {
		this.banJi = banJi;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", banJi=" + banJi + "]";
	}
	
	
	

}
