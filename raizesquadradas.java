
package raizesquadradas;

public class raizesquadradas {
 static void Raizesquadradas(int Inf, int sup)
 {for(int I=Inf; I<=sup;I++)
  System.out.println(String.format("%5.1f", Math.sqrt(I)));       }
    
    public static void main(String[] args) 
    {Raizesquadradas(25,36);
    Raizesquadradas(100,120);
    }
    
}