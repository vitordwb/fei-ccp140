/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_7;

/**
 *
 * @author unievwatanabe
 */
public class Corrente {
    private int numConta;
    private double saldo;
    private double limite;
    
    public Corrente(int numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.limite = 100;
    }
    
    
    public void setNumConta(int numero){
        this.numConta = numero;
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public double getLimite(){
        return this.limite;
    }
    
    public void setLimite(double limite) {
        if(limite >= 0) {
            this.limite = limite;
        } else {
            this.limite = limite * -1;
        }
    }
    
    public boolean debitartarSaldo(double valor) {
        if(valor * 1.02 > this.saldo + this.limite) {
            System.out.println("OPERACAO CANCELADA: VALOR MAIOR QUE O LIMITE");
            return false;
        }
        
        this.saldo -= valor * 1.02;
        return true;
    }
    
    public boolean creditarSaldo(double valor) {
        this.saldo += valor;
        return true;
    }
    
    @Override
    public String toString() {
        return "Conta Corrente{" + "numero: " + numConta + ", saldo: R$ " + saldo + ", limite: R$ " + limite + '}';
    }
}
