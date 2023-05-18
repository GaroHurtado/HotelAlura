package Models;


public class Reserva {
	private String fechaEntrada;
	private String fechaSalida;
	private int valor;
	private String formaPago;
	private int idReserva;
	
	
	
	
	public Reserva(String string, String string2, int valor, String formaPago, int idReserva) {
		this.fechaEntrada = string;
		this.fechaSalida = string2;
		this.valor = valor;
		this.formaPago = formaPago;
		this.idReserva = idReserva;
	}
	
	public Reserva() {
	}

	public String getFechaEntrada() {
		return fechaEntrada;
	}
	public String getFechaSalida() {
		return fechaSalida;
	}
	public int getValor() {
		return valor;
	}
	public String getFormaPago() {
		return formaPago;
	}

	public int getIdReserva() {
		return idReserva;
	}
	
	
	
	
}
