/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_2;

import java.util.Scanner;

/**
 *
 * @author unievwatanabe
 */
public class Exercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor por hora:");
        float preco = input.nextFloat();
        
        System.out.println("Digite a quantidade de horas trabalhadas");
        float horas = input.nextFloat();
        
        double salario = preco * horas;
        double ir = salario * 0.11;
        double inss = salario * 0.08;
        double sindicato = salario * 0.05;
        double total = salario - ir - inss - sindicato;
        
        System.out.printf("salario bruto: %.2f\n", salario);
        System.out.printf("IR: %.2f\n", ir);
        System.out.printf("INSS: %.2f\n", inss);
        System.out.printf("sindicato: %.2f\n", salario);
        System.out.printf("salario liquido: %.2f\n", total);
    }
}
