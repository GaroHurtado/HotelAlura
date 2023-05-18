package Models;

public class Busqueda {
	private Integer id;
	private String fechaEntrada;
	private String fechaSalida;
	private Integer valor;
	private String formaPago;
	
	
	public Busqueda(Integer id, String fechaEntrada, String fechaSalida, Integer valor, String formaPago) {
		this.id = id;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.valor = valor;
		this.formaPago = formaPago;
	}


	public Busqueda(int id) {
		this.id = id;
	}


	public Integer getId() {
		return id;
	}


	public String getFechaEntrada() {
		return fechaEntrada;
	}


	public String getFechaSalida() {
		return fechaSalida;
	}


	public Integer getValor() {
		return valor;
	}


	public String getFormaPago() {
		return formaPago;
	}
	
	@Override
	public String toString(){
		return String.format("%d, %s, %s, %d, %s",
				this.id, this.fechaEntrada, this.fechaSalida, this.valor, this.formaPago);
	}
	
	
}
