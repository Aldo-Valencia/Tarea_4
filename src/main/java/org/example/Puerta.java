package org.example;
import java.awt.*;

public class Puerta {
    //Generando atributos
    private String color;
    private float precio;
    private float altura;
    private String material;
    private float ancho;

    //Constructor por defecto
    public Puerta() {
    }

    //Constructor sobrecargado

    public Puerta(String  color, float precio, float altura, String material, float ancho) {
        this.color = color;
        this.precio = precio;
        this.altura = altura;
        this.material = material;
        this.ancho = ancho;
    }
    //Metodos de acceso
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    //Metodo to.String


    @Override
    public String toString() {
        return "Puerta{" +
                "color=" + color +
                ", precio=" + precio +
                ", altura=" + altura +
                ", material='" + material + '\'' +
                ", ancho=" + ancho +
                '}';
    }

    public boolean abrir (){
        boolean abierto = Math.random() >0.51;
        if (abierto==true){
            System.out.println("La puerta esta abierta");
        }
        else {
            System.out.println("La puerta esta cerrada");
        }
        return abierto;
    }
    public boolean seguro(){
        boolean cerrado = Math.random() >0.51;
        if (cerrado==true){
            System.out.println("La puerta tiene seguro");
        }
        else {
            System.out.println("La puerta NO tiene seguro");
        }
        return cerrado;

    }

    public  int tiempo (){
        int time = (int) (Math.random() *8+1);
        System.out.println("La puerta ha estado cerrada: " +time +" horas");
        return time;
    }


}
