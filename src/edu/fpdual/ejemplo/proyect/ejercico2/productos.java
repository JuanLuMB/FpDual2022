package edu.fpdual.ejemplo.proyect.ejercico2;

public class productos {

    public static void main(String[] args) {
        productos_frecos producto_F = new productos_frecos();
        System.out.println("Productos frescos :");
        System.out.println("Los productos proceden de : "+producto_F.getOrigen());
        System.out.println(producto_F.getQuimicos());
        System.out.println("Caduca en la fecha "+producto_F.getFecha_cadu());
        producto_F.transporte();
        producto_F.numero_lote();

        System.out.println();

        productos_refrigerados producto_R = new productos_refrigerados();
        System.out.println("Productos refrigerado :");
        System.out.println("Alimento: "+producto_R.getTipo_producto());
        System.out.println("Tiene que estar a una temperatura de :"+producto_R.getTemperatura());
        System.out.println("Casuca en la fecha :"+producto_R.getFecha_cadu());
        producto_R.transporte();
        producto_R.numero_lote();

        System.out.println();

        productos_congelados producto_C = new productos_congelados();
        System.out.println("Productos Congelados :");
        System.out.println("En esta categoria lo que se distribulle son "+producto_C.getTipo_producto());
        System.out.println("Tienen una fecha de caducidad de : "+producto_C.getFecha_cadu());
        System.out.println("Ahi 3 tipos de congelado :"+producto_C.getTipo_congelado());

        System.out.println();

        producto_congelado_aire producto_C_I = new producto_congelado_aire();
        System.out.println("Productos Congelados por aire :");
        System.out.println(producto_C_I.getCongelado());
        System.out.println(producto_C_I.getTemperatura());
        System.out.println(producto_C_I.getPeligrosiadad());
        producto_C_I.transporte();
        producto_C_I.numero_lote();

        System.out.println();

        producto_congelado_agua	producto_C_A = new producto_congelado_agua();
        System.out.println("Productos Congelados por agua :");
        System.out.println(producto_C_A.getCogelado());
        System.out.println(producto_C_A.getTemperatura());
        System.out.println(producto_C_A.getPeligrosiadad());
        producto_C_A.transporte();
        producto_C_A.numero_lote();

        System.out.println();

        producto_congelado_nitrogeno producto_C_N = new producto_congelado_nitrogeno();
        System.out.println("Productos Congelados por nitrogeno :");
        System.out.println(producto_C_N.getCogelado());
        System.out.println(producto_C_N.getTemperatura());
        System.out.println(producto_C_N.getPeligrosiadad());
        producto_C_N.transporte();
        producto_C_N.numero_lote();
    }

}
