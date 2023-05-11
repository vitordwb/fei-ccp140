/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_2;

/**
 *
 * @author unievwatanabe
 */
public class Exercico_2 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setMarca("Apple");
        produto1.setTipo("Celular");
        produto1.setPreco(999);
        produto1.setLimite_estoque(10);
        
        produto1.venda(1);
        produto1.reposicao(11);
        produto1.reposicao(8);
        produto1.venda(1);
        produto1.dados();
    }   
}
