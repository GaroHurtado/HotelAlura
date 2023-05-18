package Models;

public class RegistroHuesped {
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private String nacionalidad;
	private String numTelefono;
	
	public RegistroHuesped(String nombre, String apellido, String fechaNacimiento, String nacionalidad,
			String numTelefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.numTelefono = numTelefono;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public String getNumTelefono() {
		return numTelefono;
	}
	
	
	
	
	
}
