package br.com.fiap;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class FormataData {

	public static void main(String[] args) {
		
		LocalDate dataAtual = LocalDate.now();
		LocalDate fimDosTempos = LocalDate.parse("2012-12-21");
		
		Period periodo = Period.between(fimDosTempos, dataAtual );
		String tempoBonus = "Desde o fim dos tempos, passaram:"
				+ "\n " + periodo.getYears() + " anos"
						+ "\n " + periodo.getMonths() + " meses"
								+ "\n " + periodo.getDays() + " dias";
		
		JOptionPane.showMessageDialog(null, tempoBonus);
		
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada = fimDosTempos.format(dft);
		JOptionPane.showMessageDialog(null, dataFormatada);

	}

}
