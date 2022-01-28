package fr.formation.vote.ihm.votant;

import java.time.LocalDate;

import fr.formation.vote.bll.VotantManager;
import fr.formation.vote.bo.Votant;

public class VotantTest {

	public static void main(String[] args) {
		System.out.println(VotantManager.isAllowed(new Votant("Cérien", "Jean", LocalDate.now().minusYears(25))));
		System.out.println(VotantManager.isAllowed(new Votant("Tropjeune", "Jessy", LocalDate.now().minusYears(13))));
		System.out.println(VotantManager.getAllVotant());
	}

}
