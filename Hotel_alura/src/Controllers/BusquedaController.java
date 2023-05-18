package Controllers;

import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import Dao.BusquedaHuespedesDao;
import Dao.BusquedaReservaDao;

public class BusquedaController {
	BusquedaReservaDao bus = new BusquedaReservaDao();
	BusquedaHuespedesDao busHuesped = new BusquedaHuespedesDao();
	public void tablaReserva(DefaultTableModel modelo) {
		bus.busquedaReserva();
		for (int i = 0; i <bus.busquedaId().size(); i++) {
			modelo.addRow(new Object[] {bus.busquedaId().get(i), 
										bus.busquedaFechaE().get(i),
										bus.busquedaFechaS().get(i),
										bus.busquedaValor().get(i),
										bus.busquedaFormaP().get(i)});
		}
	}
	public void tablaHuesped(DefaultTableModel modeloHuesped) {
		busHuesped.busquedaReservaHuesped();
		for (int i = 0; i <busHuesped.busquedaId().size(); i++) {
			modeloHuesped.addRow(new Object[] {busHuesped.busquedaId().get(i), 
										busHuesped.busquedaNombre().get(i),
										busHuesped.busquedaApellido().get(i),
										busHuesped.busquedaFechaN().get(i),
										busHuesped.busquedaNacio().get(i),
										busHuesped.busquedaTel().get(i)});
		}
	}
	
	
	public void tablaReservaFilter(DefaultTableModel modelo) {
		
		for (int i = 0; i <bus.busquedaIdFilter().size(); i++) {
			modelo.addRow(new Object[] {bus.busquedaIdFilter().get(i), 
										bus.busquedaFechaEFilter().get(i),
										bus.busquedaFechaSFilter().get(i),
										bus.busquedaValorFilter().get(i),
										bus.busquedaFormaPfilter().get(i)});
		}
	}
	private void tablaHuestepFilter(DefaultTableModel modelo) {
		for (int i = 0; i <busHuesped.busquedaIdFilter().size(); i++) {
			modelo.addRow(new Object[] {busHuesped.busquedaIdFilter().get(i), 
										busHuesped.busquedaNombreFilter().get(i),
										busHuesped.busquedaApellidoFilter().get(i),
										busHuesped.busquedaFechaNFilter().get(i),
										busHuesped.busquedaNacioFilter().get(i),
										busHuesped.busquedaTelfilter().get(i)});
		
			}
		}
	public void busquedaReserva(String id, JScrollPane scroll_table, DefaultTableModel modelo, JScrollPane scroll_tableHuespedes,  DefaultTableModel modeloHuesped) {
		borrarTabla(modelo);
		bus.busquedaReservacion(id);
		tablaReservaFilter(modelo);
		borrarTablaHuesped(modeloHuesped);
		busHuesped.busquedaHuespedes(id);
		tablaHuestepFilter(modeloHuesped);
	}
	
	
	public void borrarTabla(DefaultTableModel modelo) {
		modelo.setNumRows(0);
	}
	public void borrarTablaHuesped(DefaultTableModel modeloHuesped) {
		modeloHuesped.setNumRows(0);
	}
}
