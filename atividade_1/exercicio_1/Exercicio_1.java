/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_1;

import java.util.Scanner;

/**
 *
 * @author unievwatanabe
 */
public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite N1: ");
        float nota1 = input.nextFloat();
        
        System.out.println("Digite N2: ");
        float nota2 = input.nextFloat();
        
        System.out.println("Digite N3: ");
        float nota3 = input.nextFloat();
        
        float media = (nota1 + nota2*2 + nota3*3)/6;
        
        String resultado = media >= 5 ? "Aprovado" : "Reprovado";
        
        System.out.println(resultado);
    }
}
