package com.example.agenda.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.agenda.entities.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{

	public Contato findById(int i);
	public List<Contato> findByNomeContaining(String nome);
	public boolean existsById(int i);
	public Contato findById(long id);

}
