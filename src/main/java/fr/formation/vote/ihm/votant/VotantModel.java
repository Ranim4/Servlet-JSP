package fr.formation.vote.ihm.votant;

import java.util.ArrayList;
import java.util.List;

import fr.formation.vote.bo.Votant;

public class VotantModel {
	private Votant current = new Votant();
	private String reponse = "";
	private List<Votant> liste = new ArrayList<>();

	public VotantModel() {
	}

	public VotantModel(Votant current, String reponse, List<Votant> liste) {
		super();
		this.current = current;
		this.reponse = reponse;
		this.liste = liste;
	}

	public Votant getCurrent() {
		return current;
	}

	public void setCurrent(Votant current) {
		this.current = current;
	}

	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	public List<Votant> getListe() {
		return liste;
	}

	public void setListe(List<Votant> liste) {
		this.liste = liste;
	}

	@Override
	public String toString() {
		return "VotantModel [current=" + current + ", reponse=" + reponse + ", liste=" + liste + "]";
	}

}
