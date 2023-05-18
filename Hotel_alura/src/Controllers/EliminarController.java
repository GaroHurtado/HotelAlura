package Controllers;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Dao.EliminarDao;

public class EliminarController {
	
	EliminarDao eliminarBase = new EliminarDao();
	public void eliminarReserva(DefaultTableModel modelo, JTable tbReservas) {
		String id = modelo.getValueAt(tbReservas.getSelectedRow(), 0).toString();
		String idHuesped = modelo.getValueAt(tbReservas.getSelectedRow(), 0).toString();
		
		eliminarBase.eliminarFilaReserva(id);
		eliminarBase.eliminarFilaHuesped(idHuesped);
		System.out.println(id + " - "+ idHuesped);
		
	}
	
	
}
