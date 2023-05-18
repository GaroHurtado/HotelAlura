package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controllers.ConnectionFactory;
import Models.Reserva;

public class ReservasDao {
	private Connection con;
	public void guardarBase(Reserva reserva) {
		con = new ConnectionFactory().conectar();
		try {
			final PreparedStatement stat = con.prepareStatement("INSERT INTO reservas"+
		"(fecha_entrada, fecha_salida,valor,forma_pago)" + "values (?,?,?,?)");
			stat.setString(1, reserva.getFechaEntrada());
			stat.setString(2, reserva.getFechaSalida());
			stat.setInt(3, reserva.getValor());
			stat.setString(4, reserva.getFormaPago());
			stat.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Integer> mostrarId() {
		List<Integer>ids = new ArrayList<>();
		con = new ConnectionFactory().conectar();
		try {
			final PreparedStatement stat = con.prepareStatement("Select id from reservas");
			try(stat) {
				final ResultSet prep = stat.executeQuery();
				
			try(prep){
				while(prep.next()) {
					Integer list = prep.getInt("id");
					ids.add(list);
				}
			}
				
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return ids;
	}
}
