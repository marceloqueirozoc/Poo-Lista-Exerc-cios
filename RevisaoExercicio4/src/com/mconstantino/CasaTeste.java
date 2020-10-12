package com.mconstantino;

public class CasaTeste {

    public static void main(String[] args) {


        Porta porta1 = new Porta();
        porta1.setAberta(false);
        porta1.setCor("Amarelo");
        porta1.setDimensaoX(0.70);
        porta1.setDimensaoY(2.10);
        porta1.setDimensaoZ(0.05);


        Porta porta2 = new Porta();
        porta2.setAberta(false);
        porta2.setCor("Cinza");
        porta2.setDimensaoX(0.70);
        porta2.setDimensaoY(2.10);
        porta2.setDimensaoZ(0.05);

        Porta porta3 = new Porta();
        porta3.setAberta(true);
        porta3.setCor("Azul");
        porta3.setDimensaoX(0.70);
        porta3.setDimensaoY(2.10);
        porta3.setDimensaoZ(0.05);

        Casa casa1 = new Casa();
        casa1.setCor("Branco");
        casa1.setPorta1(porta1);
        casa1.setPorta2(porta2);
        casa1.setPorta3(porta3);

        porta1.abre();
        porta2.fecha();
        porta3.abre();

        casa1.quantasPortasEstaoAbertas();
    }
}
