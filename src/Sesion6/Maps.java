package Sesion6;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>();
        map.put("clave1", 10);
        map.put("clave2", 20);
        map.put("clave3", 30);
        map.put("clave4", 40);

        System.out.println(map.get("clave3"));
    }
}
