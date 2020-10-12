package com.mconstantino;

public class PortaTeste {

    public static void main(String[] args) {

        Porta porta1 = new Porta();

        porta1.setAberta(true);
        porta1.setCor("Azul");
        porta1.setDimensaoX(0.70);
        porta1.setDimensaoY(2.10);
        porta1.setDimensaoZ(0.05);

        porta1.fecha();
        porta1.abre();
        porta1.estaAberta();

        System.out.println(porta1.toString());

    }
}
