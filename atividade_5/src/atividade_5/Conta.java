/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_5;

/**
 *
 * @author unievwatanabe
 */
public class Conta {
    private int number;
    private String name;
    private double balance;
    private double limit;

    public Conta(int number, String name) {
        this.number = number;
        this.name = name;
        this.balance = 0;
        this.limit = 0;
    }
    
    
    
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
        if(value > this.balance + this.limit){
            System.out.println("over the limit | operation canceled");
        } else {
            this.balance = this.balance - value;
        System.out.printf("[withdraw] conta %d Balance = %.2f\n", this. number, this.balance);
        }
    }
    
    public void charge(double value) {
        this.balance = this.balance + value;
        System.out.printf("[charge] conta %d Balance = %.2f\n", this. number, this.balance);
    }
    
    public String toString() {
        return "Conta " + number + "\nnome: " + name + "\nsaldo: " + balance + "\nlimite: " + limit;
        // Conta 123
        // nome: Vitor
        // saldo: 6000
        // limite: 4000 
    }
}
