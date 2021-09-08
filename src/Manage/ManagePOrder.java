package Manage;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import classes.Client;
import classes.Deliverypack;
import classes.POrder;

public class ManagePOrder {

	public Integer addPurchaseOrder(SessionFactory factory, Client client, Deliverypack deliverypack) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer idPOrder = null;
		Date date = new Date();
		
		try {
			tx = session.beginTransaction();
			POrder PO = new POrder(client, date, deliverypack);
			idPOrder = (Integer) session.save(PO);
			tx.commit();
		}catch (HibernateException e) {
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		return idPOrder;
	}

	public void listPurchaseOrder(SessionFactory factory, Integer nid) {
		Session session = factory.openSession();
		Transaction tx = null;
		
		try {
	         tx = session.beginTransaction();
	         System.out.println("***Purchase orders Information***");
	         List order = session.createQuery("FROM POrder c WHERE c.idPOrder = " + nid).list(); 
	         for (Iterator iterator = order.iterator(); iterator.hasNext();){
	        	 POrder pOrder = (POrder) iterator.next();
	            System.out.print("Clients ID: " + pOrder.getIdClient()); 
	            System.out.println("  Date: " + pOrder.getDatePOrder());
	            System.out.println("  Delivery Packeges ID: " + pOrder.getIdDeliveryPack());
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
