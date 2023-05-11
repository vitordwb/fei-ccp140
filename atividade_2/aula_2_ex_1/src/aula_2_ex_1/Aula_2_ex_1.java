/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula_2_ex_1;

/**
 *
 * @author unievwatanabe
 */
public class Aula_2_ex_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta conta01 = new Conta();
        conta01.number = 123;
        conta01.name = "João";
        conta01.balance = 1000;
        conta01.limit = 2000;
        
        Conta conta02 = new Conta();
        conta02.number = 666;
        conta02.name = "Danilo";
        conta02.balance = 100000;
        conta02.limit = 2000;
        
        Conta conta03 = new Conta();
        conta03.number = 420;
        conta03.name = "Gorgonoid";
        conta03.balance = 420000;
        conta03.limit = 2000;
        
        System.out.printf("Initial balance = %.2f\n", conta01.balance);
        conta01.withdraw(500);
        conta01.charge(900);
        
        System.out.printf("Initial balance = %.2f\n", conta02.balance);
        conta02.withdraw(5000);
        conta02.charge(9000);
        
        System.out.printf("Initial balance = %.2f\n", conta03.balance);
        conta03.withdraw(5000);
        conta03.charge(9000);
    }
}
