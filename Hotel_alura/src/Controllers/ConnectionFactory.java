package Controllers;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	private String url = "jdbc:mysql://localhost/hotel_alura?useTimeZone=true&serverTimeZone=UTC";
	private String user = "root";
	private String pass = "Hola6060$";
	private DataSource dataSourse;
	
	
	public ConnectionFactory() {
		var pooledDataSource = new ComboPooledDataSource();
		pooledDataSource.setJdbcUrl(url);
		pooledDataSource.setUser(user);
		pooledDataSource.setPassword(pass);
		
		this.dataSourse = pooledDataSource;
	}
	
	public Connection conectar() {
		try {
			return this.dataSourse.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
}
