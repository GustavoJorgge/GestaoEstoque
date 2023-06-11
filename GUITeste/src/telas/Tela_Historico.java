package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_Historico {
	
//	Serializacao historico = new Serializacao();
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Historico window = new Tela_Historico();
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
	public Tela_Historico() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 482, 536);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Logs de Movimentações:");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 25));
		lblNewLabel.setBounds(34, 24, 290, 62);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn_Voltar = new JButton("VOLTAR");
		btn_Voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btn_Voltar.setFont(new Font("Calibri", Font.BOLD, 19));
		btn_Voltar.setBounds(293, 435, 118, 39);
		frame.getContentPane().add(btn_Voltar);
		
		JTextPane txt_Historico = new JTextPane();
		txt_Historico.setBounds(34, 81, 393, 342);
		frame.getContentPane().add(txt_Historico);
		//Movimentacao movimentacao = new Movimentacao();
		//String historico = movimentacao.leitor();
		//txt_Historico.setText();
	}

	public void setVisible(boolean b) {
		
		frame.setVisible(true);
	}
}
