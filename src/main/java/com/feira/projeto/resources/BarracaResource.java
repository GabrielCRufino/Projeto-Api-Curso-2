package com.feira.projeto.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/barraca")
public class BarracaResource {

	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST (barraca) está funcionando";
	}
	
}



