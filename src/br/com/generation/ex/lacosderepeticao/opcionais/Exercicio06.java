package br.com.generation.ex.lacosderepeticao.opcionais;

import java.util.Scanner;

//Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3.
//Para sair digitar 0(zero).(DO...WHILE)
public class Exercicio06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int valor, media = 0, soma = 0, mult = 0;

		do {
			System.out.println("Digite um valor: ");
			valor = leia.nextInt();
			if (valor % 3 == 0 && valor > 0) {
				soma = soma + valor;
				mult++;
			}

		} while (valor > 0);
		 if(soma > 0 && mult > 0) {
			 media = soma / mult;
		 }
		
		System.out.println("A m�dia dos n�meros digitados multiplos de 3 � de: " + media);

	}

}
