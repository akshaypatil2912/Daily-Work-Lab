package com.cdac.alter;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cdac.dao.EmployeeDao;
import com.cdac.entity.Employee;

public class EmployeeInsert {
	public static void main(String args[]) {

	/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
	EntityManager em=emf.createEntityManager();
	EntityTransaction tx = em.getTransaction();*/
	
	/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
	EntityManager em = emf.createEntityManager();
	EntityTransaction tx = em.getTransaction();

	tx.begin();*/
	
	Employee empo =new Employee();
	empo.setEmpno(1003);
	empo.setName("Anil");
	empo.setSalary(45000);
	empo.setDateOfJoin(LocalDate.of(2021, 01, 04));
	
	EmployeeDao emd =new EmployeeDao();
	//emd.add(empo);
	
	/*em.persist(empo);
	tx.commit();
	
	emf.close();*/
	//tx.commit();
	
	Employee emp=emd.fetch(1002);
	System.out.println("Empno : "+emp.getEmpno()+"  EmpName : "+emp.getName()+"  Salary : "+emp.getSalary()+"  Date of join : "+emp.getDateOfJoin());
	
	
	
	List<Employee>emp_list=emd.fetchall();
	for(Employee emp1:emp_list) {
		System.out.println("Empno : "+emp1.getEmpno()+"  EmpName : "+emp1.getName()+"  Salary : "+emp1.getSalary()+"  Date of join : "+emp1.getDateOfJoin());
		
		
	}
	
	
	List<Employee>list=emd.fetchallBySalary(30000);
	for(Employee emp1:list) {
		System.out.println("Empno : "+emp1.getEmpno()+"  EmpName : "+emp1.getName()+"  Salary : "+emp1.getSalary()+"  Date of join : "+emp1.getDateOfJoin());
			
	}
	
	
	}
}
