/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_2_ex_2;

/**
 *
 * @author unievwatanabe
 */
public class Conta {
    private int number;
    private String name;
    private double balance;
    private double limit;
    
    public void setNumber(int number){
        this.number = number;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setLimit(double limit){
        this.limit = limit;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public double getLimit(){
        return this.limit;
    }
    
    public void withdraw(double value) {
        this.balance = this.balance - value;
        System.out.printf("[withdraw] conta %d Balance = %.2f\n", this. number, this.balance);
    }
    
    public void charge(double value) {
        this.balance = this.balance + value;
        System.out.printf("[charge] conta %d Balance = %.2f\n", this. number, this.balance);
    }
}
