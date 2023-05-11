/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_3;

import java.util.Scanner;

/**
 *
 * @author unievwatanabe
 */
public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float total = 0;
        int contador = 0;
        
        while (true){
            System.out.println("Digite um numero:");
            float num = input.nextFloat();
            if (num == 0) break;
            
            total += num;
            contador++;
        }
        
        System.out.printf("Quantidade de numeros digitados: %d\n", contador);
        System.out.printf("Soma dos numeros digitados: %.2f\n", total);
        System.out.printf("Media aritimetica dos numeros digitados: %.2f\n", total / contador);
    }
}
