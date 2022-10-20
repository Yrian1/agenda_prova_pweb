package com.example.agenda.dtos;

import java.util.ArrayList;
import java.util.List;

import com.example.agenda.entities.Contato;
import com.example.agenda.entities.Telefone;
import com.example.agenda.entities.TelefoneTipo;

public class TelefoneDto {
	public TelefoneDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TelefoneDto(long numero, TelefoneTipo tipo, Contato contatoDono) {
		super();
		this.numero = numero;
		this.tipo = tipo;
	}
	public TelefoneDto(Telefone telefone) {
		super();
		this.numero = telefone.getNumero();
		this.tipo = telefone.getTipo();

	}
	private long numero;

	private TelefoneTipo tipo;

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
	
	public static List<TelefoneDto> converte(List<Telefone> telefones){
		List<TelefoneDto> telefoneDto = new ArrayList<>();
		for(Telefone item: telefones) {
			telefoneDto.add(new TelefoneDto(item));
		}
		return telefoneDto;
	}
	

}