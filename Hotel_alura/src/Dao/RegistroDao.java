package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Controllers.ConnectionFactory;
import Models.Registro;

public class RegistroDao {
	public void guardarBase(Registro registro) {
		Connection con = new ConnectionFactory().conectar();
		try {
			final PreparedStatement stat = con.prepareStatement("INSERT INTO usuarios"+
		"(nombre, usuario, contrasena)" + "values (?,?,?)");
			stat.setString(1, registro.getNombre());
			stat.setString(2, registro.getUsuario());
			stat.setString(3, registro.getPassword());
			stat.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
