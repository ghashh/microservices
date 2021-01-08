package com.esprit.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/livraisons")
public class LivraisonRestAPI {

	private String title="Hello , livraison";
	
    @Autowired
	private LivraisonService livraisonService;
	
	
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println(title);
		
		return title;
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Livraison> createLivraison(@RequestBody Livraison livraison) {
		return new ResponseEntity<>(livraisonService.addLivraison(livraison), HttpStatus.OK);
	}
	
	
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Livraison> updateLivraison(@PathVariable(value = "id") int id,
    										@RequestBody Livraison livraison){
		return new ResponseEntity<>(livraisonService.updatelivraison(id,livraison), HttpStatus.OK);
	}
	
	
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteLivraison(@PathVariable(value = "id") int id){
		return new ResponseEntity<>(livraisonService.deleteLivraison(id), HttpStatus.OK);
	}

}
