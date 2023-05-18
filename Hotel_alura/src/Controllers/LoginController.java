package Controllers;

import java.util.List;

import javax.swing.JOptionPane;

import views.MenuUsuario;

public class LoginController {
	public void verificacion(String user, String pass) {
		List<String> listado = new UsuariosController().listado();
	     List<String> contras = new ContasController().listadoContras();
	    if((contras.contains(pass)) && (listado.contains(user))) {
	    	MenuUsuario menu = new MenuUsuario();
			menu.setVisible(true);
			//dispose();
	    }else {
	    	JOptionPane.showMessageDialog(null, "Usuario o Contraseña no válidos", "Atencion",JOptionPane.INFORMATION_MESSAGE);
	    }
	}
}
