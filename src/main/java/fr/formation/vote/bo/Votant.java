package fr.formation.vote.bo;

import java.time.LocalDate;

public class Votant {
	private String nom;
	private String prenom;
	private LocalDate ddn;

	public Votant() {
	}

	public Votant(String nom, String prenom, LocalDate ddn) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.ddn = ddn;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDdn() {
		return ddn;
	}

	public void setDdn(LocalDate ddn) {
		this.ddn = ddn;
	}

	@Override
	public String toString() {
		return "Votant [nom=" + nom + ", prenom=" + prenom + ", ddn=" + ddn + "]";
	}

}
