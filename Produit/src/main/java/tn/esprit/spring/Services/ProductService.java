package tn.esprit.spring.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.Entities.Product;
import tn.esprit.spring.Repositories.ProductRepository;
@Service
public class ProductService {	
	@Autowired
	private ProductRepository productRepository;

	public Product addProduct(Product product) {
		return productRepository.save(product);
	}
	
	public Product updateProduct(int id, Product newProduct) {
		if (productRepository.findById(id).isPresent()) {
			Product existingProduct = productRepository.findById(id).get();
			existingProduct.setNom(newProduct.getNom());
			existingProduct.setPrix(newProduct.getPrix());
			

			return productRepository.save(existingProduct);
		} else
			return null;
	}
	
	public String deleteProduct(int id) {
		if (productRepository.findById(id).isPresent()) {
			productRepository.deleteById(id);
			return "produit supprimé";
		} else
			return "produit non supprimé";
	}
}
