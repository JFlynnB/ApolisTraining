package com.apolis.Day15_June9;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringOrmImpApplication {

	public static void main(String[] args) {
		//ApplicationContext context = SpringApplication.run(SpringOrmImpApplication.class, args);
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/apolis/Day15_June9/context.xml");
		CarDAO table = (CarDAO) context.getBean("carDao");
		Car car1 = new Car(2004, "Toyota", "Matrix");
		table.saveCar(car1);
	}

}
