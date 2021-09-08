package Manage;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import classes.Article;
import classes.ArticlepOrder;
import classes.POrder;

public class ManageArticlepOrder {
	public Integer addArticlePOrder(SessionFactory factory, Article article, POrder pOrder) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer idArticlePOrder = null;
		
		try {
			tx = session.beginTransaction();
			ArticlepOrder AP = new ArticlepOrder(article, pOrder);
			idArticlePOrder = (Integer) session.save(AP);
			tx.commit();
		}catch (HibernateException e) {
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		return idArticlePOrder;
	}
}
