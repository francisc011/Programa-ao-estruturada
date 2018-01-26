package Pacote1;

import java.util.Scanner;

public class Maiorde3 {

	public static void main(String[] args) {
		Scanner dados = new Scanner (System.in);
		double n1, n2, n3, maior;
		//Variaveis
		System.out.println("Qual o primeiro numero?");
		n1 = dados.nextDouble();
		System.out.println("Qual o segundo numero?");
		n2 = dados.nextDouble();
		System.out.println("Qual o terceiro numero?");
		n3 = dados.nextDouble();
		
		if (n1>n2)
			maior = n1;
		else if (n2>n3)
			maior = n2;
		else 
			maior = n3;
		System.out.print("Maior = " + maior);
		
				
		

	}

}