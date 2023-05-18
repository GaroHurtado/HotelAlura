package Controllers;

import java.util.List;

import Dao.ContrasDao;

public class ContasController {
	public List<String> listadoContras(){
		return new ContrasDao().contras();
		
	}
	
}
