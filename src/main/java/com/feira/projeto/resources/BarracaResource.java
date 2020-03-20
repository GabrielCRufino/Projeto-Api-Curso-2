package com.feira.projeto.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.feira.projeto.domain.Barraca;
import com.feira.projeto.services.BarracaService;

@RestController
@RequestMapping(value="/barraca")
public class BarracaResource {
	
	@Autowired
	private BarracaService service;

	@RequestMapping(value= "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Barraca obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
	
	
	
}



