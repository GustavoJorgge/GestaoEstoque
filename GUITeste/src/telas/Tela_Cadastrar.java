package telas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Font;

public class Tela_Cadastrar {

	protected static final int EXIT_ON_CLOSE = 0;
	private JFrame frame;
	private JTextField ID_Produto;
	private JTextField JText_NomeProd;
	private JTextField txt_Entrada;
	private JTextField txt_ValorProduto;
	private JTextField txt_Dta_Entrada;

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
		}catch(ClassNotFoundException e) {
			System.err.println(e);
		}catch(InstantiationException e) {
			System.err.println(e);
		}catch(IllegalAccessException e) {
			System.err.println(e);
		}catch(javax.swing.UnsupportedLookAndFeelException e) {
			System.err.println(e);
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Cadastrar window = new Tela_Cadastrar();
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
	public Tela_Cadastrar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 534, 581);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_Fechar = new JButton("Fechar");
		btn_Fechar.setFont(new Font("Calibri", Font.BOLD, 18));
		btn_Fechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 frame.dispose();
			}
		});
		btn_Fechar.setBounds(366, 455, 128, 52);
		frame.getContentPane().add(btn_Fechar);
		
		JLabel lblNewLabel = new JLabel("ID_Produto:");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 13));
		lblNewLabel.setBounds(278, 36, 78, 25);
		frame.getContentPane().add(lblNewLabel);
		
		ID_Produto = new JTextField();
		ID_Produto.setBounds(366, 35, 96, 24);
		frame.getContentPane().add(ID_Produto);
		ID_Produto.setColumns(10);
		
		JLabel title_Cadastrar = new JLabel("CADASTRAR");
		title_Cadastrar.setFont(new Font("Calibri", Font.BOLD, 27));
		title_Cadastrar.setBounds(38, 28, 184, 36);
		frame.getContentPane().add(title_Cadastrar);
		
		JText_NomeProd = new JTextField();
		JText_NomeProd.setBounds(134, 92, 313, 36);
		frame.getContentPane().add(JText_NomeProd);
		JText_NomeProd.setColumns(10);
		
		JLabel JLBL_Nome_Produto = new JLabel("Nome do Produto:");
		JLBL_Nome_Produto.setFont(new Font("Calibri", Font.BOLD, 13));
		JLBL_Nome_Produto.setBounds(27, 99, 117, 24);
		frame.getContentPane().add(JLBL_Nome_Produto);
		
		txt_Entrada = new JTextField();
		txt_Entrada.setBounds(134, 160, 117, 36);
		frame.getContentPane().add(txt_Entrada);
		txt_Entrada.setColumns(10);
		
		JLabel JLBL_Entrada = new JLabel("Quantidade (entrada):");
		JLBL_Entrada.setFont(new Font("Calibri", Font.BOLD, 13));
		JLBL_Entrada.setBounds(10, 170, 134, 19);
		frame.getContentPane().add(JLBL_Entrada);
		
		txt_ValorProduto = new JTextField();
		txt_ValorProduto.setColumns(10);
		txt_ValorProduto.setBounds(134, 221, 117, 36);
		frame.getContentPane().add(txt_ValorProduto);
		
		JLabel JLBL_ValorProduto = new JLabel("Valor Unitario:");
		JLBL_ValorProduto.setFont(new Font("Calibri", Font.BOLD, 13));
		JLBL_ValorProduto.setBounds(50, 231, 90, 19);
		frame.getContentPane().add(JLBL_ValorProduto);
		
		txt_Dta_Entrada = new JTextField();
		txt_Dta_Entrada.setBounds(134, 285, 100, 36);
		frame.getContentPane().add(txt_Dta_Entrada);
		txt_Dta_Entrada.setColumns(10);
		
		JLabel JLBL_dta_Entrada = new JLabel("Data de Entrada:");
		JLBL_dta_Entrada.setFont(new Font("Calibri", Font.BOLD, 13));
		JLBL_dta_Entrada.setBounds(27, 296, 100, 16);
		frame.getContentPane().add(JLBL_dta_Entrada);
		
		JButton btn_Salvar_1 = new JButton("Salvar");
		btn_Salvar_1.setFont(new Font("Calibri", Font.BOLD, 22));
		btn_Salvar_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Cadastro cadastro = new Cadastro();	
				String nome = JText_NomeProd.getText();
				int qtd = Integer.parseInt(txt_Entrada.getText());
				Double valor = Double.parseDouble(txt_ValorProduto.getText());
				Date dta_criacao = Date(txt_Dta_Entrada.getText());
				JOptionPane.showMessageDialog(null, "Nome: " + nome + " qtd " + qtd + "Valor: " + valor);
				
				cadastro.cadastraProduto(nome, qtd, valor, dta_criacao);
			}

			private Date Date(String text) {
				// TODO Auto-generated method stub
				return null;
			}
			
		});
		btn_Salvar_1.setBounds(218, 455, 128, 52);
		frame.getContentPane().add(btn_Salvar_1);
	}
	
	public void setVisible(boolean b) {
		frame.setVisible(b);
	}	
	
}
