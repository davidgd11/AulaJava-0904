package br.com.fiap;

import javax.swing.JOptionPane;

public class ComparaString {

	public static void main(String[] args) {
		
		String senha;
		senha = JOptionPane.showInputDialog("Digite a sua senha: ");
		
		if (senha.equals("P4ssw0rd")) {
			JOptionPane.showMessageDialog(null, "Teste 1: Acesso autorizado!");
		} else {
			JOptionPane.showMessageDialog(null, "Teste 1: Acesso negado!");
		}

		//sem diferenciação de minuscula e maiusculas
		if (senha.equalsIgnoreCase("P4ssw0rd")) {
			JOptionPane.showMessageDialog(null, "Teste 2: Acesso concedido!");
		} else {
			JOptionPane.showMessageDialog(null, "Teste 2: Acesso impedido!");
		}
	}

}
