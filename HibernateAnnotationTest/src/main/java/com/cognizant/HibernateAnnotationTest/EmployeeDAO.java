package com.cognizant.HibernateAnnotationTest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {
	
	public static void main(String[] args){
		
		Configuration conf=new Configuration().configure();
		SessionFactory sf=conf.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		Employee emp=(Employee)session.load(Employee.class, 2);
		System.out.println("Id: " + emp.getId() +" \nFull Name: "+emp.getFirstName()+" " +emp.getLastName());

}
}



