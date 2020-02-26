package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CidadeView {
	
	
	private JFrame janela;
	private JPanel painelDaJanela;
	private JPanel painelTit;
	private JTextField txtCad;
	private JLabel lblcad;
	private JButton btcad;
	private JButton btcanc;

	public void iniciaGui() {
		
		//criando instancias
		janela = new JFrame("Cadastro de Cidade");
		painelDaJanela = (JPanel) janela.getContentPane();
		painelTit= new JPanel();
		txtCad = new JTextField();
		btcad = new JButton("Cadastrar");
		btcanc = new JButton("Cancelar");
		
		lblcad = new JLabel("Cadastrar Cidade");
//		lblcad.setBounds(-303,-30, 10, 20);
		
		//definindo valores dos componentes
		
		txtCad.setBounds(30,55, 300, 30);
		btcad.setBounds(200,110, 100, 30);
		btcanc.setBounds(50,110, 100, 30);
		btcanc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				janela.dispose();
				
			}
		});

		btcad.addActionListener(cancelarListenner);
		
		
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(375, 200);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
		
		painelDaJanela.setBorder(BorderFactory.createEtchedBorder());
		painelDaJanela.add(btcad);		
		painelDaJanela.add(btcanc);		
		painelDaJanela.add(txtCad);
		painelTit.add(lblcad);	
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
