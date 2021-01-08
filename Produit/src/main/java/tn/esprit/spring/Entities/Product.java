package tn.esprit.spring.Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 795450928237931201L;
	
	@Id
	@GeneratedValue
	private int id;
	private int prix;
	private String nom;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String nom, int prix) {
		super();
		this.nom = nom;
		this.prix = prix;
		
	}
	
	

}

