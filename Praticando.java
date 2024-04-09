package br.com.fiap;

import javax.swing.JOptionPane;

public class Praticando {

	public static void main(String[] args) {
		
		String frase;
		frase = JOptionPane.showInputDialog("Digite uma frase: ");

		JOptionPane.showMessageDialog(null, frase);
		
		int qtChar = frase.length();
		JOptionPane.showMessageDialog(null, qtChar);
		
		String maiuscula = frase.toUpperCase();
		JOptionPane.showMessageDialog(null, maiuscula);
		
		String frase2 = JOptionPane.showInputDialog("Digite uma palavra que você digitou "
				+ "na frase anterior para ser trocada: ");
		String frase3 = JOptionPane.showInputDialog("Digite a palavra que você deseja "
				+ "trocar: ");
		
		String frase4 = frase.replace(frase2, frase3);
		JOptionPane.showMessageDialog(null, frase4);
		
		int qtChar1 = frase4.length();
		JOptionPane.showMessageDialog(null, qtChar1);
	}

}
