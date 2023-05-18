package Controllers;

import java.util.List;

import Dao.UsuariosDao;
import Models.Usuarios;

public class UsuariosController {
	
	public List<String> listado(){
		return new UsuariosDao().usuarios();
		
	}
}
