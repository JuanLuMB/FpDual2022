package edu.fpdual.ejemplo.proyect.ejercicios;

public class cliente_rtest {
    private cliente Cliente;

    public void escenario(){
        Cliente = new cliente();
    }

    public Trabajadores(){
        assert(cliente.numeroTrabajadores(192)==(cliente.getNumeroTrabajadores()));
    }

    public static  String localizacion = "Ruanda";


}
