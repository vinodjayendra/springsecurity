package net.codejava.spring;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/eod")
public class MainController {

	@GetMapping(path = "/simplepage", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String visitHomeJson() {
		return "vinod";
	}
	
	@RequestMapping(value="/adminjson", method = RequestMethod.GET)
	public String visitAdminJson() {
		return "vinod";
	}
}
