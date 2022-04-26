package edu.fpdual.ejemplo.proyect.ejercicios;

public class cliente{

    public static String NomEmpresa = "Paquito S.L";

    public static  int numeroTrabajadores = 10000;

    public static  String localizacion = "Ruanda";



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(NomEmpresa);
        System.out.println(numeroTrabajadores);
        System.out.println(localizacion);
    }



    public static String getNomEmpresa() {
        return NomEmpresa;
    }


    public static void setNomEmpresa(String nomEmpresa) {
        NomEmpresa = nomEmpresa;
    }

    public static int getNumeroTrabajadores() {
        return numeroTrabajadores;
    }

    public static void setNumeroTrabajadores(int numeroTrabajadores) {
        cliente.numeroTrabajadores = numeroTrabajadores;
    }
}
