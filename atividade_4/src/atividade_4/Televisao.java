/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_4;

/**
 *
 * @author unievwatanabe
 */
public class Televisao {
    private int canal;
    private int som;
    private boolean ligada;
    
    Televisao() {
        this.canal = 1;
        this.som = 0;
        this.ligada = false;
    }
    
    Televisao(int canal, int som) {
        this.canal = canal;
        this.som = som;
    }
    
    Televisao(int canal, int som, boolean ligada) {
        this.canal = canal;
        this.som = som;
        this.ligada = ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (this.ligada && canal >= 0 && canal <= 65) this.canal = canal;
    }

    public int getSom() {
        return som;
    }

    public boolean getLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    
    public String toString() {
        return "Televisao{" + "canal=" + canal + ", som=" + som + ", ligada=" + ligada + '}';
    }
    
    public void aumentarVolume() {
        if (!ligada) {
            System.out.println("desligada");
        } else {
            if (this.som == 10) {
            System.out.println("volume 10");
        } else {
            this.som = this.som + 1;
        }
        }
    }
    
    public void reduzirVolume() {
        if (!ligada) {
            System.out.println("desligada");
        } else {
            if (this.som == 0 ) {
            System.out.println("volume 0");
        } else {
            this.som = this.som - 1;
        }
        }
    }
    
    public void subirCanal() {
        if (!ligada) {
            System.out.println("desligada");
        } else {
            if (this.canal == 64) {
            System.out.println("maximo 64");
            } else {
                this.canal = this.canal + 1;
            }
        }
    }
    
    public void descerCanal() {
        if (!ligada) {
            System.out.println("desligada");
        } else {
            if (this.canal == 1 ) {
            System.out.println("minimo 1");
            } else {
                this.canal = this.canal - 1;
            }
        }
    }
    
    public void ligaOuDesligaTv() {
        this.ligada = !this.ligada;
    }
}
