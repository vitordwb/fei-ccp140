/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_1;

/**
 *
 * @author unievwatanabe
 */
public class Aluno {
    private String nome;
    private int ra;
    private String curso;
    private double n1;
    private double n2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    public double media(double n1, double n2) {
        return (this.n1 + this.n2)/2;
    }
    
    public String aprovado(double media) {
        if (media >= 5) {
            return "aprovado";
        } else {
            return "prova substitutiva";
        }
    }
    
    public void dados () {
        System.out.println("----------------------");
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("R.A.: %d\n", this.ra);
        System.out.printf("Curso: %s\n", this.curso);
        System.out.printf("Media: %.2f\n", this.media(n1, n2));
        System.out.printf("Situacao: %s\n", this.aprovado(this.media(n1, n2)));
    }
}
