package escolhaconversao;
import java.util.Scanner ;
public class EscolhaConversao {
static int Binario_para_decimal(int binario){
 
    int decimal = 0;
    int p = 0;
    while(true)
    {
      if(binario == 0){
        break;
      } else {
          int temp = binario%10;
          decimal += temp*Math.pow(2, p);
         binario = binario/10;
          p++;
       }
    }
    return decimal;
  }
     
    public static void main(String[] args) {
      Scanner LerS = new Scanner (System.in);
      int opcao = 0;
   
      String Escolha;
      
      
     System.out.println("Converte");
     System.out.println(" <-- Opções --> ");
     System.out.println("Tecla = 1 --> Binario Para Decimal");
     System.out.println ("Tecla = 2 --> Octal em Decimal");
     System.out.println ("Tecla = 3 --> Hexadecimal em Decimal");
     System.out.println ("Tecla = 4 --> Decimal em Binario");
     System.out.println ("Tecla = 5 --> Decimal em Octal");
     System.out.println ("Tecla = 6 --> Decimal em Hexadecimal");
     System.out.println ("     Voltar atras no menu (Tecla (0)");
     System.out.println (" ---------------------------------------  ");
      System.out.println (" Escolha a opção --> ");
      Escolha = LerS.next();
      
     switch (Escolha)  {
         case "0":
             System.out.println (" Adeus :D By: Francisco Sousa");
         System.exit (0);
             break;
         case "1":
             System.out.println("Qual o numero Binario ? " );
              int x= LerS.nextInt();   
 
 System.out.println( x+ " :D --> "+Binario_para_decimal(x));
             
             }
  
          
             }
 
  }

    

