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
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        
        
        System.out.printf("Nome do aluno 1: ");
        aluno1.setNome(input.next());
        
        System.out.printf("R.A.: ");
        aluno1.setRa(input.nextInt());
        
        System.out.printf("Curso: ");
        aluno1.setCurso(input.next());
        
        System.out.printf("N1: ");
        aluno1.setN1(input.nextDouble());
        
        System.out.printf("N2: ");
        aluno1.setN2(input.nextDouble());
        
        System.out.printf("Nome do aluno 2: ");
        aluno2.setNome(input.next());
        
        System.out.printf("R.A.: ");
        aluno2.setRa(input.nextInt());
        
        System.out.printf("Curso: ");
        aluno2.setCurso(input.next());
        
        System.out.printf("N1: ");
        aluno2.setN1(input.nextDouble());
        
        System.out.printf("N2: ");
        aluno2.setN2(input.nextDouble());
        
        System.out.printf("Nome do aluno 3: ");
        aluno3.setNome(input.next());
        
        System.out.printf("R.A.: ");
        aluno3.setRa(input.nextInt());
        
        System.out.printf("Curso: ");
        aluno3.setCurso(input.next());
        
        System.out.printf("N1: ");
        aluno3.setN1(input.nextDouble());
        
        System.out.printf("N2: ");
        aluno3.setN2(input.nextDouble());
        
        aluno1.dados();
        aluno2.dados();
        aluno3.dados();
    }
}
