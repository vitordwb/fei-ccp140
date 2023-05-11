/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_9;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author unievwatanabe
 */
public class CD extends Produto {
    private ArrayList<String> faixas = new ArrayList<>();

    public CD(String nome, double preco) {
        super(nome, preco);
    }
    
    public void adionaFaixa(String nome) {
        this.faixas.add(nome);
    }

    @Override
    public String toString() {
        return "CD{" + "faixas=" + faixas + '}';
    }
}
