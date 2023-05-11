/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula_2_ex_2;

/**
 *
 * @author unievwatanabe
 */
public class Aula_2_ex_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta conta01 = new Conta();
        conta01.setNumber(123);
        conta01.setName("John Wick");
        conta01.setLimit(2000);
        
        System.out.printf("Initial balance = %.2f\n", conta01.getBalance());
        conta01.charge(900);
        conta01.withdraw(500);
        
        
        Conta conta02 = new Conta();
        conta02.setNumber(420);
        conta02.setName("Snoop Dog");;
        conta02.setLimit(2000);
        
        System.out.printf("Initial balance = %.2f\n", conta02.getBalance());
        conta02.charge(420);
        conta02.withdraw(90);
        
        Conta conta03 = new Conta();
        conta03.setNumber(666);
        conta03.setName("Devil");
        conta03.setLimit(2000);
        
        System.out.printf("Initial balance = %.2f\n", conta03.getBalance());
        conta03.charge(78);
        conta03.withdraw(100);
    }
    
}
