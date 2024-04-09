package br.com.fiap;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Praticando2 {

	public static void main(String[] args) {
		
		LocalDate dataInicio = LocalDate.parse("2005-02-15");
		LocalDate dataFinal = LocalDate.parse("2015-01-22");
		
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		String dataFormatada1 = dataInicio.format(dft);
		String dataFromatada2 = dataFinal.format(dft);
		
		Period periodo = Period.between(dataInicio, dataFinal);
		String mensagem = "Data inicial: " + dataFormatada1
				+ "\nData final: " + dataFromatada2 
				+ "\nEntre as datas fornecidas existem " + periodo.getYears() + " ano(s) "
				+ periodo.getMonths() + " mes(es) " + periodo.getDays() + " dia(s)!";
		
		JOptionPane.showMessageDialog(null, mensagem);
		
	}

}
