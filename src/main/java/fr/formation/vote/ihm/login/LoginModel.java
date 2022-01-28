package fr.formation.vote.ihm.login;

public class LoginModel {
	private String login;
	private String password;
	private String message;

	public LoginModel() {
	}

	public LoginModel(String login, String password, String message) {
		super();
		this.login = login;
		this.password = password;
		this.message = message;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "LoginModel [login=" + login + ", password=" + password + ", message=" + message + "]";
	}

}
