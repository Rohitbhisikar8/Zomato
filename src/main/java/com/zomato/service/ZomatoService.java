package com.zomato.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomato.entity.ZomatoEntites;
import com.zomato.repository.ZomatoRepository;
import com.zomato.request.ZomatoRequest;

@Service
public class ZomatoService {
	@Autowired
	ZomatoRepository repository;

	public int addDetails(ZomatoRequest request) {

		ZomatoEntites entites = new ZomatoEntites();

		entites.setItamName(request.getItamName());
		entites.setQty(request.getQty());
		entites.setDescription(request.getDescription());
		entites.setPrice(request.getPrice());
		ZomatoEntites entites2 = repository.save(entites);
		return entites.getIteamID();

	}

	public Optional<ZomatoEntites> findByID(Integer id) {
		return repository.findById(id);

	}

	public String updateData(Integer id, ZomatoRequest request) {
		ZomatoEntites or = repository.findById(id).orElseThrow();
		or.setDescription(request.getDescription());

		return "Updated";

	}
}
