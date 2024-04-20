package br.edu.cesarschool.cc.poo.ac.utils;

public class ValidadorCPF {
	
	private ValidadorCPF() {		
	}

	public static boolean isCpfValido(String cpf) {
		
		if (cpf == null || cpf.length() != 11 || !cpf.matches("[0-9]+")) {
			return false;
		}

		int soma = 0, resto;
		for (int i = 0; i < 9; i++) {
			soma += Integer.parseInt(cpf.substring(i, i + 1)) * (10 - i);
		}
		resto = 11 - (soma % 11);
		int primeiroDigitoVerificador = (resto > 9) ? 0 : resto;

		soma = 0;
		for (int i = 0; i < 10; i++) {
			soma += Integer.parseInt(cpf.substring(i, i + 1)) * (11 - i);
		}
		resto = 11 - (soma % 11);
		int segundoDigitoVerificador = (resto > 9) ? 0 : resto;
		
		return primeiroDigitoVerificador == Character.getNumericValue(cpf.charAt(9)) &&
				segundoDigitoVerificador == Character.getNumericValue(cpf.charAt(10));
	}

}
