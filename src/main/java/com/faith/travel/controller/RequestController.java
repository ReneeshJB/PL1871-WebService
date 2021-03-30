package com.faith.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.travel.entity.Project;
import com.faith.travel.entity.Request;
import com.faith.travel.service.IProjectService;
import com.faith.travel.service.IRequestService;

@CrossOrigin
@RestController
@RequestMapping("api")
public class RequestController {

	@Autowired
	private IRequestService requestService;

	@Autowired
	private IProjectService projectService;

	@GetMapping("requests")
	public List<Request> findAllUsers() {
		return requestService.findAllRequests();
	}

	@GetMapping("projects")
	public List<Project> findAllProjects() {
		return projectService.findAll();
	}

	@PostMapping("requests/add")
	public ResponseEntity<Request> insertUser(@RequestBody Request request) {
		System.out.println("inserting");

		return new ResponseEntity<Request>(requestService.insertRequest(request), HttpStatus.OK);
	}

	@PutMapping("requests/update")
	public Request updateUser(@RequestBody Request request) {

		requestService.updateRequest(request);
		return request;
	}

}
