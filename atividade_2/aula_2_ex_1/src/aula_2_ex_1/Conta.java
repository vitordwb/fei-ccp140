/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_2_ex_1;

/**
 *
 * @author unievwatanabe
 */
public class Conta {
    public int number;
    public String name;
    public double balance;
    public double limit;
    
    public void withdraw(double value) {
        this.balance = this.balance - value;
        System.out.printf("[withdraw] conta %d Balance = %.2f\n", this. number, this.balance);
    }
    
    public void charge(double value) {
        this.balance = this.balance + value;
        System.out.printf("[charge] conta %d Balance = %.2f\n", this. number, this.balance);
    }
}
