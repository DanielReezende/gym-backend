package br.edu.unifeso.gymapi.daos;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.unifeso.gymapi.models.Series;

public interface SeriesDao extends MongoRepository<Series, String> {

}
