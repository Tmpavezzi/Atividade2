import java.util.Scanner;




class Main {
  public static void main(String[] args) {
    /*1. Faça um programa que leia um número N do usuário, some todos os números inteiros de 1 a N, e mostre o
resultado obtido. Use o laço WHILE.*/
    
    int n = 0 ;
    int contador = 1;
    int Soma = 0;
     Scanner entrada = new Scanner (System.in);
    System.out.print("Um numero");
    n = entrada.nextInt();

    
     while(contador <= n){
       Soma = contador + n;
       contador  ++;
       
     } System.out.print(Soma);
       

    
    }
  }
