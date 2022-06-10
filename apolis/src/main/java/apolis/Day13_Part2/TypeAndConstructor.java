package apolis.Day13_Part2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import apolis.Day13_June7.Car;

public class TypeAndConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"apolis/Day13_Part2/context.xml");
		
		
		//implementation of autowiring by type where there is more than one
		//candidate bean. Resolved by tagging autowire-candidate="false"
		Car myCar = (Car) context.getBean("myCar");
		System.out.println(myCar);
		
		//implementation of autowiring by constructor where there are two possible 
		//candidates, resolved by autowire-candidate tag
		Teacher mrNewton = (Teacher) context.getBean("teacher1");
		System.out.println(mrNewton);
		
		ClassRoom room101 = (ClassRoom) context.getBean("room101");
		System.out.println(room101);
		
		Detention bad = (Detention) context.getBean("thingIdid");
		System.out.println(bad);
	}

}
