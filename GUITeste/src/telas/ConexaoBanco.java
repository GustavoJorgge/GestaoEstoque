package telas;

import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBanco {

	private final String url = "jdbc:postgresql://localhost/BDGestaoEstoque";
	private final String user = "postgres";
	private final String password = "Gustavo@";
	Connection conn = null;
		
	//estabelecendo conexão com servidor PostGre
	public Connection connect() {
		
		try {
			conn = DriverManager.getConnection(url,user,password);
			
			if(conn!=null) {
				System.out.println("Conexão com PostGreSQL estabelecida com sucesso!");
			}else {
				System.out.println("Falha na conexão com o PostGreSQL");
			}
			Statement statement = conn.createStatement(); // Criando instancia do objeto que representa um canal de comunicação com banco de dados
			ResultSet resultSet = statement.executeQuery("SELECT VERSION()");//Esta consulta obtem a versão do PostGreSQL
			
			if(resultSet.next()) {
				System.out.printf(resultSet.getString(1));
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return conn;
	}
	
}
