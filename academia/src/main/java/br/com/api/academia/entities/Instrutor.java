package br.com.api.academia.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "instrutor" )
public class Instrutor {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idinstrutor")
	private Integer idInstrutor;
	
	@Column(name = "rg")
	private Long rg;
	
	@Column(name = "nome")
	private String nome;
	
	
	@OneToMany(mappedBy = "instrutor")
    private List<Turma>turmas;
	
	@OneToOne(mappedBy = "instrutor", cascade = CascadeType.ALL)
	private Telefone telefone;

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	public void setRg(Long rg) {
		this.rg = rg;
	}

	
	public Integer getIdInstrutor() {
		return idInstrutor;
	}

	public void setIdInstrutor(Integer idInstrutor) {
		this.idInstrutor = idInstrutor;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
