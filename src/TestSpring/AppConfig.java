package TestSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "TestSpring")
public class AppConfig {
	
	@Bean
	public String courseBean()
	{
		return "MCA";
	}
	@Bean
	public Student studentBean()
	{
		return new Student(personBean());
	}
	@Bean
	public Person personBean()
	{
		Person person =new Person();
		person.setName("nandu");
		return person;
	}
	
}
