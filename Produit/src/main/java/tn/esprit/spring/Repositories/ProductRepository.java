package tn.esprit.spring.Repositories;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	@Query("select p from Product p where p.nom like :nom")
	public Page<Product> productByNom(@Param("nom") String n, Pageable pageable);
}



