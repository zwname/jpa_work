package zw.itman.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
* @author: zhengwei E-mail:613295775@qq.com
* @version: 创建时间：2018年12月3日 下午9:26:49
* @description:
*/
@Entity
public class BanJi {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(length=20,nullable=false,unique=true)
	private String name;
	@OneToMany(mappedBy = "banJi",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	List<Student> studentList;

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

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "BanJi [id=" + id + ", name=" + name + ", studentList=" + studentList + "]";
	}

	


	
	
	

}
