package com.onesofts.hello;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/hello")
public class Hello {

	RestTemplate rt = new RestTemplate();

	@GetMapping(value = "/getHiViaHello")
	public String getHello() {
		String url = "http://localhost:8080/Hi";
		ResponseEntity<String> response = rt.exchange(url, HttpMethod.GET, null, String.class);
		String hi1 = response.getBody();
		return hi1;

	}

}
