import java.util.Scanner;
/*Escreva um programa capaz de ler o saldo inicial de uma conta bancária e um número indeterminado de
operações de depósito e saque.
O usuário deve digitar “1” para realizar um depósito, “2” para realizar um saque.
Após digitar o código da operação, o usuário deve digitar o valor. As operações devem continuar sendo
realizadas até que o usuário digite o código de operação “3”.
Ao digitar “3”, o programa deve ser encerrado e o saldo final da conta deve ser impresso com as seguintes
mensagens: CONTA ZERADA (caso o saldo final seja 0), CONTA ESTOURADA (se o saldo for negativo) ou
CONTA PREFERENCIAL (se o saldo for positivo).
Utilize o laço DO-WHILE.*/

class Main {
  public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);
int menu;
    System.out.println("Valor Saldo inicial: ");
double n = entrada.nextInt();
    
    do {
      System.out.println("\nMenu\n1 - Deposito\n2- Saque\n3- Sair");
      menu = entrada.nextInt();
      
      switch(menu){
        case 1 :
          System.out.println("Digite o valor do deposito: ");
          double deposito = entrada.nextInt();
          n = n + deposito;
          System.out.print(n);
          break;
        case 2:
          System.out.println("Digite o valor do saque: ");
          double saque = entrada.nextInt();
          n = n - saque;
          System.out.println(n);
          
          break;
        case 3 :
          if(n==0){
            System.out.println("Conta zerada");
            System.out.println(n);
            
          }else if(n<0){
            System.out.println("Conta Estourada");
              System.out.println(n);
          }else if (n>0){
            System.out.println("Conta Preferencial");
            System.out.println(n);
          }
          break ;
        default:
          System.out.println("Entrada Invalida");
          break;
      }
        
    }while(menu!=3);
      
      
    
    
      
    
    
    
    
    
  }  
}
