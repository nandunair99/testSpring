package TestSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student student1=(Student)context.getBean("studentBean");
		System.out.println(student1.getPerson().getName()+" ---"+student1.getCourse() );
		
	}
	
}
