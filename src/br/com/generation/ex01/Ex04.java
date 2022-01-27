package br.com.generation.ex01;
/*4. Escreva  um sistema que leia três números inteiros 
e positivos (A, B, C) e calcule a seguinte expressão: 
*/
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int A=0, B=0, C=0;
		double D=0, R=0, S=0;
		
		System.out.println("Digite um valor para A: ");
		A = leia.nextInt();
		
		System.out.println("Digite um valor para B: ");
		B = leia.nextInt();
		
		System.out.println("Digite um valor para C: ");
		C = leia.nextInt();
		
		if(A>=0 && B >=0 && C>=0) {
			S = B + C;
			S = Math.pow(S,2);
			
			R = A + B;
			R = Math.pow(R, 2);	
			
			D = (R + S) / 2;
		}
		
		System.out.println("O valor de D é: " + D);
		System.out.println("O valor de S é: " + S);
		System.out.println("O valor de R É: " + R);                    		
	}

}
