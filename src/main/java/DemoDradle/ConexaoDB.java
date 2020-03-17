package DemoDradle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
	
	 Connection con;
	 private String url;
	 
	public ConexaoDB() {
		this.url = "jdbc:derby:banco";
	}
	
	public void conectar() {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			con = DriverManager.getConnection(url);
			System.out.println("ok");
		} catch (ClassNotFoundException e) {
			System.out.println("nao achei o driver");
		} catch (SQLException e) {
			System.out.println("nao achei o banco");
		}
	}
	
	public Connection getConection() {
		return con;
	}
}
