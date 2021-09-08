package Manage;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import classes.DeliveryComp;
import classes.Deliverypack;

public class ManageDeliverypack {

	public Integer addDeliberypack(SessionFactory factory, DeliveryComp deliveryCompany, int packageNum) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer idDeliveryPack = null;
		Date deliveryDate = new Date();
		
		try {
			tx = session.beginTransaction();
			Deliverypack DP = new Deliverypack(packageNum, deliveryCompany);
			idDeliveryPack = (Integer) session.save(DP);
			tx.commit();
		}catch (HibernateException e) {
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		return idDeliveryPack;
	}

	public void listDelP(SessionFactory factory, Integer eid) {
		Session session = factory.openSession();
		Transaction tx = null;
		
		try {
	         tx = session.beginTransaction();
	         System.out.println("\"***Delivery Package Information created***");
	         List delp = session.createQuery("FROM Deliverypack d WHERE d.idDeliveryPack = " + eid).list(); 
	         for (Iterator iterator = delp.iterator(); iterator.hasNext();){
	        	 Deliverypack  DP = (Deliverypack) iterator.next(); 
	            System.out.print("Package Number: " + DP.getPackageNum()); 
	            System.out.print("  Delivery Company: " + DP.getIdDeliveryPack());
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
