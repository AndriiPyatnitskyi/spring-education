package com.example.demo;

import com.factory.RobotT1000Factory;
import com.interfaces.Robot;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        RobotT1000Factory robotT1000Factory = ((RobotT1000Factory) context.getBean("robotT1000Factory"));
        Robot robotT1000 = robotT1000Factory.createRobotT1000();
        robotT1000.printMe();
//        Robot robotT10001 = robotT1000Factory.createRobotT1000();
//        Robot robotT10002 = robotT1000Factory.createRobotT1000();
//        System.out.println(robotT1000.toString());
//        System.out.println(robotT10001.toString());
//        System.out.println(robotT10002.toString());
//		Robot mimicriesPolyAlloy = (Robot)context.getBean("MimicriesPolyAlloy");
//		mimicriesPolyAlloy.printMe();
//
//		Robot t1000 = (Robot) context.getBean("T1000");
//		t1000 .printMe();
//
//		System.out.println(mimicriesPolyAlloy.toString());
//		mimicriesPolyAlloy = (Robot)context.getBean("MimicriesPolyAlloy");
//		System.out.println(mimicriesPolyAlloy.toString());

        context.close();
    }
}
