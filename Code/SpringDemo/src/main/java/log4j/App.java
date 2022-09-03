package log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	static Logger log = LogManager.getLogger();
	
	public static void main(String[] args) {
		System.out.println("Hello, Log4J");
		
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		log.info("Going to create HelloWorld Obj");
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		helloWorld.getMessage();
		
		log.info("Exiting the program");
	}
}
