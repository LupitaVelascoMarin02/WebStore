package Manage;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import classes.Billing;
import classes.POrder;

public class ManageBilling {
	
	
		/* Method to create an Billing in the database */
		public Integer addBilling(SessionFactory factory,String invoice, POrder pOrder, double amount) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer billingId = null;
		Date date = new Date();
		
		try {
			tx = session.beginTransaction();
			Billing B = new Billing(invoice, amount, date, pOrder);
			billingId = (Integer) session.save(B);
			tx.commit();
		}catch (HibernateException e) {
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		return billingId;
	}

	/* Method to  READ data the Billing */
	public void listBilling(SessionFactory factory, Integer id) {
		Session session = factory.openSession();
		Transaction tx = null;
		
		try {
	         tx = session.beginTransaction();
	         System.out.println("***Billing Information***");
	         List billing = session.createQuery("FROM Billing  WHERE Billing.IdBilling = " + id).list(); 
	         for (Iterator iterator = billing.iterator(); iterator.hasNext();){
	            Billing b = (Billing) iterator.next(); 
	            System.out.print("Amount: " + b.getAmount()); 
	            System.out.print("  Date: " + b.getDate()); 
	            System.out.println("  Purchase Order: " + b.getPOrder().getIdPOrder());
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
