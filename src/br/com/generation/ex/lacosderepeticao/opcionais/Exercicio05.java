package br.com.generation.ex.lacosderepeticao.opcionais;

import java.util.Scanner;

//Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a
//soma dos n�meros digitados.(DO...WHILE)
public class Exercicio05 {

	public static void main(String[] args) {
		int valor=0, soma = valor;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um n�mero: ");
			valor = leia.nextInt();
			soma += valor;
			
			
		} while(valor > 0);
		System.out.println("Somando todos os valores digitados, temos: " + soma);
	}

}
