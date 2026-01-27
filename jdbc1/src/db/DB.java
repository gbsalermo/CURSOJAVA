package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
	
	
	
	private static	Connection	conn = null;
	
	public static Connection getConnection(){
		
		
		if(conn == null) {
			try {
				Properties props = loadProperties(); //Aqui carrego as info
				String url = props.getProperty("dburl"); //Pego das properties a url
				conn = DriverManager.getConnection(url, props); //carrego a url com os dados 
			}
			catch(SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		
		return conn;
	}
	public static void closeConnection() {
		if(conn != null) {
			try {
			conn.close();
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
			}
		}
	}
	
	
	
	private static Properties loadProperties() {
		
		//Crio um try e uma stream com FileInputStream recebendo o db properties
		try (FileInputStream fs = new FileInputStream("db.properties")){
			Properties props = new Properties();
			props.load(fs); //Carrego os dados do file em props
			return props; //retorno props
		}
		catch (IOException e) {
			throw new DbException(e.getMessage()); //pego a classe de excessão
			
		}
		
	}

}
