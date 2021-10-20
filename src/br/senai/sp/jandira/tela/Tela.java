package br.senai.sp.jandira.tela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {

	public void criarTela() {
		
	JFrame telaImc = new JFrame();
	telaImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	telaImc.setSize(400, 600);
	telaImc.setTitle("Calculadora Imc");
	telaImc.setLayout(null);
	
	JLabel lblTitulo = new JLabel();
	lblTitulo.setText("CALCULO DE IMC");
    lblTitulo.setBounds(150, 20, 110, 100);
	
	JLabel lblAltura = new JLabel();
	lblAltura.setText("Sua altura: ");
	lblAltura.setBounds(90, 150, 90, 90); 
	
	JLabel lblPeso = new JLabel();
	lblPeso.setText("Seu peso: ");
	lblPeso.setBounds(90, 90, 90, 90);
	
	JTextField txtAltura = new JTextField();
	txtAltura.setText(null);
	txtAltura.setBounds(160, 180, 130, 30);
		
	JTextField txtPeso = new JTextField();
	txtPeso.setText(null);
	txtPeso.setBounds(160, 120, 130, 30);
	
	JButton btnConfirmar = new JButton();
    btnConfirmar.setText("CALCULAR");
    btnConfirmar.setBounds(150, 250, 100, 45);
	
    
    telaImc.getContentPane().add(btnConfirmar);
    telaImc.getContentPane().add(txtPeso);
    telaImc.getContentPane().add(lblPeso);
    telaImc.getContentPane().add(txtAltura);
    telaImc.getContentPane().add(lblAltura);
    telaImc.getContentPane().add(lblTitulo);
    
	telaImc.setVisible(true);
	}

}
