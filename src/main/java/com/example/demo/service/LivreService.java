package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.LivreRepository;
import com.example.demo.entities.Livre;

@RestController
public class LivreService {
	@Autowired 
	private LivreRepository livreRepository ; 
	@RequestMapping(value="/livres" , method=RequestMethod.GET)
	public List<Livre> getLivres(){
		return livreRepository.findAll();
	}
	@RequestMapping(value="/livres/{id}" , method=RequestMethod.GET)
	public Livre getLivre(@PathVariable Long id){
		return livreRepository.findById(id).orElse(null);
	}
	@RequestMapping(value="/livres" , method=RequestMethod.POST)
	public Livre save(@RequestBody Livre L){
		return livreRepository.save(L);
	}
	@RequestMapping(value="/livres/{id}" , method=RequestMethod.DELETE)
	public boolean supprimerLivre(@PathVariable Long id){
		livreRepository.deleteById(id);
		return true ;
	}
	@RequestMapping(value="/livres/{id}" , method=RequestMethod.PUT)
	public Livre save(@PathVariable Long id,@RequestBody Livre L){
		L.setId(id);
		
		return livreRepository.save(L) ;
	}
	
	

}
