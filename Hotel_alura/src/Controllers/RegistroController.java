package Controllers;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import Dao.RegistroDao;
import Models.Registro;
import views.MenuPrincipal;

public class RegistroController {
	public void registrarCliente(String nombre, String user, char[] pass) {
		Registro registro = new Registro(nombre, user, pass);
		RegistroDao guardar = new RegistroDao();
    	guardar.guardarBase(registro);
    	JOptionPane.showMessageDialog(null, "Registro Exitoso", "Registro", JOptionPane.INFORMATION_MESSAGE);
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}); 	
    }

	

	
	
	}
	
	
	
	
	

