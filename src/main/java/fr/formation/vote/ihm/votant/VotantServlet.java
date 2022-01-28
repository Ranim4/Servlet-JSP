package fr.formation.vote.ihm.votant;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.vote.bll.VotantManager;
import fr.formation.vote.bo.Votant;

/**
 * Servlet implementation class VotantServlet
 */
@WebServlet("/VotantServlet")
public class VotantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public VotantServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		VotantModel model = new VotantModel();

		// vérification s'il est logué
		if (request.getSession().getAttribute("login") == null) {
			request.getRequestDispatcher("LoginServlet").forward(request, response);
		} else {
			if (request.getParameter("envoie") != null) {
				String nom = request.getParameter("nom");
				String prenom = request.getParameter("prenom");
				LocalDate ddn = LocalDate.parse(request.getParameter("ddn"));

				// appel au métier (BLL)
				Votant votant = new Votant(nom, prenom, ddn);
				model.setCurrent(votant);
				if (VotantManager.isAllowed(votant)) {
					model.setReponse("Peut voter !");
				} else {
					model.setReponse("Ne peut pas voter !");
				}
			}
			model.setListe(VotantManager.getAllVotant());

			request.setAttribute("model", model);
			request.getRequestDispatcher("WEB-INF/votant.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
