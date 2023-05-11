/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_5;

/**
 *
 * @author unievwatanabe
 */
public class Atividade_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta contas[] = new Conta[3];
        
        contas[0] = new Conta(123, "Vitor");
        contas[1] = new Conta(666, "Gustavo");
        contas[2] = new Conta(787, "Rafael");
        
//        for(int i = 0; i<3; i++) {
//            System.out.println("------------------");
//            System.out.println(contas[i].toString());
//            System.out.println("------------------");
//        }
        
        System.out.println(contas[0].toString());
        contas[0].setLimit(2000); // colocando limite
        contas[0].charge(1000);   // creditando
        System.out.println(contas[0].toString());
        contas[0].withdraw(4000); // debitando
        //mostrando que o limite foi atingido e a operação não foi efetuada
        System.out.println(contas[0].toString());
        
        System.out.println("------------------");
        
        System.out.println(contas[1].toString());
        contas[1].getBalance();
        System.out.println(contas[1].toString());
        
         System.out.println("------------------");
        
        System.out.println(contas[2].toString());
        contas[2].setLimit(10000);
        System.out.println(contas[2].toString());
    }
}
