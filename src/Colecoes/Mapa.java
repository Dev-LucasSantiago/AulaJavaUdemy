package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer,String> usuarios = new HashMap<>();

        usuarios.put(1,"Ricardo");
        usuarios.put(20,"Roberto");
        usuarios.put(3,"Rafaella");
        usuarios.put(4,"Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Rebeca"));

        System.out.println(usuarios.get(4));

        System.out.println(usuarios.remove(1));
        System.out.println(usuarios.remove(20,"gui"));

        for (int chave: usuarios.keySet()){
            System.out.println(chave);
        }
        for (String valores : usuarios.values()){
            System.out.println(valores);
        }

        for (Map.Entry<Integer,String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey()+"==>");
            System.out.println(registro.getValue());
        }
    }
}
