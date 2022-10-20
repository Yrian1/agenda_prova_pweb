package com.example.agenda.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.agenda.dtos.ContatoDto;


@Entity(name = "contatos")
public class Contato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	@OneToMany(mappedBy = "contatoDono")
	private List<Telefone> telefones = new ArrayList<>();
	public Contato() {
		super();
		// TODO Auto-generated constructor stub
	}
	@OneToMany(mappedBy = "contatoDono")
	private List<Email> emails = new ArrayList<>();
	
	public Contato(ContatoDto contatoDto) {
		this.nome = contatoDto.getNome();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	public List<Email> getEmails() {
		return emails;
	}
	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}
	

}
