package br.edu.unifeso.gymapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unifeso.gymapi.daos.SeriesDao;
import br.edu.unifeso.gymapi.models.Series;

@Service
public class SeriesService {

	@Autowired
	private SeriesDao dao;

	public Series create(final Series series) {
		return this.dao.save(series);
	}

	public void delete(final Series series) {
		this.dao.delete(series);
	}

	public List<Series> list() {
		return this.dao.findAll();
	}

	public Series update(final Series series) {
		return this.dao.save(series);
	}
}
