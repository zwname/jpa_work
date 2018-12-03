package zw.itman.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
* @author: zhengwei E-mail:613295775@qq.com
* @version: 创建时间：2018年12月3日 下午8:42:17
* @description:
*/
@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable=false,unique=true,length=20)
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL) // People是关系的维护端，当删除 people，会级联删除 address
	@JoinColumn(name = "IdCar_id", referencedColumnName = "id")
	private IdCar iCar;

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

	public IdCar getiCar() {
		return iCar;
	}

	public void setiCar(IdCar iCar) {
		this.iCar = iCar;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", iCar=" + iCar + "]";
	}
	

}
