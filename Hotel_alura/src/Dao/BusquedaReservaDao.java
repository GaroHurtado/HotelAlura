package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controllers.ConnectionFactory;
import Models.Busqueda;

public class BusquedaReservaDao {
	List<String> contenidoId = new ArrayList<>();
	List<String>contFechaE = new ArrayList<>();
	List<String>contFechas = new ArrayList<>();
	List<String>contValor = new ArrayList<>();
	List<String>contFormaP = new ArrayList<>();
	public void busquedaReserva() {

		Connection con = new ConnectionFactory().conectar();
		try {
			final PreparedStatement stat = con.prepareStatement("Select id, fecha_entrada, fecha_salida, valor, forma_pago from reservas");
			try (stat) {
				final ResultSet result = stat.executeQuery();

				try (result) {
					while (result.next()) {
						var id = String.valueOf(result.getInt("id")); 
						var fechaE = result.getString("fecha_entrada");
						var fechaS = result.getString("fecha_salida");
						var valor = String.valueOf(result.getInt("valor"));
						var formaP = result.getString("forma_pago");
						contenidoId.add(id);
						contFechaE.add(fechaE);
						contFechas.add(fechaS);
						contValor.add(valor);
						contFormaP.add(formaP);
					}

				}
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public List<String> busquedaId() {
		List<String>id = this.contenidoId;
		return id;
		
	}
	public List<String> busquedaFechaE() {
		List<String>fechaE = this.contFechaE;
		return fechaE;
		
	}
	public List<String> busquedaFechaS() {
		List<String>fechaS = this.contFechas;
		return fechaS;
		
	}
	public List<String> busquedaValor() {
		List<String>Valor = this.contValor;
		return Valor;
		
	}
	public List<String> busquedaFormaP() {
		List<String>formaP = this.contFormaP;
		return formaP;
		
	}
	
	//---------------------------------------------------------------------------
	
	List<String>contIdFilter = new ArrayList<>();
	List<String>contFechaEFilter = new ArrayList<>();
	List<String>contFechaSFilter = new ArrayList<>();
	List<String>contValorFilter = new ArrayList<>();
	List<String>contFormaPFilter = new ArrayList<>();
	public void busquedaReservacion(String idReserva) {

		Connection con = new ConnectionFactory().conectar();
		try {
			final PreparedStatement stat = con.prepareStatement("Select id, fecha_entrada, fecha_salida, valor, forma_pago from reservas"
					+ " where id = ?");
			stat.setString(1, idReserva);
			ResultSet result = stat.executeQuery();
			try(result){
				while(result.next()) {
					var id = String.valueOf(result.getInt("id")); 
					var fechaE = result.getString("fecha_entrada");
					var fechaS = result.getString("fecha_salida");
					var valor = String.valueOf(result.getInt("valor"));
					var formaP = result.getString("forma_pago");
					contIdFilter.add(id);
					contFechaEFilter.add(fechaE);
					contFechaSFilter.add(fechaS);
					contValorFilter.add(valor);
					contFormaPFilter.add(formaP);	
				}
				
			}
					
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<String> busquedaIdFilter() {
		List<String>id = this.contIdFilter;
		return id;
		
	}
	public List<String> busquedaFechaEFilter() {
		List<String>fechaE = this.contFechaEFilter;
		return fechaE;
		
	}
	public List<String> busquedaFechaSFilter() {
		List<String>fechaS = this.contFechaSFilter;
		return fechaS;
		
	}
	public List<String> busquedaValorFilter() {
		List<String>Valor = this.contValorFilter;
		return Valor;
		
	}
	public List<String> busquedaFormaPfilter() {
		List<String> formaP = this.contFormaPFilter;
		return formaP;
	}
	
	
}
