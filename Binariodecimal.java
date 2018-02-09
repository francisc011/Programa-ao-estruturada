package binariodecimal;

import java.util.Scanner;

public class Binariodecimal {

    public static void main(String[] args) { 
	Scanner dados = new Scanner (System.in);
		long num;
		System.out.println("Qual o numero binario");
		num = dados.nextInt();
	     int decimal = converterbinarioparadecimal(num);
        System.out.printf("%d em binario = %d em decimal", num, decimal);
    }

    public static int converterbinarioparadecimal(long num)
    {
        int decimalNumero = 0, i = 0;
        long remainder;
        while (num != 0)
        {
            remainder = num % 10;
            num /= 10;
            decimalNumero += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumero;
    }
	}
    
    

