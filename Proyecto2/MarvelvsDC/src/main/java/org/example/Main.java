package org.example;

import configuracion.personajes.*;

import java.io.IOException;

public class Main {
    /**
     * Método que inicia la aplicación
     * @param args
     */
    public static void main(String args[]){
        new MenuPrincipalGUI();

        // instancias BD...villano/heroeantiheroe/ciudad...(el que ocupes)
        BDvillano villano = new BDvillano();
        // llamas la funcion restaurar para que jale la info del json y la pase a arraylist
        try {villano.restaurar();} catch (IOException e) {throw new RuntimeException(e);}

        // las funciones getVillanos/getHeroes... son las que retornan el arraylist

        // tipo de for para arraylist
        for (Personaje v : villano.getVillanos()) {
            System.out.println(v.getPseudonimo());
        }

        // tipo de for normal
        /*for (int i = 0; i < villano.getVillanos().size(); i++) {
            System.out.println(villano.getVillanos().get(i).getPseudonimo());
        }*/
    }
}