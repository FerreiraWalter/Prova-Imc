package com.example.provaimc.model;

public class Imc {

	private float altura;
	private float peso;
	private float imc;
	private String resultado;
	
	public Imc(float altura, float peso) {
		this.imc = peso/(altura*altura);
	}
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getImc() {
		return imc;
	}
	public void setImc(float imc) {
		this.imc = imc;
	}
	public String getResultado() {
		
		if(imc < 18.5) {
			this.resultado = "IMC: "+ imc +". Classificação: Abaixo do peso, Risco para sua Saúde: Elevado!";
		}else if(imc >= 18.5 && imc < 25) {
			this.resultado = "IMC: "+ imc +". Classificação: Peso ideal, Risco para sua Saúde: Inexistente!";
		}else if(imc >= 25 && imc < 30) {
			this.resultado = "IMC: "+ imc +". Classificação: Excesso de Peso, Risco para sua Saúde: Elevado!";
		}else if(imc >= 30 && imc < 35) {
			this.resultado = "IMC: "+ imc +". Classificação: Obesidade Grau 1, Risco para sua Saúde: Muito Elevado!";
		}else if(imc >= 35 && imc < 40) {
			this.resultado = "IMC: "+ imc +". Classificação: Obseidade Grau 2, Risco para sua Saúde: Muitíssimo Elevado!";
		}else if(imc >= 40) {
			this.resultado = "IMC: "+ imc +". Classificação: Obesidade Grau 3, Risco para sua Saúde: Obesidade Mórbida!";
		}
		
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	
}
