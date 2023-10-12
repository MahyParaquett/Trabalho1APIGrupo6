package br.com.api.academia.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "turma" )
public class Turma {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nome_disciplina")
	private Integer nomeDisciplina;
	
	@Column(name = "dia_semana")
	private String diaSemana;
	
	
	@ManyToOne
	@JoinColumn(name = "idinstrutor",referencedColumnName = "idinstrutor")
	private Instrutor instrutor;
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(Integer nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

	
	
}