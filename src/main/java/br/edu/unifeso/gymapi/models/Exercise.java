package br.edu.unifeso.gymapi.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "exercises")
public class Exercise {

	@Id
	private String idExercicio;

	private String dsExercicio;

	private String idSerie;

	private Integer qtdRepeticoes;

	private Integer repeticoes;

	public String getIdExercicio() {
		return idExercicio;
	}

	public void setIdExercicio(String idExercicio) {
		this.idExercicio = idExercicio;
	}

	public String getDsExercicio() {
		return dsExercicio;
	}

	public void setDsExercicio(String dsExercicio) {
		this.dsExercicio = dsExercicio;
	}

	public String getIdSerie() {
		return idSerie;
	}

	public void setIdSerie(String idSerie) {
		this.idSerie = idSerie;
	}

	public Integer getQtdRepeticoes() {
		return qtdRepeticoes;
	}

	public void setQtdRepeticoes(Integer qtdRepeticoes) {
		this.qtdRepeticoes = qtdRepeticoes;
	}

	public Integer getRepeticoes() {
		return repeticoes;
	}

	public void setRepeticoes(Integer repeticoes) {
		this.repeticoes = repeticoes;
	}
}
