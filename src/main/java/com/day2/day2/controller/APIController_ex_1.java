package com.day2.day2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController_ex_1 {
	@Value("${varname}")
	private String name;
	@GetMapping("day")
	public String display() {
		return name;
}
}
