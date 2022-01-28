package fr.formation.vote.dal;

import java.util.ArrayList;
import java.util.List;

import fr.formation.vote.bo.Votant;

public class VotantDAO {
	private static List<Votant> lstVotants = new ArrayList<>();

	public static void insert(Votant votant) {
		lstVotants.add(votant);
	}
	
	public static List<Votant> getAll(){
		return lstVotants;
	}
	
}
