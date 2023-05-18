package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Controllers.ConnectionFactory;

public class EliminarDao {
	public void eliminarFilaReserva(String idReserva) {
		Connection con = new ConnectionFactory().conectar();
		try {
			final PreparedStatement stat = con.prepareStatement("delete from reservas where id = ?");
			stat.setString(1, idReserva);
			stat.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public void eliminarFilaHuesped(String idHuesped) {
		Connection con = new ConnectionFactory().conectar();
		try {
			final PreparedStatement statHuesped = con.prepareStatement("delete from huespedes where id_reserva = ?");		
			statHuesped.setString(1, idHuesped);
			statHuesped.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
