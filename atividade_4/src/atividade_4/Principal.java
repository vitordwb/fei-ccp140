/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_4;

/**
 *
 * @author unievwatanabe
 */
public class Principal {
    public static void main(String[] args) {
        
        Televisao tv1 = new Televisao();
        Televisao tv2 = new Televisao(8, 15);
        Televisao tv3 = new Televisao(64, 10, false);
        
        // validação mostrando que quando desligada, a televisão não realiza
        // operação
        System.out.println(tv1.getCanal()); //canal 1
        System.out.println(tv1.getSom()); // 0
        System.out.println(tv1.getLigada()); // desligada
        tv1.subirCanal();
        tv1.aumentarVolume();
        System.out.println(tv1.getCanal());  //canal 1
        System.out.println(tv1.getSom());    // 0
        System.out.println(tv1.getLigada()); // desligada
        System.out.println(tv1.toString());  // dados resumidos
        
         System.out.println("----------");
        
        //tv ligada
        tv1.ligaOuDesligaTv();
        System.out.println(tv1.getLigada()); // ligada
        tv1.subirCanal();
        tv1.aumentarVolume();
        System.out.println(tv1.getCanal()); //canal 2
        System.out.println(tv1.getSom()); // 1
        System.out.println(tv1.getLigada()); // ligada
        System.out.println(tv1.toString());
        
        // tv2 desligada
        System.out.println(tv2.toString());
        // ligando
        tv2.ligaOuDesligaTv();
        // metodo reduzir volume
        tv2.reduzirVolume();
        // metodo descer canal
        tv2.descerCanal();
        System.out.println(tv2.toString());
        
        System.out.println("-----------");
        
        // testando os limites com o tv3
        System.out.println(tv3.toString());
        tv3.ligaOuDesligaTv(); // liga tv
        tv3.subirCanal();
        tv3.aumentarVolume();
        System.out.println(tv3.toString()); // mantem os valores
    }
}
