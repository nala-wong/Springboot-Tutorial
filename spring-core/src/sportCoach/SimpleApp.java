package sportCoach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BasketballCoach bCoach = context.getBean(null, null);
		
	}

}
