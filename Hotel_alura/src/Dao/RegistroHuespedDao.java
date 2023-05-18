package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Controllers.ConnectionFactory;
import Controllers.ReservasController;
import Models.RegistroHuesped;

public class RegistroHuespedDao {
	public void guardarBase(RegistroHuesped registro) {
		Connection con = new ConnectionFactory().conectar();
		ReservasController numReserva = new ReservasController();
		try {
			final PreparedStatement stat = con.prepareStatement("INSERT INTO huespedes"+
		"(nombre,apellido, fecha_nacimiento, nacionalidad, telefono, id_reserva)" + "values (?,?,?,?,?,?)");
			stat.setString(1, registro.getNombre());
			stat.setString(2, registro.getApellido());
			stat.setString(3, registro.getFechaNacimiento());
			stat.setString(4, registro.getNacionalidad());
			stat.setString(5, registro.getNumTelefono());
			stat.setInt(6, numReserva.numeroReserva());
			stat.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
