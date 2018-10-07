package org.kishor.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle=(Triangle)context.getBean("triangle");
		triangle.draw();
		((AbstractApplicationContext)context).registerShutdownHook(); // will close all the beans before closing context
		Restaurant restaurant1 = (Restaurant)context.getBean("restaurant");
		restaurant1.prepareHotDrink();
		restaurant1.displayRestaurantWaitersList();
		restaurant1.setWelcomeNote("Object1 is setting welcome note property");
		restaurant1.greetCustomer();
		
		Restaurant restaurant2 = (Restaurant)context.getBean("restaurant");
		restaurant2.greetCustomer();
		//((ConfigurableApplicationContext)context).close();   // close the application context
	}

}
