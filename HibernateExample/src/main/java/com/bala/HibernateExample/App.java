package com.bala.HibernateExample;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Employ emp = new Employ();
		Address adr = new Address();

		emp.setFirstName("Bala");
		emp.setLastName("Krishna");

		//Date d=new Date();

		adr.setCity("Vizag");
		adr.setState("AP");
		emp.setOfficeAddress(adr);

		Address adr1 = new Address();

		Employ emp1 = new Employ();
		emp1.setFirstName("Shivani");
		emp1.setLastName("Mishra");
		adr1.setCity("Lucknow");
		adr1.setState("UP");
		emp1.setHomeAddress(adr1);

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Employ.class).buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(emp);
		session.save(emp1);
		session.getTransaction().commit();
		System.out.println("successfully saved");
		Employ emp2=(Employ) session.get(Employ.class, 1);
		//System.out.println("EMployee"+emp2);
		session.close();
		factory.close();
		

	}
}
