package br.com.generation.ex.lacosderepeticao;

import java.util.Scanner;

//Faça um programa que entre com três números e coloque em ordem crescente.
public class Ex02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3,maiorNum=0,medioNum=0,menorNum=0;
		
		System.out.println("Digite o 1º número: ");
		n1 = leia.nextInt();
		maiorNum = n1;
		
		System.out.println("Digite o 2º número: ");
		n2 = leia.nextInt();
		 	if(n2>n1) {
		 		maiorNum = n2;
		 		medioNum= n1;
		 	} else {
		 		medioNum= n2;
		 	}
		 	
		System.out.println("Digite o 3º número: ");
		n3 = leia.nextInt();
			if(n3 < maiorNum && n3 < medioNum) {
				menorNum = n3;
			}
			else if(n3>maiorNum) {
				    menorNum = medioNum;
				    medioNum = maiorNum;
					maiorNum = n3;
					
			}
			else if (n3 > medioNum){
					menorNum = medioNum;
					medioNum = n3;
				}

		System.out.println("O ordem crescente dos números digitados foi:" + menorNum + " , " + medioNum + " , " + maiorNum);
	}

}
