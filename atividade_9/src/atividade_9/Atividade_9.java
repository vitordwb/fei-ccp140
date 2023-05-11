/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_9;

/**
 *
 * @author unievwatanabe
 */
public class Atividade_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produto p1 = new Produto("Celular", 999);
        Produto p2 = new Produto("Camera", 180);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
        // modificando o nome e preco do produto
        p1.setPreco(500);
        p1.setNome("Telescopio");
        System.out.println(p1.toString());
        
        // livros
        Livro b1 = new Livro("Lord of flies", 100, "Willian Golding", new Data(10, 05, 1984));
        Livro b2 = new Livro("O Profeta", 45, "Khalil Gibran", new Data(25, 11, 1800));
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        
        // modificando a data de publicacao
        b1.setDataPublicacao(new Data(25, 06, 1989));
        b2.getDataPublicacao().setAno(1900);
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        
        // CDs
        CD c1 = new CD("Rock 'n' Roll", 99);
        CD c2 = new CD("Jazz", 180);
        c1.adionaFaixa("The Beatles");
        c2.adionaFaixa("B B King");
        c2.adionaFaixa("Duke Ellington");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
            
        // DVDs
        DVD d1 = new DVD("Nada de novo no front", 2023, 2.30, 90);
        DVD d2 = new DVD("Nada de novo no front", 2020, 3.00, 120);
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        
    }
    
}
