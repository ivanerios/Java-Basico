package Sesion5;

import Sesion5interfaces.Coche;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDV1 {

    private List<Coche> coches = new ArrayList<>();

    //guardar coche
    public void save(Coche coche){
        coches.add(coche);
    }

    public List<Coche> findAll(){
        return coches;
    }
}
