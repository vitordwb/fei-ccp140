/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_2;

/**
 *
 * @author unievwatanabe
 */
public class Produto {
    private String marca;
    private String tipo;
    private double preco;
    private int qtd_estoque;
    private int limite_estoque;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public int getLimite_estoque() {
        return limite_estoque;
    }

    public void setLimite_estoque(int limite_estoque) {
        this.limite_estoque = limite_estoque;
    }
    
    public void venda(int qtd) {
        if (qtd > this.qtd_estoque) {
            System.out.println("quantidade insuficiente");
        } else {
            this.qtd_estoque -= qtd;
        }
    }
    
    public void reposicao(int qtd) {
        if ((this.qtd_estoque + qtd) > this.limite_estoque) {
            System.out.println("estoque insuficiente");
        } else {
            this.qtd_estoque += qtd;
        }
    }
    
    public void dados() {
        System.out.printf("Marca: %s\n", this.marca);
        System.out.printf("Tipo: %s\n", this.tipo);
        System.out.printf("Preco: %.2f\n", this.preco);
        System.out.printf("Qtd em estoque: %d\n", this.qtd_estoque);
        System.out.printf("Limite do produto: %d\n", this.limite_estoque);
    }
}
