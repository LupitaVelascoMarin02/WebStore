package Manage;

import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import classes.Client;
import java.util.List;

public class ManageClient {
	
	public Integer addClient(SessionFactory factory, String name,String lastName,String username,String password,String email) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer idClient = null;
		
		try {
			tx = session.beginTransaction();
			Client clients = new Client(name, lastName, username, password, email);
			idClient = (Integer) session.save(clients);
			tx.commit();
		}catch (HibernateException e) {
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		return idClient;
	}

	public void listClients(SessionFactory factory, Integer nclient) {
		Session session = factory.openSession();
		Transaction tx = null;
		
		try {
	         tx = session.beginTransaction();
	         System.out.println("Client Information");
	         List clients = session.createQuery("FROM Client c WHERE c.idClient = " + nclient).list(); 
	         for (Iterator iterator = clients.iterator(); iterator.hasNext();){
	            Client client = (Client) iterator.next(); 
	            System.out.print("First Name: " + client.getName()); 
	            System.out.print("  Last Name: " + client.getLastName()); 
	            System.out.println("  Password: " + client.getPassword());
	            System.out.println("  Email: " + client.getEmail());
	            System.out.println("  Username: " + client.getUsername());
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
