package telas;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;	

public class Movimentacao {
	
	
	public String leitor() throws IOException{
		String arquivo = "C:\\Users\\gusta\\OneDrive\\Área de Trabalho\\programas\\programas original\\TesteSwing\\Logs_Atividade.txt";
		BufferedReader buffHistorico = new BufferedReader(new FileReader(arquivo));
		String historico = "";
	
		while(true) {
			historico = buffHistorico.readLine();
		}
		 
	//	return historico;
	}
}
