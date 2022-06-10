package apolis.Day14Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationDriver {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(apolis.Day14Annotations.ApplicationConfig.class);
		
		System.out.println("Printing out 2 beans from the configuration class:");
		Student stud = (Student) context.getBean("student1");
		System.out.println(stud);
		Student stud2 = (Student) context.getBean("student2");
		System.out.println(stud2);
		
		System.out.println("Printing out a bean configured in it's own class file, with autowired dependency injection:");
		Teacher teach = (Teacher) context.getBean("jon");
		System.out.println(teach);
		
		System.out.println("Printing out a bean configured in it's own class file, with autowired dependency injection:");
		Classroom cr = (Classroom) context.getBean("classroom");
		System.out.println(cr);

	}

}
