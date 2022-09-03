package log4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
class HelloWorld {
	private String message;
	
	public HelloWorld(@Value("${hello.message}") String message) {
		super();
		this.message = message;
	}

	public void getMessage() {
		System.out.println("HelloWorld Message : " + message);
	}
}
