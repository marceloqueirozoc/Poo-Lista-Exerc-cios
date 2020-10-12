package com.mconstantino;

public class Porta {

    private boolean aberta;
    private String cor;
    private float dimensaoX;
    private float dimensaoY;
    private float dimensaoZ;

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(float dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public float getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(float dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public float getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(float dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    public void abre(){
    aberta = true;
    }

    public void fecha(){
    aberta = false;
    }

    public void pinta(String s){
        this.cor = s;
    }

    boolean estaAberta(){
        if (aberta){
            System.out.println("A porta está aberta!");
            return true;
        }
        System.out.println("A porta está fechada!");
        return false;
    }
}
