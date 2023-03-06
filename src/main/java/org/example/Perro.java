package org.example;
import java.awt.*;

public class Perro {
    //Generando atributos
    private String raza;
    private float peso;
    private int edad;
    private String nombre;
    private String duenio;

    //Generando metodos constructores
    //Constructor por defecto
    public Perro() {

    }
    //Constructor sobrecargado

    public Perro(String raza, float peso, int edad, String nombre, String duenio) {
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
        this.nombre = nombre;
        this.duenio = duenio;
    }


    //Generando metodos de acceso
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) { this.edad = edad; }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    //Generando metodo de utileria to.String


    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", peso=" + peso +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", duenio='" + duenio + '\'' +
                '}';
    }


    public boolean ladrar(){

        boolean resultado = Math.random() >0.51;
        if (resultado==true){
            System.out.println(nombre + " esta ladrando" );
        }
        else {
            System.out.println(nombre+ " NO esta ladrando");
        }

        return resultado;
    }

    public float correr (){
        float distancia = (float) Math.random();
        System.out.println(nombre +" recorrio: "+distancia +" kilometros");

        return distancia;
    }

    public String comer (){
        int aleatorio = (int) (Math.random() *10+1);

        if((aleatorio==0) || (aleatorio==1) || (aleatorio==2) ||(aleatorio==3) ) {
            String comida = new String("Croquetas");
            System.out.println(nombre +" comio: "+comida);
            return comida;
        }
        if((aleatorio==4) || (aleatorio==5) || (aleatorio==6) ||(aleatorio==7) ) {
            String comida = new String("Carne");
            System.out.println(nombre +" comio: "+comida);
            return comida;
        }
        if((aleatorio==8) || (aleatorio==9) || (aleatorio==10) ) {
            String comida = new String("Pollo");
            System.out.println(nombre +" comio: "+comida);
            return comida;
        }


        return null;
    }


}