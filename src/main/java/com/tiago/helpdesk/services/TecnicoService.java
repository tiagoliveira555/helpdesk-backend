package com.tiago.helpdesk.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiago.helpdesk.domain.Tecnico;
import com.tiago.helpdesk.repositories.TecnicoRepository;

@Service
public class TecnicoService {
	
	@Autowired
	private TecnicoRepository repository;

	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElse(null);
	}
}
