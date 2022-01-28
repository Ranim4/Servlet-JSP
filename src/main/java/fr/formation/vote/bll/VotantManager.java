package fr.formation.vote.bll;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import fr.formation.vote.bo.Votant;
import fr.formation.vote.dal.VotantDAO;

public class VotantManager {
	public static boolean isAllowed(Votant votant) {
		boolean result = false;
		
		LocalDate now = LocalDate.now();
		
		Integer age = Period.between(votant.getDdn(), now).getYears();
		if(age>18) {
			result = true;
			VotantDAO.insert(votant);
		}
		
		return result;
	}
	
	public static List<Votant> getAllVotant(){
		return VotantDAO.getAll();
	}
}
