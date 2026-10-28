package com.zomato.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zomato.entity.ZomatoEntites;
import com.zomato.request.ZomatoRequest;
import com.zomato.service.ZomatoService;

@RestController
@RequestMapping("zomato")
public class ZomataController {

	@Autowired
	ZomatoService service;

	@PostMapping("done")
	public int createMethod(@RequestBody ZomatoRequest request) {
		int details = service.addDetails(request);

		return details;

	}

	@GetMapping("/ids/{id}")
	public Optional<ZomatoEntites> getById(@PathVariable("id") Integer iteamID) {
		Optional<ZomatoEntites> byID = service.findByID(iteamID);
		return byID;

	}

	@PutMapping("/update/{id}")

	public String putMethod(@PathVariable("id") Integer ids, @RequestBody ZomatoRequest request) {
		return service.updateData(ids, request);

	}
}
