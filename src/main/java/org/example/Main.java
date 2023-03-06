package org.example;

import org.example.Puerta;

import java.awt.*;

public class Main {
    public static void main(String[] args){
        Perro dog = new Perro("Labrador", 22, 6, "Firulais", "Juan");
        System.out.println(dog);
        System.out.println(dog.ladrar());
        System.out.println(dog.correr());
        System.out.println(dog.comer());
        Puerta door = new Puerta("Negra", 2500,210,"Madera",20);
        System.out.println(door);
        System.out.println(door.abrir());
        System.out.println(door.seguro());
        System.out.println(door.tiempo());


    }
}