package Controllers;

import java.util.List;

import Dao.ReservasDao;

public class ReservasController {
	private String fechaOriginalEntrada;
	private String fechaOriginalSalida;
	private String[] Meses = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Agu","Sep","Nov","Dic"};
	private String me;
	private String ms;
	private Integer showId;
	private String diaE;
	private String diaS;
	public ReservasController() {
		
	}
	public ReservasController(String fechaEntrada, String fechaSalida) {
		this.fechaOriginalEntrada = fechaEntrada;
		this.fechaOriginalSalida = fechaSalida;
		
	}
	public String modificarFechaEntrada() {
		String year = fechaOriginalEntrada.substring(30);
		String mes= fechaOriginalEntrada.substring(4, 7);
		modifcarMesEntrada(mes);
		diaE =  fechaOriginalEntrada.substring(8, 10);
		String fechaModificada = year+"-"+me+"-"+diaE;
		System.out.println(fechaModificada);
		return fechaModificada;
	}
	public String modificarFechaSalida() {
		String year = fechaOriginalSalida.substring(30);
		String mes= fechaOriginalSalida.substring(4, 7);
		modifcarMesSalida(mes);
		diaS= fechaOriginalSalida.substring(8, 10);
		String fechaModificada = year+"-"+ms+"-"+diaS;
		System.out.println(fechaModificada);
		return fechaModificada;
	}
	
	
	public void modifcarMesEntrada(String mes) {
		for (int i = 0; i < Meses.length; i++) {
			if(Meses[i].contains(mes)) {
				me = String.valueOf(i) ;
			}
			
		}
	}
	public void modifcarMesSalida(String mes) {
		for (int i = 0; i < Meses.length; i++) {
			if(Meses[i].contains(mes)) {
				ms = String.valueOf(i) ;
			}
			
		}
	}
	
	//Este metodo retorna el valor obtenido dependiendo los dias y los manda a la base de datos
	public int obtenerValor() {
		int difDias = (Integer.valueOf(diaS) - Integer.valueOf(diaE));
		if(ms.equals(me)) {
			difDias = (difDias * 2);
		}
		System.out.println(me);
		System.out.println(ms);
		System.out.println(difDias);
		return difDias;
		
	}
	/*Este metodo retorna el valor obentenido de la reserva basandose en los dias indicados en la view
	 calcula la diferencia y retorna el valor hacia la view*/
	
	public String mostrarValor() {
		String diaEntrada = fechaOriginalEntrada.substring(8,10);
		String diaSalida = fechaOriginalSalida.substring(8,10);
		Integer valorSalida = (Integer.valueOf(diaSalida) - Integer.valueOf(diaEntrada))*2;
		return "$" + valorSalida.toString() +  " Dolares";
		
	}
	
	public String numeroId(){
		
		List<Integer>id = new ReservasDao().mostrarId();
		showId = id.size();
		if(showId == 1) {
			showId = id.size()+1;
		}else {
			showId = showId +1;
		}
		return ("Tu numero de reservacion es: #" + showId.toString());
		
	}
public Integer numeroReserva(){
		
		List<Integer>id = new ReservasDao().mostrarId();
		showId = id.size();
		if(showId == 1) {
			showId = id.size();
		}
		
		return showId;
		
	}
	
}
