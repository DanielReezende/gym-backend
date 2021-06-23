package br.edu.unifeso.gymapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unifeso.gymapi.models.Series;
import br.edu.unifeso.gymapi.services.SeriesService;

@CrossOrigin("*")
@RestController
@RequestMapping("/series")
public class SeriesController {

	@Autowired
	private SeriesService seriesService;

	@PostMapping
	public Series create(@RequestBody final Series series) {
		return this.seriesService.create(series);
	}

	@DeleteMapping
	public void delete(@RequestBody final Series series) {
		this.seriesService.delete(series);
	}

	@GetMapping
	public List<Series> list() {
		return this.seriesService.list();
	}

	@PatchMapping
	public Series update(@RequestBody final Series series) {
		return this.seriesService.update(series);
	}
}
