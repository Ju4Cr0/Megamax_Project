package org.example.demo.Model;
import java.util.UUID;
/**
 * El objetivo de esta clase es generar IDS unicos.
 * */
public class IdGenerator {
    private IdGenerator(){}

    public static String generarId(String prefijo){
        return prefijo +"-"+ UUID.randomUUID();
    }
}
