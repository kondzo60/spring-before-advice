package pl.bal.konrad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		CustomerRepository bean = context.getBean("customerRepository", CustomerRepository.class);
		System.out.println(bean.getCustomername(34L));
		System.out.println(bean.getCustomer(34L));
	}

}
