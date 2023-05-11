/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_7;

/**
 *
 * @author unievwatanabe
 */
public class Atividade_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContasBanco contas = new ContasBanco("11.219.035-0", "Vitor Watanabe", new Data(30, 03, 2023));
        
        System.out.println(contas.toString());
        
        contas.abreConta(TipoConta.CORRENTE);
        System.out.println(contas.toString());
        
        contas.abreConta(TipoConta.CORRENTE);
        
        contas.abreConta(TipoConta.SALARIO);
        System.out.println(contas.toString());
        
        contas.abreConta(TipoConta.SALARIO);
        System.out.println(contas.toString());
        
        Corrente cc = contas.getContaCC();
        cc.debitartarSaldo(100); //debitando 100 com 2% de taxa
        System.out.println(cc.toString() + "\n");
        
        cc.debitartarSaldo(10);
        System.out.println(cc.toString() + "\n");
        
        Salario cs1 = contas.getContaSalario().get(0);
        cs1.debitarSaldo(50); // debita R$90 da conta cs1
        
        cs1.debitarSaldo(15);
        System.out.println(cs1.toString() + "\n");
        
        System.out.println(contas.toString());
    }
}
