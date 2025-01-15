package com.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudnetControllerNew {

	@GetMapping("/get")
	public String get()
	{
		return "String value";
	}
}
