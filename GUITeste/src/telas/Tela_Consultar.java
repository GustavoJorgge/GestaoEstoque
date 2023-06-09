package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class Tela_Consultar {

	private JFrame frame;
	private JTextField txt_ID_Produto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Consultar window = new Tela_Consultar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela_Consultar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 533, 675);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONSULTAR");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 32));
		lblNewLabel.setBounds(24, 29, 162, 48);
		frame.getContentPane().add(lblNewLabel);
		
		txt_ID_Produto = new JTextField();
		txt_ID_Produto.setBounds(133, 87, 147, 30);
		frame.getContentPane().add(txt_ID_Produto);
		txt_ID_Produto.setColumns(10);
		
		JLabel JLBL_Nome_Prod = new JLabel("Nome do produto:");
		JLBL_Nome_Prod.setFont(new Font("Calibri", Font.BOLD, 13));
		JLBL_Nome_Prod.setBounds(23, 95, 116, 16);
		frame.getContentPane().add(JLBL_Nome_Prod);
		
		JButton btn_Voltar = new JButton("Voltar");
		btn_Voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btn_Voltar.setBounds(317, 563, 135, 53);
		frame.getContentPane().add(btn_Voltar);
		
		JTextPane txt_Consulta = new JTextPane();
		txt_Consulta.setBounds(59, 151, 393, 342);
		frame.getContentPane().add(txt_Consulta);
		
		JButton btn_Consultar = new JButton("CONSULTAR");
		btn_Consultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String busca_consulta = txt_ID_Produto.getText(); // Definir a busca desejada
		        Consulta consulta = new Consulta();
		        
		        try {
					consulta.Consultar(busca_consulta);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} // Realizar a consulta
		        
		        txt_Consulta.setText(consulta.getResultadoConsulta().toString());
			}
		});
		btn_Consultar.setFont(new Font("Calibri", Font.BOLD, 20));
		btn_Consultar.setBounds(305, 84, 147, 37);
		frame.getContentPane().add(btn_Consultar);
		
		
	}

	public void setVisible(boolean b) {
		frame.setVisible(b);
	}
}
