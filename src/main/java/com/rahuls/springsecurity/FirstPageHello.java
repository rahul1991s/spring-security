package com.rahuls.springsecurity;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rahul S
 *
 */
@RestController
public class FirstPageHello {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	// @CrossOrigin(origins="http://localhost:4200")  
	@RequestMapping("/user")
	public String sayHello(@RequestParam(value = "name", defaultValue = "This is my Tutorial") String name) {
		return ("<h1>Welcome User</h1>");
	}
	@RequestMapping("/")
	public String welcome() {
		return ("<h1>Welcome All</h1>");
	}
	@RequestMapping("/admin")
	public String welcomeAdmin() {
		return ("<h1>Welcome Admin</h1>");
	}
}
