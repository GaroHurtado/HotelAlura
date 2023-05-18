package Models;

public class Registro {
	private String nombre;
	private String usuario;
	private String password;
	
	public Registro(String nombre, String usuario, char[] password) {
		
		this.nombre = nombre;
		this.usuario = usuario;
		this.password = String.valueOf(password);
	}

	public String getNombre() {
		return nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getPassword() {
		return password;
	}
	


}
