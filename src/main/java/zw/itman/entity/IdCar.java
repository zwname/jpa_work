package zw.itman.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.EnableLoadTimeWeaving;

/**
* @author: zhengwei E-mail:613295775@qq.com
* @version: 创建时间：2018年12月3日 下午8:42:28
* @description:
*/
@Entity
public class IdCar {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(unique=true,nullable=false,length=18)
	private String carNum;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCarNum() {
		return carNum;
	}
	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
	@Override
	public String toString() {
		return "IdCar [id=" + id + ", carNum=" + carNum + "]";
	}
	

}
