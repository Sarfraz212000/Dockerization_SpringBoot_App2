package in.saffu.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestcontroller {
	
	@GetMapping("welcome")
	public String welcomeMsg() {
		return "WELCOME TO BIHAR..";	
	}

}
