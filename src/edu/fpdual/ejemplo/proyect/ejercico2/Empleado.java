package edu.fpdual.ejemplo.proyect.ejercico2;

public class Empleado {

    Empleado empleado = new Empleado();
    String nombre = "Juan Luis Muñoz Barrio";
    String cedula ="Hola";
    int edad =18;
    boolean casado = false;
    double salario = 2000;

    public void main(String[] args) {
        clasificacion();
        ImprimirDatos();
    }

    public void clasificacion() {
        if(edad <= 21) {
            System.out.println("Principiante");
        }else if(edad >22 && edad <=35) {
            System.out.println("Intermedio");
        }else if(edad>35) {
            System.out.println("Senior");
        }

    }

    public void ImprimirDatos() {
        System.out.println(empleado.nombre+"\n"+empleado.cedula);
        System.out.println(empleado.cedula);
        System.out.println(empleado.edad);
        System.out.println(empleado.edad);
        System.out.println(empleado.casado);
        System.out.println(empleado.salario);
    }

}

