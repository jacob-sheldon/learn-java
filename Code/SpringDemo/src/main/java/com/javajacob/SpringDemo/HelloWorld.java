package com.javajacob.SpringDemo;


// implements InitializingBean, DisposableBean
public class HelloWorld {
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("Bean Initialize");
//	}
//	
//	@Override
//	public void destroy() throws Exception {
//		System.out.println("destroy called");
//	}
	
	void init() {
		System.out.println("init called");
	}
	
	void destroy() {
		System.out.println("destroy called");
	}
}
