package com.example.demo.rest;

import java.net.URI;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.persona;
import com.example.demo.service.PersonaService;

@RestController
@RequestMapping(value= "/persona/")
public class PersonaRest {

	@Autowired
	private PersonaService personaService;
	
	@GetMapping
	private ResponseEntity<List<persona>> AllPersona (){
		return ResponseEntity.ok(personaService.findAll());
	}
	

	
	@PostMapping
	private ResponseEntity<persona> registrar(@RequestBody persona per){
		
		try {
			
			persona personaguardada = personaService.save(per);
			return ResponseEntity.created(new URI("/persona/" + personaguardada.getID())).body(personaguardada);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping(value = "delete/{id}")
	private ResponseEntity<Boolean> eliminar(@PathVariable("id") Long id){
		personaService.deleteById(id);
		return ResponseEntity.ok(!(personaService.finById(id)!=null));
		
	}
	
}
