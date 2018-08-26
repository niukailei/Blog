package org.blogEureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("rr")
	public void get() {
		System.out.println("0000000");
	}
}
