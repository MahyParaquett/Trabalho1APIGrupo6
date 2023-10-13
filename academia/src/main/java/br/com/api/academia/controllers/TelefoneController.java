package br.com.api.academia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.academia.entities.Telefone;
import br.com.api.academia.services.TelefoneService;

@RestController
@RequestMapping ("/telefones")
public class TelefoneController {
	
	@Autowired
	TelefoneService telefoneService;

	@GetMapping
	public ResponseEntity<List<Telefone>> listarTelefonees() {
		return new ResponseEntity<>(telefoneService.listarTelefonees(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Telefone> buscarPorId(@PathVariable Integer id) {
		Telefone telefone = telefoneService.buscarTelefonePorId(id);

		if (telefone == null)
			return new ResponseEntity<>(telefone, HttpStatus.NOT_FOUND);

		else
			return new ResponseEntity<>(telefone, HttpStatus.OK);
	}

	@GetMapping("/porid")
	public ResponseEntity<Telefone> buscarTelefonePorId(@RequestParam Integer id) {
		return new ResponseEntity<>(telefoneService.buscarTelefonePorId(id), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Telefone> salvarTelefone(@RequestBody Telefone telefone) {
		return new ResponseEntity<>(telefoneService.salvarTelefone(telefone), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Telefone> atualizar(@RequestBody Telefone telefone) {
		return new ResponseEntity<>(telefoneService.atualizarTelefone(telefone), HttpStatus.OK);
	}

	@DeleteMapping
	public ResponseEntity<String> deletarTelefone(@RequestBody Telefone telefone) {
		if (telefoneService.deletarTelefone(telefone))
			return new ResponseEntity<>("Deletado com Sucesso", HttpStatus.OK);

		else
			return new ResponseEntity<>("Não foi possível deletar", HttpStatus.BAD_REQUEST);
	}

}
