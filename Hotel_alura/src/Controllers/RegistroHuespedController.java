package Controllers;

public class RegistroHuespedController {
	private String fechaNacimiento;
	private String[] Meses = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Agu","Sep","Nov","Dic"};
	private String mesMod;

	public RegistroHuespedController(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String modificarFecha() {
		String year = fechaNacimiento.substring(30);
		String mes = fechaNacimiento.substring(4, 7);
		String dia = fechaNacimiento.substring(8, 10);
		modifcarMes(mes);
		String fechaMod = year+"-"+mesMod+"-"+dia;
		return fechaMod;
	}
	
	public void modifcarMes(String mes) {
		for (int i = 0; i < Meses.length; i++) {
			if(Meses[i].contains(mes)) {
				mesMod = String.valueOf(i) ;
			}
			
		}
	}
	
}
