package br.com.generation.ex.lacosderepeticao;

import java.util.Scanner;

/* Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
 */
public class ex03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade=0;
		
		System.out.println("Digite a sua idade para descobrir em que categoria voc� se encaixa: ");
		idade = leia.nextInt();		
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("A sua categoria � Infantil.");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("A sua categoria � Juvenil.");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("A sua categoria � Adulto.");
		}
		
		leia.close();
	}

}
