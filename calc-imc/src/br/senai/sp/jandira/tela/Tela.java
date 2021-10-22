package br.senai.sp.jandira.tela;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.calculo.Imc;

public class Tela {

	public void criarTela() {
		
	 Font fontTitulo = new Font("Bahaus 93", Font.BOLD, 22);
	 Font fontTextoNormal = new Font("Arial", Font.BOLD, 14);
	 Font fontSubtittulo = new Font("Arial", Font.BOLD, 18);
	 Font fontResultado = new Font("Arial", Font.BOLD, 14);
	 
	 Color verde = new Color(0, 128,0);
	 Color azul = new Color (0, 0, 180);
		
	 JFrame telaImc = new JFrame();
	 telaImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 telaImc.setSize(400, 600);
	 telaImc.setTitle("Calculadora Imc");
	 telaImc.setLayout(null);
	
	 JLabel lblTitulo = new JLabel();
	 lblTitulo.setText("CALCULO DE IMC");
     lblTitulo.setBounds(100, 20, 300, 100);
     lblTitulo.setFont(fontTitulo);
     lblTitulo.setForeground(azul);
	
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
     
     btnConfirmar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Imc imc = new Imc();
			imc.setPeso(txtPeso.getText());
			imc.setAltura(txtAltura.getText());
			
			lblimc
			
			
		}  	 
    	 
    	 
     }
    
	 telaImc.setVisible(true);
	 
	 
	}

}
