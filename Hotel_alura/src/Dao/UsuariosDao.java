package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controllers.ConnectionFactory;
import Models.Usuarios;

public class UsuariosDao {
	public List<String> usuarios() {
		
		List <String> contenido = new ArrayList<>();
		
		Connection con = new ConnectionFactory().conectar();
		try {
			final PreparedStatement stat = con.prepareStatement("Select usuario, contrasena from usuarios");
			try(stat){
			final ResultSet result = stat.executeQuery();
			
			try(result){
				while(result.next()) {
					var content =result.getString("usuario");
					contenido.add(content);
				}
			
			}
		}
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return contenido;
	}
}
