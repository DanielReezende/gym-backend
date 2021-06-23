package br.edu.unifeso.gymapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unifeso.gymapi.daos.ExerciseDao;
import br.edu.unifeso.gymapi.models.Exercise;

@Service
public class ExerciseService {

	@Autowired
	private ExerciseDao dao;

	public Exercise create(final Exercise exercise) {
		return this.dao.save(exercise);
	}

	public void delete(final Exercise exercise) {
		this.dao.delete(exercise);
	}

	public List<Exercise> list() {
		return this.dao.findAll();
	}

	public Exercise update(final Exercise exercise) {
		return this.dao.save(exercise);
	}
}
