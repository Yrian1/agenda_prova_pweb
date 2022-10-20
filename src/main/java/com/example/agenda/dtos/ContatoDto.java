package com.example.agenda.dtos;

import java.util.ArrayList;
import java.util.List;
import com.example.agenda.entities.Contato;

public class ContatoDto {
	
	private long id;
	private String nome;
	private List<TelefoneDto> telefonesDtos = new ArrayList<>();
	private List<EmailDto> emailsDtos = new ArrayList<>();
	
	public ContatoDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContatoDto(Contato contato) {
		super();
		this.id = contato.getId();
		this.nome = contato.getNome();
		this.telefonesDtos = TelefoneDto.converte(contato.getTelefones());
		this.emailsDtos = EmailDto.converte(contato.getEmails());
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
	public List<TelefoneDto> getTelefones() {
		return telefonesDtos;
	}
	public void setTelefones(List<TelefoneDto> telefones) {
		this.telefonesDtos = telefones;
	}
	public List<EmailDto> getEmails() {
		return emailsDtos;
	}
	public void setEmails(List<EmailDto> emails) {
		this.emailsDtos = emails;
	}
	
	public static List<ContatoDto> converte(List<Contato> contatos){
		List<ContatoDto> contatoDtoList = new ArrayList<>();
		for(Contato item: contatos) {
			contatoDtoList.add(new ContatoDto(item));
		}
		return contatoDtoList;
	}
	
	
}
