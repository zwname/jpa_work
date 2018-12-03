package zw.itman;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.apache.tomcat.util.digester.SetPropertiesRule;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import zw.itman.entity.BanJi;
import zw.itman.entity.IdCar;
import zw.itman.entity.Man;
import zw.itman.entity.Person;
import zw.itman.entity.Student;
import zw.itman.entity.WoMen;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Jpa2ApplicationTests {

	private static EntityManagerFactory factory = null;
	private static EntityManager entityManager = null;
	private static EntityTransaction transaction = null;

	@Before
	public void init() {
		// 1. 创建EntityManagerFactory
		factory = Persistence.createEntityManagerFactory("jpa-2");

		// 2. 创建EntityManager
		entityManager = factory.createEntityManager();

		// 3.开启事务
		transaction = entityManager.getTransaction();
		transaction.begin();
	}

	@After
	public void close() {
		// 5. 提交事务
		transaction.commit();

		// 6. 关闭EntityManager
		entityManager.close();

		// 7. 关闭EntityManagerFactory
		factory.close();
	}

	@Test
	@Ignore
	public void OnetoOne() {

		// 一对一的添加
		// IdCar car=new IdCar();
		// car.setCarNum("513030199410067817");
		// Person person=new Person();
		// person.setName("李四");
		// person.setiCar(car);
		// entityManager.persist(person);

		// 查找
		// Person person = entityManager.find(Person.class, 1);
		// System.err.println(person.toString());

		// 修改Person
		// String sql1="update Person p set p.name= ?1 where p.id=?2";
		// int i = entityManager.createQuery(sql1).setParameter(1, "张三").setParameter(2,
		// 1).executeUpdate();
		// System.err.println(i);

		// 修改IdCar

		// String sql1="update IdCar set carNum= ?1 where id=?2";
		// int i = entityManager.createQuery(sql1).setParameter(1,
		// "111111111111111").setParameter(2, 1).executeUpdate();
		// System.err.println(i);

		// 删除Person
		// 无法删除，因为IdCar中的主键是Person表中的外键，IdCar没有权限删除
		// int i = entityManager.createQuery("delete from IdCar where
		// id=?").setParameter(1, 1).executeUpdate();
		// System.err.println(i);
		// 删除Person
		// int i = entityManager.createQuery("delete from Person where
		// id=?").setParameter(1, 1).executeUpdate();
		// System.err.println(i);

	}

	@Test
	@Ignore
	public void OnetoMany() {

//		BanJi banji = new BanJi();
//		banji.setName("java5班");
//		Student stu1 = new Student();
//		stu1.setName("lisi");
//		Student stu2 = new Student();
//		stu2.setName("wangwu");
//
//		// 班级关联学生
//		List<Student> list1=new ArrayList<>();
//		list1.add(stu1);
//		List<Student> list2=new ArrayList<>();
//		list2.add(stu2);
//		// 学生关联班级
//		stu1.setBanJi(banji);
//		stu2.setBanJi(banji);
//
//		// 插入操作
//		entityManager.persist(banji);
//		entityManager.persist(stu1);
//		entityManager.persist(stu2);
		
		
		
	}
	@Test
	@Ignore
	public void MangToMang() {
		
		//持久化操作
//		WoMen w1=new WoMen();
//		w1.setName("wo1");
//		WoMen w2=new WoMen();
//		w2.setName("wo2");
//		
//		entityManager.persist(w1);
//		entityManager.persist(w2);
//		
//		List<WoMen> womenList= new ArrayList<>(); 
//		womenList.add(w1);
//		womenList.add(w2);
//		
//		Man man=new Man();
//		man.setName("man1");
//		man.setWomenList(womenList);
//		entityManager.persist(man);
//		
//		
	}

}
