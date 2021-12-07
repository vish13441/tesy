package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.service;

@RestController
@RequestMapping("/company")



public class controller {
	
	@Autowired
	private service service1;
	
	
	@GetMapping("/employees")
	public String getdata() {
		String a = null;
		return a = service1.getdata();
	}


		@GetMapping("/employees1")
		public String getdata2() {
			String a = null;
			return a = service1.getdata();
		}

    @GetMapping("/employees2")
    public String getdata1() {
        String a=null;
        return a=service1.getdata();

		
	}
	

}
