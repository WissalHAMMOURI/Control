package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Livre implements Serializable{
	@Id @GeneratedValue
	private Long Id ; 
	
	private String Titre ;
	@Column(nullable = false, updatable = false)
	private String MaisonEdition;
	@Temporal(TemporalType.DATE)
	private Date DateDeSortie ; 
	private String Auteur ; 
	private int NbrPage ; 
	private String ISBN ; 
	private Date DateConsult;
	private boolean Attr;
	
	
	public String getTitre() {
		return Titre;
	}
	public void setTitre(String titre) {
		Titre = titre;
	}
	public String getMaisonEdition() {
		return MaisonEdition;
	}
	public void setMaisonEdition(String maisonEdition) {
		MaisonEdition = maisonEdition;
	}
	public Date getDateDeSortie() {
		return DateDeSortie;
	}
	public void setDateDeSortie(Date dateDeSortie) {
		DateDeSortie = dateDeSortie;
	}
	public String getAuteur() {
		return Auteur;
	}
	public void setAuteur(String auteur) {
		Auteur = auteur;
	}
	public int getNbrPage() {
		return NbrPage;
	}
	public void setNbrPage(int nbrPage) {
		NbrPage = nbrPage;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Date getDateConsult() {
		return DateConsult;
	}
	public void setDateConsult(Date dateConsult) {
		DateConsult = dateConsult;
	}
	public Livre( boolean attr,  String auteur, Date dateDeSortie,Date dateConsult,String iSBN,String maisonEdition,int nbrPage,  String titre
			) {
		super();
		Attr = attr;
		Auteur = auteur;
		DateDeSortie = dateDeSortie;
		DateConsult = dateConsult;
		ISBN = iSBN;
		MaisonEdition = maisonEdition;
		Titre = titre;	
		NbrPage = nbrPage;
		
		
		
	}
	public boolean isAttr() {
		return Attr;
	}
	public void setAttr(boolean attr) {
		Attr = attr;
	}
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
		Id=id;
	}
	

}
