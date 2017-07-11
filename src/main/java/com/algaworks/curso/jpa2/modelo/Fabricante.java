package com.algaworks.curso.jpa2.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fabricante {

	// posso declarar o id em cima do atributo ou em cima do get referente a ele.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigo;
	private String nome;
	
	/* esta é outra maneira de declarar o incremento do atributo
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	*/
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
