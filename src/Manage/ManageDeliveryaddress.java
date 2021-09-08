package Manage;

import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import classes.City;
import classes.Client;
import classes.Deliveryaddress;

public class ManageDeliveryaddress {

	public Integer addDeliveryAddress(SessionFactory factory, City city,String street, int number, Client client) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer idDeliveryAddress = null;
		
		try {
			tx = session.beginTransaction();
			Deliveryaddress DA = new Deliveryaddress( city, street, number, client);
			idDeliveryAddress = (Integer) session.save(DA);
			tx.commit();
		}catch (HibernateException e) {
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		return idDeliveryAddress;
	}
	public void listDelAdd(SessionFactory factory, Integer eid) {
		Session session = factory.openSession();
		Transaction tx = null;
		
		try {
	         tx = session.beginTransaction();
	         System.out.println("***Delivery Address Information created***");
	         List deladd = session.createQuery("FROM deliveryaddress c WHERE c.idDeliveryAddress = " + eid).list(); 
	         for (Iterator iterator = deladd.iterator(); iterator.hasNext();){
	        	Deliveryaddress  DAS = (Deliveryaddress) iterator.next(); 
	            System.out.print("City: " + DAS.getIdCity().getName());
	            System.out.println("  Street: " + DAS.getStreet());
	            System.out.println("  Number: " + DAS.getNumber());
	         }
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	}
	
}
