package br.edu.unifeso.gymapi.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "series")
public class Series {

	@Id
	private String id;

	private String desc;

	private String idPerson;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(String idPerson) {
		this.idPerson = idPerson;
	}
}
