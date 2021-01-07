package net.tecgurus.minipos.security.response;

public class JwtResponse {
	
	private String token;
	private String perfil;
	
	public JwtResponse(String token, String perfil) {
		this.token = token;
		this.perfil = perfil;
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
	

}
