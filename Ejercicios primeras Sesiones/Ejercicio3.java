package com.sesion3;

public class EjercicioSesion3 {
    public static void main(String[] args) {
        String[] nombres = {"Paco", "Peco", "Pico", "Poco", "Puco"};
        String concatenados = "";
        for(String nombre : nombres){
            concatenados = concatenados.concat(nombre + " ");
        }
        System.out.println(concatenados);
    }
}
