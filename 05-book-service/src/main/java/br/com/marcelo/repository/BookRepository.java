package br.com.marcelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marcelo.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {}
