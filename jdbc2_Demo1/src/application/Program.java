package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

/////////////////////////////////////Pegar dados
public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		
		Statement st = null; //"Aquilo que pergunto ao banco" Ação de consulta, Objeto que executa comandos SQL
		ResultSet rs = null; //"A resposta que recebo" objeto que me retorna os resultados, em lista ou tabela
		
		try {
			conn = DB.getConnection(); //Receber banco de dados
			
			st = conn.createStatement();
			
			rs = st.executeQuery("select * from department"); //Aqui o rs receb o comando do Statement com querry
	
			while (rs.next()) { //enquanto vai funcionar até existir um proximo, o next vai retornar false quando já estiver no último
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name")); // Aqui eu percorro o resultSet pegando o id e o nome		
				
			}
		}
		catch (SQLException e) {
			e.printStackTrace(); //Imprime o erro com a localização do mesmo
		}
		finally {
			DB.closeResultSet(rs);//Ao inves de rs.close uso o metodo que ja possui o ty/catch
			DB.closeStatement(st);//Ao inves de st.close uso o metodo que ja possui o ty/catch
			DB.closeConnection();
		}
		
	}

}

