package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicazioneController {
	ApplicazioneController() {
	}

	@GetMapping(path = "/app", produces = MediaType.APPLICATION_JSON_VALUE)
	Persona getStringa() {
		Persona p = new Persona("rich", "prova");
		//
		return p;
	}
}
