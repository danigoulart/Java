package br.com.generation.ex.lacosderepeticao.opcionais;

import java.util.Scanner;

//Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a
//soma dos números digitados.(DO...WHILE)
public class Exercicio05 {

	public static void main(String[] args) {
		int valor=0, soma = valor;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			valor = leia.nextInt();
			soma += valor;
			
			
		} while(valor > 0);
		System.out.println("Somando todos os valores digitados, temos: " + soma);
	}

}
