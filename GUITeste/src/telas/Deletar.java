package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JOptionPane;

public class Deletar {
	
	private final String url = "jdbc:postgresql://localhost/BDGestaoEstoque";
	private final String user = "postgres";
	private final String password = "Gustavo@";
	Connection conn = null;
	

	StringBuilder resultado_busca; // Inicializar o objeto StringBuilder
	    
    public Deletar() {
        resultado_busca = new StringBuilder(); // Inicializar o StringBuilder
    }
    
    public StringBuilder getResultadoConsulta() {
        return resultado_busca;
    }
	
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
	
	
	public static final String QUERY_BUSCAR = "select * from cadastro where id_cadastro = ?";
	public void buscar() throws SQLException {
		
		Connection connection = DriverManager.getConnection(url,user,password);
		
		PreparedStatement preparedStatement = connection.prepareStatement(QUERY_BUSCAR);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next()) {
			 int id = resultSet.getInt("id_cadastro");
        	 String nome = resultSet.getString("nome");
        	 int qtd = resultSet.getInt("quantidade");
        	 Date data_criacao = resultSet.getDate("dta_criacao");
        	 
        	 //Atribuindo os valores para realizar a impressao.
	    	 resultado_busca.append("Id do produto: ").append(id).append("\n");
	         resultado_busca.append("Nome: ").append(nome).append("\n");
	         resultado_busca.append("Quantidade: ").append(qtd).append("\n");
	         resultado_busca.append("Data do cadastro: ").append(data_criacao).append("\n");
	         resultado_busca.append("------------------------------------\n");
			
		}
	}
	
	public static final String QUERY_DELETAR = "delete from cadastro where id_cadastro = ?";
	
	public void deletar_produto(String deleta) throws SQLException {
		Connection connection = DriverManager.getConnection(url, user, password);
		
		PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETAR );
		preparedStatement.setInt(1,Integer.parseInt(deleta));
		preparedStatement.executeUpdate();
		
	}
	
}
