package com.httpentityexample.controller;



import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {
	
	@RequestMapping("test")
	public ResponseEntity<String> handleRequest(RequestEntity<String> requestEntity) {
		System.out.println("request body: "+requestEntity.getBody());
		HttpHeaders headers = requestEntity.getHeaders();
		HttpMethod method = requestEntity.getMethod();
		System.out.println("request headers :"+headers);
		System.out.println("request method :"+method);
		System.out.println("request url: "+requestEntity.getUrl());
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("my response body ", HttpStatus.OK);
		return responseEntity;
	}
	
	@RequestMapping("testpost")
	public ResponseEntity<String> handleRequestToTestPost(RequestEntity<String> requestEntity) {
		System.out.println("request body: "+requestEntity.getBody());
		HttpHeaders headers = requestEntity.getHeaders();
		HttpMethod method = requestEntity.getMethod();
		System.out.println("request headers :"+headers);
		System.out.println("request method :"+method);
		System.out.println("request url: "+requestEntity.getUrl());
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("my response body ", HttpStatus.OK);
		return responseEntity;
	}
}
