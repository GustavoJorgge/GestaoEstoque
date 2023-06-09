package telas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Teste {

	private JFrame frame;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		try {
			for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if("Window".equals(info.getName()));
				javax.swing.UIManager.setLookAndFeel(info.getClassName());
				break;
			}
		}catch(ClassNotFoundException ex) {
			System.err.println(ex);
		}catch(InstantiationException ex) {
			System.err.println(ex);
		}catch(IllegalAccessException ex) {
			System.err.println(ex);
		}catch(javax.swing.UnsupportedLookAndFeelException ex) {
			System.err.println(ex);
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste window = new Teste();
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
	public Teste() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 585, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_Cadastrar = new JButton("CADASTRAR");
		btn_Cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Cadastrar telaCadastrar = new Tela_Cadastrar();
				telaCadastrar.setVisible(true);
			}
			
		});
		btn_Cadastrar.setFont(new Font("Calibri Light", Font.BOLD, 23));
		btn_Cadastrar.setBounds(103, 143, 368, 62);
		frame.getContentPane().add(btn_Cadastrar);
		
		JLabel title_Papelaria = new JLabel("PAPELARIA");
		title_Papelaria.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 33));
		title_Papelaria.setBounds(58, 21, 204, 51);
		frame.getContentPane().add(title_Papelaria);
		
		JLabel subtitle_Gestao = new JLabel("Gestão de Estoque");
		subtitle_Gestao.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 33));
		subtitle_Gestao.setBounds(58, 62, 279, 51);
		frame.getContentPane().add(subtitle_Gestao);
		
		JButton btn_Entrada_Saida = new JButton("ENTRADA E SAIDA");
		btn_Entrada_Saida.setFont(new Font("Calibri", Font.BOLD, 17));
		btn_Entrada_Saida.setBounds(103, 246, 174, 51);
		frame.getContentPane().add(btn_Entrada_Saida);
		
		JButton btn_Consultar = new JButton("CONSULTAR");
		btn_Consultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Consultar telaConsultar = new Tela_Consultar();
				telaConsultar.setVisible(true);
			}
		});
		btn_Consultar.setBounds(287, 246, 184, 51);
		btn_Consultar.setFont(new Font("Calibri", Font.BOLD, 17));
		frame.getContentPane().add(btn_Consultar);
		
		JButton btn_Deletar = new JButton("DELETAR");
		btn_Deletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Deletar tela_deletar = new Tela_Deletar();
				tela_deletar.setVisible(true);
			}
		});
		btn_Deletar.setBounds(103, 320, 174, 51);
		btn_Deletar.setFont(new Font("Calibri", Font.BOLD, 17));
		frame.getContentPane().add(btn_Deletar);
		
		JButton btn_Historico = new JButton("HISTORICO");
		btn_Historico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Historico tela_historico = new Tela_Historico();
				tela_historico.setVisible(true);
			}
		});
		btn_Historico.setBounds(287, 320, 184, 51);
		btn_Historico.setFont(new Font("Calibri", Font.BOLD, 17));
		frame.getContentPane().add(btn_Historico);
	}
}
