package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.demo.modelo.persona;
import com.example.demo.repository.PersonaRepository;

@Service
public class PersonaService{

	@Autowired
	private PersonaRepository personaRepository;
	
	
	public List<persona> findAll() {
		return personaRepository.findAll();
	}

	
	public List<persona> findAll(Sort sort) {
		return personaRepository.findAll(sort);
	}
	
	public List<persona> finById(Long id){
		return null;
	}
	
	public persona getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends persona> S save(S entity) {
		// TODO Auto-generated method stub
		return personaRepository.save(entity);
	}

	
	public void deleteById(Long id) {
		personaRepository.deleteById(id);
		
	}


	
}
