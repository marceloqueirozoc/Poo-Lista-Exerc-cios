package com.mconstantino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Bingo {
    public static void main(String[] args) {
        int acertos = 0;

        int cartela[][] = new int[6][4];
        Random random = new Random();

        List<Integer> nexist = new ArrayList<Integer>();

        int contagem = 0;

        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 4; j++) {

                boolean response;
                int aux;

                do {
                    aux = random.nextInt(75);
                    response = verificarVetor(nexist, aux);
                    if (!response){
                        nexist.add(aux);
                    }
                }   while (response);

                cartela[i][j] = aux;


            }
        }

        List<Integer> lstnumeros = new ArrayList<Integer>();

        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 4; j++) {

                System.out.print(cartela[i][j]+"|");
            }
            System.out.println();
        }

        List<Integer> lstrodadas = new ArrayList<Integer>();


        while (acertos <= 24){

            int nrandom = random.nextInt(75);

            boolean response = verificar(cartela,nrandom);
            boolean verificarRodadaValida;





            verificarRodadaValida = verificarVetor(lstrodadas, nrandom);



            if (!verificarRodadaValida){

                lstrodadas.add(nrandom);
                contagem++;
                System.out.println(lstrodadas.toString());

            }





            if (response){
                acertos+=1;
                lstnumeros.add(nrandom);

            }
        }
        lstrodadas.sort(null);
        Collections.sort(lstrodadas);

        System.out.println(lstrodadas.toString());

        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 4; j++) {

                System.out.print(cartela[i][j]+"|");
            }
            System.out.println();
        }

        System.out.println("Quantidade de Rodadas: " + contagem);

    }

    static boolean verificar (int[][] cartela, int number ){

        boolean numeroexiste = false;

        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 4; j++) {

                if (cartela [i][j] == number){
                    numeroexiste = true;
                }
            }

        }
        return numeroexiste;
    }


    static boolean verificarVetor (List<Integer> list, int numeroaleatorio){
        for (int i = 0; i < list.size(); i++){

            if(list.get(i)==(numeroaleatorio)){

                return true;
            }
        }
        return false;

    }



}
