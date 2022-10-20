package com.example.agenda.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "emails")
public class Email {
	@Id
	private String email;
	@Enumerated(EnumType.STRING)
	private EmailTipo tipo;
	@ManyToOne 
	private Contato contatoDono;
	public Contato getContatoDono() {
		return contatoDono;
	}
	public void setContatoDono(Contato contatoDono) {
		this.contatoDono = contatoDono;
	}
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

}
