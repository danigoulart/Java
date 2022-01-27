package br.com.generation.ex.lacosderepeticao.opcionais;
//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)

public class Exercicio01 {

	public static void main(String[] args) {
		for(int i = 1000; i < 2000; i++) {
			if (i % 11 == 5) {
			System.out.println("Valores divididos por 11 que o resto é 5: " + i);
			}
		}

	}

}
