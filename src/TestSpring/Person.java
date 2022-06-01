package TestSpring;

import org.springframework.stereotype.Component;


public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("name setter");
		this.name = name;
	}
}
