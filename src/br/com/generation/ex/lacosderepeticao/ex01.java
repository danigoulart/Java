package br.com.generation.ex.lacosderepeticao;
//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3, maiorNum;
		
		System.out.println("Digite o 1� n�mero: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		n3 = leia.nextInt();
		
		if(n1 >= 0 && n1 > n2 && n1 > n3) {
			maiorNum = n1;
			System.out.println("O 1� n�mero foi o maior n�mero digitado.");			
		}
		else if(n2 >= 0 &&  n2 > n3) {
			System.out.println("O 2� n�mero foi o maior n�mero digitado.");			
		}
		else if(n3 >= 0){
			System.out.println("O 3� n�mero foi o maior n�mero digitado.");
		}
		else {
			System.out.println("Voc� digitou valores inv�lidos!");
		}
		
		leia.close();
	}

}
