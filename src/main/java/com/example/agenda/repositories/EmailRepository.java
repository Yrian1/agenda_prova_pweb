package com.example.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.agenda.entities.Email;

public interface EmailRepository extends JpaRepository<Email, String>{

}
