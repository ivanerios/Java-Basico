package Sesion5interfaces;

public class Coche {
    // 1. atributos
    String marca;
    String modelo;
    int year;
    double cilindrada;
    boolean operativo;

    //2. constructores
    public Coche(){}

    public Coche(String marca, String modelo, int year, double cilindrada, boolean operativo) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.cilindrada = cilindrada;
        this.operativo = operativo;
    }

    //3. metodos

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                ", cilindrada=" + cilindrada +
                ", operativo=" + operativo +
                '}';
    }
}
