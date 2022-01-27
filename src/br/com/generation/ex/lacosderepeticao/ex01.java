package br.com.generation.ex.lacosderepeticao;
//Faça um programa que receba três inteiros e diga qual deles é o maior.

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3, maiorNum;
		
		System.out.println("Digite o 1º número: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o 2º número: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o 3º número: ");
		n3 = leia.nextInt();
		
		if(n1 >= 0 && n1 > n2 && n1 > n3) {
			maiorNum = n1;
			System.out.println("O 1º número foi o maior número digitado.");			
		}
		else if(n2 >= 0 &&  n2 > n3) {
			System.out.println("O 2º número foi o maior número digitado.");			
		}
		else if(n3 >= 0){
			System.out.println("O 3º número foi o maior número digitado.");
		}
		else {
			System.out.println("Você digitou valores inválidos!");
		}
		
		leia.close();
	}

}
