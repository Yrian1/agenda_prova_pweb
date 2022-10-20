package com.example.agenda.controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.agenda.dtos.ContatoDto;
import com.example.agenda.entities.Contato;
import com.example.agenda.repositories.ContatoRepository;

@RestController
@RequestMapping("/contacts")
public class ContactsControllers{

	@Autowired
	ContatoRepository contatoRepository;
	
	@GetMapping
	@RequestMapping("")
	public List<ContatoDto> retornaContato(){
		return ContatoDto.converte(contatoRepository.findAll());
		
	}
	@GetMapping
	@RequestMapping("/10")
	public ContatoDto contato10(UriComponentsBuilder uriBuilder){
		ContatoDto contatoDto = new ContatoDto(contatoRepository.findById(10));
		
		
		return contatoDto;
	
	}
	
	@PostMapping
	public ResponseEntity<ContatoDto> addContact(@RequestBody ContatoDto contatoDto, UriComponentsBuilder uriBuilder){
		Contato contato = new Contato(contatoDto);
		
		contatoRepository.save(contato);
		URI uri=uriBuilder.path("/contacts/{id}").buildAndExpand(contato.getId()).toUri(); 
		return ResponseEntity.created(uri).body(new ContatoDto(contato));

	}
	
	@GetMapping
	@RequestMapping("/paulo")
	public List<ContatoDto> contatoPaulo(){
		List<ContatoDto> contatoDto = ContatoDto.converte(contatoRepository.findByNomeContaining("paulo"));
		
		
		return contatoDto;
		
	}
}

