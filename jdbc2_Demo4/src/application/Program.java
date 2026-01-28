package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegrityException;

///////////////////////////////////Deletar dados
public class Program {

	public static void main(String[] args) {

	Connection conn = null;
	PreparedStatement st = null;
	
	try {
		conn = DB.getConnection();
		
		st = conn.prepareStatement(
			"DELETE FROM department "
			+ "WHERE " //TEM DE TER O WHERE
			+ "Id = ?");
		
		st.setInt(1, 8);
		
		int rowsAffected = st.executeUpdate();
		System.out.println("Done! Rows affected: " + rowsAffected);
	}
	
	catch(SQLException e) {
		throw new DbIntegrityException(e.getMessage()); //Aplico a excessao personalizada para caso apagar um departamento que existe vendedores
	}
	
	finally {
		DB.closeStatement(st);
		DB.closeConnection();
	}
	
	}
}