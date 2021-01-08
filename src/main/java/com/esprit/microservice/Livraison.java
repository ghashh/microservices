package com.esprit.microservice;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Livraison implements Serializable {
	private static final long serialVersionUID = 795450928237931201L;
	@Id
	@GeneratedValue
	private int id;
	private Date date;
	private String nomclient,nomchauffeur;
	private int numero;
	private int etat;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Livraison(Date date, String nomclient, String nomchauffeur, int numero, int etat) {
		super();
		this.date = date;
		this.nomclient = nomclient;
		this.nomchauffeur = nomchauffeur;
		this.numero = numero;
		this.etat = etat;
	}
	public Livraison(int id, Date date, String nomclient, String nomchauffeur, int numero, int etat) {
		super();
		this.id = id;
		this.date = date;
		this.nomclient = nomclient;
		this.nomchauffeur = nomchauffeur;
		this.numero = numero;
		this.etat = etat;
	}

	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomclient() {
		return nomclient;
	}
	public void setNomclient(String nomclient) {
		this.nomclient = nomclient;
	}
	public String getNomchauffeur() {
		return nomchauffeur;
	}
	public void setNomchauffeur(String nomchauffeur) {
		this.nomchauffeur = nomchauffeur;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Livraison() {
		super();
	}

	
	
}
