package com.example.agenda.dtos;

import java.util.ArrayList;
import java.util.List;

import com.example.agenda.entities.Contato;
import com.example.agenda.entities.Email;
import com.example.agenda.entities.EmailTipo;

public class EmailDto {

	public EmailDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmailDto(String email, EmailTipo tipo, Contato contatoDono) {
		super();
		this.email = email;
		this.tipo = tipo;

	}
	public EmailDto(Email email) {
		super();
		this.email = email.getEmail();
		this.tipo = email.getTipo();

	}
	private String email;

	private EmailTipo tipo;


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public EmailTipo getTipo() {
		return tipo;
	}
	public void setTipo(EmailTipo tipo) {
		this.tipo = tipo;
	}
	
	public static List<EmailDto> converte(List<Email> emails){
		List<EmailDto> emailDtoList = new ArrayList<>();
		for(Email item: emails) {
			emailDtoList.add(new EmailDto(item));
		}
		return emailDtoList;
	}

} 
