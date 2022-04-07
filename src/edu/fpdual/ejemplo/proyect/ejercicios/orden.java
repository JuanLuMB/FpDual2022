package edu.fpdual.ejemplo.proyect.ejercicios;

public class orden {

    private static cliente cliente = new cliente();
    private static empleado emple = new empleado();
    private static String primeraSede ="La primera sede estaba emplazada en Murcia";
    private static String dedicacion ="La esmpresa se dedica a la costrucion";
    private static int TrabajadoresenEspana = 2000;
    private static String almacenPrincipal ="El almacen principal se encuentra en Málaga";


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(cliente.getNomEmpresa());
        System.out.println(emple.getnomEmpeado());
        System.out.println(primeraSede);
        System.out.println(dedicacion);
        System.out.println(TrabajadoresenEspana);
        System.out.println(almacenPrincipal);
    }
}
