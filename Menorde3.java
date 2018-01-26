
import java.util.Scanner;
public class maiorde3 {
    
    static int menorde3 (int X, int Y, int Z)
    {if (X > Y)
        X = Y;
     if (X > Z)
         X = Z;
    return X;}
    public static void main (String [] args) throws Exception{
        int x, y ,z,a,b,c;
        Scanner LerS = new Scanner(System.in);
        System.out.print("Digite o primeiro valor (x) ");
        x = LerS.nextInt();
        System.out.print("Digite o segundo valor (y) ");
        y = LerS.nextInt();
        System.out.print("Digite o terceiro valor (z) ");
        z = LerS.nextInt();
        System.out.println("Menor = "+ menorde3 (x  , y, z));       
       
    }
    }
    