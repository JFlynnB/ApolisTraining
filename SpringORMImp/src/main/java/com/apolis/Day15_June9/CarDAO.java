package com.apolis.Day15_June9;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CarDAO {
	
	private SessionFactory factory;
	
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	public void saveCar(Car car) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(car);
		transaction.commit();
		session.close();
		System.out.println("Car inserted into table.");
	}

}
