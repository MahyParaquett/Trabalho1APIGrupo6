package br.com.api.academia.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.academia.entities.Instrutor;

public interface InstrutorRepository extends JpaRepository<Instrutor, Integer> {

}
