package com.mconstantino;

public class Casa {

    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;
    int i;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Porta getPorta1() {
        return porta1;
    }

    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }

    public Porta getPorta2() {
        return porta2;
    }

    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }

    public Porta getPorta3() {
        return porta3;
    }

    public void setPorta3(Porta porta3) {
        this.porta3 = porta3;
    }

    public void quantasPortasEstaoAbertas(){

        if (porta1.isAberta()){
            i += 1;
        }
        if (porta2.isAberta()){
            i += 1;
        }
        if (porta3.isAberta()){
            i += 1;
        }
        System.out.println("Existem " + i + " portas abertas");
    }
}
