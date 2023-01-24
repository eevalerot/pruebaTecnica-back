package com.famisanarPrueba.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.famisanarPrueba.implement.ConsultaImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/busquedaCategoria")
public class ConsultarApi {
	
	@Autowired
	private ConsultaImpl consultaImpl;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping(value = "/{idCat}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getListBook(@PathVariable int idCat) {

		try {
			return ResponseEntity.ok(this.consultaImpl.findByLibros(idCat));
		} catch (Exception e) {
			e.getStackTrace();
		}
			return new ResponseEntity("no hay registros", HttpStatus.BAD_REQUEST);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping(value = "categories", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getListCategories() {

		try {
			return ResponseEntity.ok(this.consultaImpl.listCategories());
		} catch (Exception e) {
			e.getStackTrace();
		}
			return new ResponseEntity("no hay registros", HttpStatus.BAD_REQUEST);
	}

}
