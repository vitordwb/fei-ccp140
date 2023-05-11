/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_9;

/**
 *
 * @author unievwatanabe
 */
public class DVD extends Produto{
    private int anoEstreia;
    private double duracao;

    public DVD(String nome, int anoEstreia, double duracao, double preco) {
        super(nome, preco);
        this.anoEstreia = anoEstreia;
        this.duracao = duracao;
    }

    public int getAnoEstreia() {
        return anoEstreia;
    }

    public void setAnoEstreia(int anoEstreia) {
        this.anoEstreia = anoEstreia;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "DVD [nome=" + nome + ", preco=" + preco + ", anoEstreia=" + anoEstreia + ", duracao=" + duracao + "]";
    }
}
