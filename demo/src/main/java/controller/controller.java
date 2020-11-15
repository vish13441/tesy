package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class controller {
	@GetMapping("/employees")
	public String getdata() {
		return "Hello world";
	}
	

}
