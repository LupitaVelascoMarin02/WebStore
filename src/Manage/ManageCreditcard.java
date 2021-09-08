package Manage;


import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import classes.Creditcard;
import classes.Client;
import classes.Typecc;

public class ManageCreditcard {
	public Integer addCreditCard(SessionFactory factory,String number,String cardholder,Typecc idType,int client) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer idCreditCard = null;
		
		try {
			tx = session.beginTransaction();
			Creditcard creditcard = new Creditcard(number, idType, cardholder, client);
			idCreditCard = (Integer) session.save(creditcard);
			tx.commit();
		}catch (HibernateException e) {
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		return idCreditCard;
	}

	public void listCreditCards(SessionFactory factory, Integer eCreditcard) {
		Session session = factory.openSession();
		Transaction tx = null;
		
		try {
	         tx = session.beginTransaction();
	         System.out.println("***CreditCard Information creagted***");
	         List creditcard = session.createQuery("FROM Creditcard c WHERE c.idCreditCard = " + eCreditcard).list(); 
	         for (Iterator iterator = creditcard.iterator(); iterator.hasNext();){
	        	Creditcard creditcards = (Creditcard) iterator.next();
	            System.out.print("Number: " + creditcards.getNumber()); 
	            System.out.println("  Cardholder: " + creditcards.getCardholder());
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
