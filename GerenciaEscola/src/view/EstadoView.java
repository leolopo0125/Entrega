package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class EstadoView {
	
	
	private JFrame janela;
	private JPanel painelDaJanela;
	private JPanel painelTit;
	private JTextField txtEstado;
	private JTextField txtUf;
	private JLabel lblEstado;
	private JLabel lblUf;
	private JLabel lblNome;
	private JButton btcad;
	private JButton btcanc;

	public void iniciaGui() {
		
		//criando instancias
		janela = new JFrame("Cadastro de Estado");
		painelDaJanela = (JPanel) janela.getContentPane();
		painelTit= new JPanel();
		txtUf = new JTextField();
		txtEstado = new JTextField();
		btcad = new JButton("Cadastrar");
		btcanc = new JButton("Cancelar");
		
		lblUf = new JLabel("Uf");
		lblUf.setBounds(256, 57, 50, 30);
		lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 57, 50, 30);
		lblEstado = new JLabel("Cadastrar Estado");

		
		//definindo valores dos componentes
		
		txtEstado.setBounds(60,60, 180, 30);
		txtUf.setBounds(287,60, 50, 30);
		btcad.setBounds(200,110, 100, 30);
		btcanc.setBounds(50,110, 100, 30);
		
		btcanc.addActionListener(cancelarListenner);
		
		
		//configurações da janela
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(375, 200);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
		
		//configuracoes do painel
		painelDaJanela.setBorder(BorderFactory.createEtchedBorder());
		painelTit.add(lblEstado);
		painelDaJanela.add(btcad);		
		painelDaJanela.add(btcanc);		
		painelDaJanela.add(txtEstado);
		painelDaJanela.add(txtUf);
		painelDaJanela.add(lblUf);
		painelDaJanela.add(lblNome);
		painelDaJanela.add(painelTit);


	}
	
	ActionListener cancelarListenner = new ActionListener() {

		public void actionPerformed(ActionEvent e) {

			janela.setVisible(false);

		}

	};
	
	public static void main(String[] args) {

	}
}
