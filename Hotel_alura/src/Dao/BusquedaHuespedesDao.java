package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controllers.ConnectionFactory;
import Models.Busqueda;

public class BusquedaHuespedesDao {
	private List<String> contenidoId = new ArrayList<>();
	private List<String>contNombre = new ArrayList<>();
	private List<String>contApellido = new ArrayList<>();
	private List<String>contFechaN = new ArrayList<>();
	private List<String>contTel = new ArrayList<>();
	private List<String> contNacio = new ArrayList<>();
	
	public void busquedaReservaHuesped() {

		Connection con = new ConnectionFactory().conectar();
		try {
			final PreparedStatement stat = con.prepareStatement("Select nombre,apellido,fecha_nacimiento,nacionalidad,telefono, id_reserva from huespedes");
			try (stat) {
				final ResultSet result = stat.executeQuery();

				try (result) {
					while (result.next()) {
						var idReserva = String.valueOf(result.getInt("id_reserva")); 
						var nombre = result.getString("nombre");
						var apellido = result.getString("apellido");
						var fechaN = result.getString("fecha_nacimiento");
						var nacionalidad = result.getString("nacionalidad");
						var telefono = result.getString("telefono");
						contenidoId.add(idReserva);
						contNombre.add(nombre);
						contApellido.add(apellido);
						contFechaN.add(fechaN);
						contNacio.add(nacionalidad);
						contTel.add(telefono);
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
	public List<String> busquedaNombre() {
		List<String> contName = contNombre;
		return contName;
		
		
	}
	public List<String> busquedaApellido() {
		return contApellido;
		
		
	}
	public List<String> busquedaFechaN() {
		List<String> fechaNa = contFechaN;
		return fechaNa;
		
		
	}
	public List<String> busquedaNacio() {
		List<String> nacio = contNacio;
		return nacio;

	}  
	public List<String> busquedaTel() {
		List<String> tel = contTel;
		return tel;
	
	}
	
	//--------------------------------------------------------------------------------------
	private List<String> contenidoIdFilter = new ArrayList<>();
	private List<String>contNombreFilter = new ArrayList<>();
	private List<String>contApellidoFilter = new ArrayList<>();
	private List<String>contFechaNFilter = new ArrayList<>();
	private List<String>contTelFilter = new ArrayList<>();
	private List<String> contNacioFilter = new ArrayList<>();
	
	public void busquedaHuespedes(String idReserva) {

		Connection con = new ConnectionFactory().conectar();
		try {
			final PreparedStatement stat = con.prepareStatement("Select id_reserva, nombre, apellido, fecha_nacimiento, nacionalidad, telefono  from huespedes"
					+ " where id_reserva = ?");
			stat.setString(1, idReserva);
			ResultSet result = stat.executeQuery();
			try(result){
				while(result.next()) {
					var idFilter = String.valueOf(result.getInt("id_reserva")); 
					var nombreFlter = result.getString("nombre");
					var apellidoFilter = result.getString("apellido");
					var fechaNFilter = result.getString("fecha_nacimiento");
					var nacioFilter = result.getString("nacionalidad");
					var telFilter = result.getString("telefono");
					contenidoIdFilter.add(idFilter);
					contNombreFilter.add(nombreFlter);
					contApellidoFilter.add(apellidoFilter);
					contFechaNFilter.add(fechaNFilter);
					contNacioFilter.add(nacioFilter);
					contTelFilter.add(telFilter);
				}
				
			}
					
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public List<String> busquedaIdFilter() {
		List<String>id = this.contenidoIdFilter;
		return id;
		
	}
	public List<String> busquedaNombreFilter() {
		List<String> contName = contNombreFilter;
		return contName;
		
		
	}
	public List<String> busquedaApellidoFilter() {
		return contApellidoFilter;
		
		
	}
	public List<String> busquedaFechaNFilter() {
		List<String> fechaNa = contFechaNFilter;
		return fechaNa;
		
		
	}
	public List<String> busquedaNacioFilter() {
		List<String> nacio = contNacioFilter;
		return nacio;

	}  
	public List<String> busquedaTelfilter() {
		return contTelFilter;
	}
}
