package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();	
		
		Transaction t=s.beginTransaction();

         Car c = new Car(101,"Honda Civic", "Sedan", 180, "Red", 4);

         Truck tr = new Truck(201,"Ford F150", "Pickup", 140, "Black", 2000);
         
         s.save(c);
         s.save(tr);
         
         t.commit();
 		
 		s.close();
 		
 		sf.close();

         
	}

}
