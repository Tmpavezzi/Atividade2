import java.util.Scanner;
/*Ler um número inteiro N e calcular e imprimir todos os seus divisores. Exemplo: para o número 6, temos os
seguintes divisores 1, 2, 3, 6. Utilize o laço que lhe for mais conveniente.*/

class Main {
  public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

    System.out.print ("um numero :");
    int n = entrada.nextInt();
    int i;
   for( i=1;i<=n;i++){
     
     if(n%i==0){
       System.out.print("1 Divisor :" + i + "\n");
     }
     
     
   }
     System.out.print("\n");
    int ct = 1;
    while (ct<=n){
      
      
       if(n%ct==0){
       System.out.print("2 Divisor :" + ct + "\n" );
         
     }
      ct++;
    }
   
      
    
    
    
    
    
  }  
}
