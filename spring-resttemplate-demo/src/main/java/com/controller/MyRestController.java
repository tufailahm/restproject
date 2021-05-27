package com.controller;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ust.pms.model.Product;

@RestController
@RequestMapping("/anothermicroserviceproduct")
public class MyRestController {

	URI uri = URI.create("http://localhost:9090/getDataFromCloud");
	URI producturi = URI.create("http://localhost:8081/product");
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/hi")
	public ResponseEntity<String> hi() {
			ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
		return response;
	}
	
	@GetMapping
	public List<Product> pro() {
			ResponseEntity<Product[]> response = restTemplate.getForEntity(producturi, Product[].class);
		return Arrays.asList(response.getBody());
	}
	
	//restTemplate.postForEntity(uri,product)
	//restTemplate.put(uri,product)
	//restTemplate.delete(uri+productId);
}
