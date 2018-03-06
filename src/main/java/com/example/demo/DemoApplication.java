package com.example.demo;

import com.interfaces.Robot;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.*;

public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");



//		Robot mimicriesPolyAlloy = (Robot)context.getBean("MimicriesPolyAlloy");
//		mimicriesPolyAlloy.printMe();

//		Robot t1000 = (Robot) context.getBean("T1000");
//		t1000 .printMe();

//		System.out.println(mimicriesPolyAlloy.toString());
//		mimicriesPolyAlloy = (Robot)context.getBean("MimicriesPolyAlloy");
//		System.out.println(mimicriesPolyAlloy.toString());

	}
}
