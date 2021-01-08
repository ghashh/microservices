package com.esprit.microservice;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LivraisonRepository extends JpaRepository<Livraison, Integer> {
	@Query("select c from Livraison c where c.nomclient like :nom")
	public Page<Livraison> LivraisonBynomclient(@Param("nom") String n, Pageable pageable);
}

