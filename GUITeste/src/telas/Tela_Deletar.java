package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Tela_Deletar {

	private JFrame Deletar;
	private JTextField txt_ID_Prod_Deletar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Deletar window = new Tela_Deletar();
					window.Deletar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela_Deletar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Deletar = new JFrame();
		Deletar.setBounds(100, 100, 508, 648);
		Deletar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Deletar.getContentPane().setLayout(null);
		
		JLabel JLBL_Deletar = new JLabel("DELETAR");
		JLBL_Deletar.setFont(new Font("Calibri", Font.BOLD, 31));
		JLBL_Deletar.setBounds(35, 44, 122, 31);
		Deletar.getContentPane().add(JLBL_Deletar);
		
		txt_ID_Prod_Deletar = new JTextField();
		txt_ID_Prod_Deletar.setBounds(135, 101, 158, 31);
		Deletar.getContentPane().add(txt_ID_Prod_Deletar);
		txt_ID_Prod_Deletar.setColumns(10);
		
		JLabel JLBL_deletar = new JLabel("ID_Produto:");
		JLBL_deletar.setFont(new Font("Calibri", Font.BOLD, 18));
		JLBL_deletar.setBounds(35, 102, 103, 31);
		Deletar.getContentPane().add(JLBL_deletar);
		
		JTextPane txt_BuscaDeleta = new JTextPane();
		txt_BuscaDeleta.setBounds(63, 193, 362, 283);
		Deletar.getContentPane().add(txt_BuscaDeleta);
		
		JButton btn_Buscar = new JButton("BUSCAR");
		btn_Buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String busca_deletar = txt_ID_Prod_Deletar.getText(); // Definir a busca desejada
		        Consulta consulta = new Consulta();
		        
		        try {
					consulta.Buscar_id(busca_deletar);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} // Realizar a consulta
		        
		        txt_BuscaDeleta.setText(consulta.getResultadoConsulta().toString());
			}
		});
		btn_Buscar.setFont(new Font("Calibri", Font.BOLD, 17));
		btn_Buscar.setBounds(315, 96, 122, 41);
		Deletar.getContentPane().add(btn_Buscar);
		
		JButton btn_Deletar = new JButton("DELETAR");
		btn_Deletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Deletar deletar = new Deletar();
				int resposta = JOptionPane.showOptionDialog(null, "Voce tem certeza que deseja cancelar?","Confirmacao", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
					
					if(resposta == JOptionPane.YES_OPTION) {
						String id = txt_ID_Prod_Deletar.getText();
						try {
							deletar.deletar_produto(id);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						JOptionPane.showMessageDialog(null,"Produto deletado!","Deletado",JOptionPane.ERROR_MESSAGE);
					}
				txt_BuscaDeleta.setText("");
				txt_ID_Prod_Deletar.setText("");
			}
		});
		btn_Deletar.setFont(new Font("Calibri", Font.BOLD, 18));
		btn_Deletar.setBounds(226, 551, 111, 31);
		Deletar.getContentPane().add(btn_Deletar);
		
		JButton btn_Voltar = new JButton("VOLTAR");
		btn_Voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Deletar.dispose();
			}
		});
		btn_Voltar.setFont(new Font("Calibri", Font.BOLD, 18));
		btn_Voltar.setBounds(347, 551, 103, 31);
		Deletar.getContentPane().add(btn_Voltar);
	}

	public void setVisible(boolean b) {
		Deletar.setVisible(b);
	}
}
