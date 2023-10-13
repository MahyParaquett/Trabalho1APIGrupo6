package br.com.api.academia.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "telefone" )
public class Telefone {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Integer idTelefone;
	
	@OneToOne
	@JoinColumn(name = "idinstrutor", referencedColumnName = "idinstrutor")
	private Instrutor instrutor;
	
	@Column(name = "numero")
	public Long numero;

	public Integer getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone(Integer idTelefone) {
		this.idTelefone = idTelefone;
	}


	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}
	
	

}
