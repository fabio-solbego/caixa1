/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa1;

import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class Caixa1 {

 
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        
          double valor,acCredito, acDebito;
        int opcao, cCredito,cDebito;//toda vez que digitar opção 1- D - 2 - c e 0 - sair
        acCredito = 0; acDebito = 0; cCredito = 0; cDebito = 0;
        opcao = 1; 
        while(opcao!=0){
           System.out.println("Digite\n 1 - Debito\n 2 - Credito\n 0 - Sair:");
           opcao = ler.nextInt();
           if(opcao==1){
               System.out.println("Digite o valor do Débito");
               valor = ler.nextDouble();
               acDebito = acDebito + valor;
               cDebito = cDebito + 1;
           }else if(opcao == 2){
               System.out.println("Digite o valor do Crédito");
               valor = ler.nextDouble();
               acCredito = acCredito + valor;
               cCredito = cCredito + 1;
           }else if(opcao == 0){
               System.out.println("O seu saldo do dia é de R$ "
                       +(acCredito - acDebito));
               System.out.println("Bye !!!!");
           }else{
               System.out.println("digite apenas 1 ou 2 ou 0, Xiruzão");
           }//fim do if
        }//fim do loop
        
    }
    
}
