/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_7;

import java.util.ArrayList;

/**
 *
 * @author unievwatanabe
 */
public class ContasBanco {
    private final String nome;
    private final String cpf;
    private final Data clienteDesde;
    private Corrente contaCC;
    private ArrayList<Salario> contaSalario = new ArrayList();
    
    
    public ContasBanco(String nome, String cpf, Data clienteDesde) {
        this.nome = nome;
        this.cpf = cpf;
        this.clienteDesde = clienteDesde;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public Corrente getContaCC() {
        return this.contaCC;
    }
    
    public ArrayList<Salario> getContaSalario() {
        return this.contaSalario;
    }
    
    public boolean abreConta(TipoConta tipoConta) {
        switch(tipoConta) {
            case CORRENTE -> {
                
                if(this.contaCC != null) {
                    System.out.println("Conta Corrente ja existe");
                    break;
                }
                
                this.contaCC = new Corrente(1, 100);
                System.out.println("\nConta Aberta");
                return true;
            }
            
            case SALARIO -> {

                final int numConta = this.contaSalario.size() + 1;
                this.contaSalario.add(new Salario(numConta, 100));
                
                System.out.println("Conta Salario aberta\n");
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        int numConta = 0;
        if (contaCC != null) numConta = contaCC.getNumConta();
        return "Contas -> CPF: " + cpf + ", nome: " + nome + ", cliente desde: " + clienteDesde.toString() + ", numero da Conta Corrente: " + numConta;
    }
}
