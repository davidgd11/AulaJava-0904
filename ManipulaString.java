package br.com.fiap;

import javax.swing.JOptionPane;

public class ManipulaString {

	public static void main(String[] args) {
		
		String frase = "O rato roeu a roupa do rei de Roma";
		JOptionPane.showConfirmDialog(null, frase);
		//Exibindo a quantidade de caracteres
		int qtChar = frase.length();
		JOptionPane.showMessageDialog(null, qtChar);
		//Exibindo a frase em maiuscula
		String maiuscula = frase.toUpperCase();
		JOptionPane.showMessageDialog(null, maiuscula);
		//Exibindo a frase em minuscula
		String minuscula = frase.toLowerCase();
		JOptionPane.showMessageDialog(null, minuscula);
		//Exibindo os caracteres que estao presentes conforme os numeros
		String palavra = frase.substring(30,34);
		JOptionPane.showMessageDialog(null, palavra);
		//Substituindo a palavra "roupa" por "parade"
		String frase2 = frase.replace("roupa", "parede");
		JOptionPane.showMessageDialog(null, frase2);
	

	}

}
