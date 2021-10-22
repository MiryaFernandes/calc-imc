package br.senai.sp.jandira.calculo;

public class Imc {
	
	 private double peso;
	 private double altura;
	 
	 public double getPeso() {
		return peso;
	}
	 
	 public void setPeso(String peso) {
		this.peso = Double.parseDouble(peso);
	}
	 
	 public double getAltura() {
		return altura;
	}
	 
	 public void setAltura(String altura) {
		this.altura = Double.parseDouble(altura);
	}
	 
	public double calcularImc(){
		
		return peso/ (altura*altura);  
		
	}
	
	public String mostrarStatusImc(){
		
		if(calcularImc() < 18.5){
			
			return "Abaixo do peso!";
			
		} else if (calcularImc()>= 18.5 && calcularImc() < 25) {
			
			return "Peso ideal!";
			
		} else if (calcularImc() >= 25 && calcularImc() < 30) {
			
			return "Levemente acima do peso!";
			
		} else if (calcularImc() >= 30 && calcularImc() < 35) {
			
			return "Obesidade grau 1";
			
		} else if (calcularImc() >= 35 && calcularImc() < 40) {
			
			return "Obesidade grau 2";
			
		} else {
			
			return "Obesidade grau 3";
			
		}
		
	}
	
}
