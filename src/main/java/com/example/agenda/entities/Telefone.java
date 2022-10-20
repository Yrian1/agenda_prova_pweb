package com.example.agenda.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "telefones")
public class Telefone {
	@Id
	private long numero;
	@Enumerated(EnumType.STRING)
	private TelefoneTipo tipo;
	@ManyToOne 
	private Contato contatoDono;
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public TelefoneTipo getTipo() {
		return tipo;
	}
	public void setTipo(TelefoneTipo tipo) {
		this.tipo = tipo;
	}
	public Contato getContatoDono() {
		return contatoDono;
	}
	public void setContatoDono(Contato contatoDono) {
		this.contatoDono = contatoDono;
	}
	
	
	
}
