package br.edu.cesarschool.cc.poo.ac.utils;

public class StringUtils {
	
	private StringUtils() {		
	}
	
	public static boolean isVaziaOuNula(String valor) {
		
		boolean bol = false;
		
		if (valor == null || valor.isEmpty()) {
			bol = true;		
		}		
		
		return bol;
	}

}
