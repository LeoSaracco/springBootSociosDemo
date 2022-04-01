package ar.com.cdt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.cdt.entities.Socio;
import ar.com.cdt.repository.SocioRepository;

/**
 *
 * @author lsaracco
 */

@RestController
@RequestMapping("/socios")
public class SocioRestController {

	@Autowired
	SocioRepository socioRepository;

	@GetMapping()
	public List<Socio> list() {
		return socioRepository.findAll();
	}

	@GetMapping("/{id}")
	public Socio get(@PathVariable String id) {
		return null;
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> put(@PathVariable String id, @RequestBody Socio input) {
		return null;
	}

	@PostMapping
	public ResponseEntity<?> post(@RequestBody Socio input) {
		Socio save = socioRepository.save(input);
		return ResponseEntity.ok(save);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable String id) {
		return null;
	}

}
