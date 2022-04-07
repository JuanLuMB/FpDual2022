package edu.fpdual.ejemplo.proyect.ejercicios;

public class Bucle {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String palabra = args[0];
        String numero = args[1];
        int numeroEntero = Integer.parseInt(numero);
        int contador = 0;

        for(int i = 0 ; i < numeroEntero ; i++) {
            if(contador < numeroEntero) {
                System.out.println(palabra);
                contador ++;
            }else if(contador >= numeroEntero) {
                System.out.println("Ejercicio terminado");
            }
        }
        System.out.println("La palabra se ha repetido un total de : "+contador);
    }
}

