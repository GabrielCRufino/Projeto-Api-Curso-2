package com.feira.projeto.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feira.projeto.domain.Barraca;
import com.feira.projeto.repositories.BarracaRepository;

@Service
public class BarracaService {
	
	@Autowired
	private BarracaRepository repo;
	
	public Barraca find(Integer id) {
		Optional<Barraca> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
