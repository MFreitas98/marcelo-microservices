package br.com.marcelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marcelo.model.Cambio;


public interface CambioRepository extends JpaRepository<Cambio, Long> {
   
	
	Cambio findByFromAndTo(String from, String to);
    	
}
