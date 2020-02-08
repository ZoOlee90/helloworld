package client;

import org.hibernate.Session;

import entity.Message;
import util.HibernateUtil;

public class HelloWorldClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Message message = new Message("Hello World with Hibernate & JPA Annotations");
		
		session.save(message);
		
		session.getTransaction().commit();
		session.close();

	}

}
