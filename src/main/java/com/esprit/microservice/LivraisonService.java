package com.esprit.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LivraisonService {
	@Autowired
	private LivraisonRepository livraisonRepository;

	public Livraison addLivraison(Livraison livraison) {
		return livraisonRepository.save(livraison);
	}
	
	public Livraison updatelivraison(int id, Livraison newLivraison) {
		if (livraisonRepository.findById(id).isPresent()) {
			Livraison existingLivraison = livraisonRepository.findById(id).get();
			existingLivraison.setNomchauffeur(newLivraison.getNomchauffeur());
			existingLivraison.setEtat(newLivraison.getEtat());

			return livraisonRepository.save(existingLivraison);
		} else
			return null;
	}
	
	public String deleteLivraison(int id) {
		if (livraisonRepository.findById(id).isPresent()) {
			livraisonRepository.deleteById(id);
			return "livraison supprimé";
		} else
			return "livraison non supprimé";
	}

}
