/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_7;

/**
 *
 * @author unievwatanabe
 */
public class Salario {
    private int numConta;
    private double saldo;
    
    public Salario(int numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
    public boolean debitarSaldo(double valor) {
        if(valor > this.saldo){
            System.out.println("over the limit | operation canceled");
            return false;
        } else {
            this.saldo = this.saldo - valor;
            System.out.printf("[withdraw] conta %d Balance = %.2f\n", this.numConta, this.saldo);
            return true;
        }
    }
    
    public boolean cretidarSaldo(double valor) {
        this.saldo = this.saldo + valor;
        System.out.printf("[charge] conta %d Balance = %.2f\n", this.numConta, this.saldo);
        return true;
    }
    
    @Override
    public String toString() {
        return "Conta Salario:{" + "numero: " + numConta + ", saldo: R$ " + saldo + '}';
    }
}
