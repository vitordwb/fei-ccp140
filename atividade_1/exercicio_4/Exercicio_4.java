/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author unievwatanabe
 */
public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // holds the number of iterations
        int ITERATIONS = 100;
        
        int maximo = 0;
        int atualizado = 0;
        
        for(int i = 0; i < ITERATIONS; i++) {
            Random random = new Random();
            int num = random.nextInt();
            
            if (maximo >= num) continue;
            
            maximo = num;
            atualizado++;
        }
        
        System.out.printf("Maior numero gerado: %d\n", maximo);
        System.out.printf("O maior numero foi alterado %d vezes \n", atualizado);
    }
}
