package com.example.demo;

import com.interfaces.Robot;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {
	public static void main(String[] args) {
        ConfigurableApplicationContext  context = new ClassPathXmlApplicationContext("context.xml");

		Robot mimicriesPolyAlloy = (Robot)context.getBean("MimicriesPolyAlloy");
		mimicriesPolyAlloy.printMe();

		Robot t1000 = (Robot) context.getBean("T1000");
		t1000 .printMe();

		System.out.println(mimicriesPolyAlloy.toString());
		mimicriesPolyAlloy = (Robot)context.getBean("MimicriesPolyAlloy");
		System.out.println(mimicriesPolyAlloy.toString());

        context.close();
	}
}
