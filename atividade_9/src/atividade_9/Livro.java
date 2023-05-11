/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_9;

/**
 *
 * @author unievwatanabe
 */
public class Livro extends Produto {
    private String autor;
    private Data dataPublicacao;

    public Livro(String nome, double preco, String autor, Data dataPublicacao) {
        super(nome, preco);
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public Data getDataPublicacao() {
        return dataPublicacao;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDataPublicacao(Data dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", preco=" + preco + ", autor=" + autor + ", dataPublicacao=" + dataPublicacao + "]";
    }
}
