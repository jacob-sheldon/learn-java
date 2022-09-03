package com.codejacob.springbootdemo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceController {
	private static Map<String, Product> res = new HashMap<>();
	static {
		Product p1 = new Product();
		p1.setName("Honey");
		p1.setPrice("1.23");
		res.put(p1.getName(), p1);
		Product p2 = new Product();
		p2.setName("Almond");
		p2.setPrice("1.23");
		res.put(p2.getName(), p2);
	}
	
	
	@RequestMapping("/products")
	public ResponseEntity<Object> getProducts(@RequestParam(value = "name", defaultValue = "abc", required = false) String name) {
		System.out.println("get products called");
		return new ResponseEntity<>(res.values(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Object> changeProduct(@PathVariable("id") long id) {
		throw new ProductNotFoundException();
	}
}
