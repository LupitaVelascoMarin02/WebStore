package Manage;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import classes.Article;
import classes.City;
import classes.Client;
import classes.Country;
import classes.Creditcard;
import classes.Deliveryaddress;
import classes.DeliveryComp;
import classes.Deliverypack;
import classes.POrder;
import classes.State;
import classes.Typecc;

public class Main {
private static SessionFactory factory;
	
	public static void main(String[] args) {
		
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable e){
			System.err.print("Failed to create sessionFactory object. " + e);
			throw new ExceptionInInitializerError(e);
		}
		
		ManageClient MC = new ManageClient();
		ManageCreditcard MCC = new ManageCreditcard();
		Typecc TCC = new Typecc("5");
		ManageDeliveryaddress DA = new ManageDeliveryaddress();
		City city = new City(5,2);
		Country country = new Country(1);
		State state = new State(3,1);
		ManageDeliverypack MDP = new ManageDeliverypack();
		ManagePOrder MPO = new ManagePOrder();
		ManageArticlepOrder MAP = new ManageArticlepOrder();
		Article article = new Article(1);
		ManageBilling MB = new ManageBilling();
		
		Integer client = MC.addClient(factory, "Josue", "Lagos", "JosueL", "pass123456", "josel12@gmail.com");
		Integer creditcard = MCC.addCreditCard(factory, 
				"12545236", "Josue Lagos", TCC, 21);
		/* Add data in delivery address*/
		;
		
		Client nclient = new Client(client);
		Creditcard ncreditcard = new Creditcard(creditcard);
		
		Integer deadd = DA.addDeliveryAddress(factory, city,"Aldama", 178, nclient);
	
		DeliveryComp deliveryComp = new DeliveryComp(2);
		Integer delPackage = MDP.addDeliberypack(factory, deliveryComp, 119955);
	
		Deliverypack DP = new Deliverypack(delPackage);
		Integer pueOrder = MPO.addPurchaseOrder(factory, nclient, DP);
		POrder PO = new POrder(pueOrder);
		MAP.addArticlePOrder(factory, article, PO);
		
		POrder pOrder = new POrder();
		Integer billing = MB.addBilling(factory,"21j12", pOrder, 36.8);
		
		/* Data list*/
		MC.listClients(factory, client);
		MCC.listCreditCards(factory, creditcard);
		DA.listDelAdd(factory, deadd);
		MDP.listDelP(factory, delPackage);
		MPO.listPurchaseOrder(factory, pueOrder);
		MB.listBilling(factory, billing);
		
	}

}
