package br.com.api.academia.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.academia.entities.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Integer> {

}
