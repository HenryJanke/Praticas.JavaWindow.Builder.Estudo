package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setExtendedState(MAXIMIZED_BOTH);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu jmArquivo = new JMenu("Arquivo");
		jmArquivo.setMnemonic('A');
		jmArquivo.setIcon(new ImageIcon(Principal.class.getResource("/img/arquivo.png")));
		menuBar.add(jmArquivo);
		
		JMenu jmCadastros = new JMenu("Cadastros");
		jmCadastros.setMnemonic('a');
		jmCadastros.setIcon(new ImageIcon(Principal.class.getResource("/img/novo.png")));
		jmArquivo.add(jmCadastros);
		
		JMenuItem jmiCidade = new JMenuItem("Cidade");
		jmiCidade.setIcon(new ImageIcon(Principal.class.getResource("/img/cidade.png")));
		jmCadastros.add(jmiCidade);
		
		JMenuItem jmiBairro = new JMenuItem("Bairro");
		jmiBairro.setIcon(new ImageIcon(Principal.class.getResource("/img/bairro.png")));
		jmCadastros.add(jmiBairro);
		
		JSeparator separator_2_1 = new JSeparator();
		jmCadastros.add(separator_2_1);
		
		JMenuItem jmiTipoDeContato = new JMenuItem("Tipo de contato");
		jmiTipoDeContato.setIcon(new ImageIcon(Principal.class.getResource("/img/tipo.png")));
		jmCadastros.add(jmiTipoDeContato);
		
		JSeparator separator = new JSeparator();
		jmArquivo.add(separator);
		
		JMenu jmContatos = new JMenu("Contatos");
		jmContatos.setIcon(new ImageIcon(Principal.class.getResource("/img/contato.png")));
		jmArquivo.add(jmContatos);
		
		JSeparator separator_2 = new JSeparator();
		jmContatos.add(separator_2);
		
		JMenu jmSobre = new JMenu("Sobre");
		jmSobre.setMnemonic('S');
		jmSobre.setIcon(new ImageIcon(Principal.class.getResource("/img/me.png")));
		menuBar.add(jmSobre);
		
		JMenu mnNewMenu_4 = new JMenu("New menu");
		jmSobre.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("New menu item");
		mnNewMenu_4.add(mntmNewMenuItem_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
