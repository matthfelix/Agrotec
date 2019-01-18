package br.com.agroftec.email;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conect {
	
	public static void main(String args[]) throws Exception {
		getConnection();
		
	}
	public static  Connection getConnection() throws Exception{
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://192.168.0.104:10049/teste?useTimezone=true&serverTimezone=UTC";
			String username = "SYSTEMUSER";
			String password = "senha5dosistema1";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url,username,password);
			return conn;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
	
	}
}