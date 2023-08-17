package main.java;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Humberto");
        usuarios.put(2, "Larissa");
        usuarios.put(3, "Lia");
        usuarios.put(4, "Marcela");

        System.out.println( usuarios.size());
        System.out.println( usuarios.isEmpty());

        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.containsKey(4));
        System.out.println(usuarios.get(4));
        System.out.println(usuarios.containsValue("Humberto"));

        for (int chave: usuarios.keySet()){
            System.out.println(chave + " ");
        }
        for (String valor: usuarios.values()){
            System.out.println(valor + " ");
        }
        for (Map.Entry<Integer, String> registros: usuarios.entrySet()){
            System.out.print(registros.getKey()+ " > ");
            System.out.println(registros.getValue());
        }



    }
}
