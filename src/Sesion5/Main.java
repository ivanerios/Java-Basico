package Sesion5;

import Sesion5interfaces.Coche;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CocheCRUDV1 cocheCRUDV1 = new CocheCRUDV1();

        Coche lancia = new Coche("Lancia", "Delta", 1999, 2.6, true);
        Coche volvo = new Coche("Volvo", "A6", 2015, 3.0, true);
        Coche lada = new Coche("Lada", "Niva", 1987, 1.8, false);

       cocheCRUDV1.save(lancia);
       cocheCRUDV1.save(volvo);
       cocheCRUDV1.save(lada);

       List<Coche> coches = cocheCRUDV1.findAll();
        System.out.println(coches);
        }
}
