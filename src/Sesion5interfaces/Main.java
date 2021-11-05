package Sesion5interfaces;

import java.util.List;

public class Main {
    static CocheCRUD cocheCRUD;
    public static void main(String[] args) {
        cocheCRUD = new CocheCRUDImpl();

        Coche lancia = new Coche("Lancia", "Delta", 1999, 2.6, true);
        Coche volvo = new Coche("Volvo", "A6", 2015, 3.0, true);
        Coche lada = new Coche("Lada", "Niva", 1987, 1.8, false);

        cocheCRUD.save(lancia);
        cocheCRUD.save(volvo);
        cocheCRUD.save(lada);


        List<Coche> coches = cocheCRUD.findAll();
        System.out.println(coches);

        cocheCRUD.delete(lancia);

    }
}
