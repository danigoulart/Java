package br.com.generation.ex01;
/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos,
 *  meses e dias e mostre-a expressa apenas em dias. 
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); // lê a data
		DateFormat df = new SimpleDateFormat ("dd/MM/yyyy"); // instancia a classe e determina a formatação da data

        System.out.println ("Digite a data no formato dia/mês/ano(dd/mm/yyyy):");
        String dataLida = leia.next();  // vai receber a data informada pelo usuário
        		
        try {
        Date dataConvertida = df.parse (dataLida); //vai converter a data em string recebida do usuario em formato data 
       
        System.out.println ("Data em formato data: " + dataConvertida); // essa é a dataConvertida
        
        String dataFormatada = df.format(dataConvertida);  //formata dessa forma (dd/mm/yyyy) 
        
        System.out.println ("Data informada: " + dataFormatada); //exibe a data formatada bonitinho
        
        Date dataAtual = Calendar.getInstance().getTime(); //Pega a data atual no formato data
        
       // System.out.println ("Data atual em formato Data: " + dataAtual); vai mostrar a data atual em formato data
        
        System.out.println ("Data atual : " + df.format(dataAtual)); // mostra pro usuario a data atual em formato (dd/mm/yyyy)
        
       //System.out.println ("Data atual : " + dataAtual.getTime()); tempo em milisegundos
        
        long dt = (dataAtual.getTime() - dataConvertida.getTime()); //transforma a data atual e a data informada em milisegundos e subtrai 
        
        
        System.out.println (dt / 86400000L + " Dias"); // pega a diferença e divide pelos milisegundos de 1 dia e retorna o resultado de dias de vida da pessoa
        
        } catch (ParseException e) {  //tratamento para possível erro de digitação do usuário 
            System.out.println ("Data em formato inválido");        	
		}
	}

}
