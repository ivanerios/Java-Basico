package com.sesion2;

public class EjercicioSesion2 {
    public static void main(String[] args) {
        double precio = getPrecio;
        double suma = getSuma();
        System.out.println("El precio es " + precio + "\nEl IVA es " + resultado + "\nLo que da un total de " + suma);

    }
    static double getPrecio = 15;
    static double iva(double a){
        return a * 0.21;
    }
    static double resultado = iva(getPrecio);
    static double getSuma(){
        return getPrecio + resultado; }
    }
