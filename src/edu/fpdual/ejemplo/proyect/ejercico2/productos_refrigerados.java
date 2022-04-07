package edu.fpdual.ejemplo.proyect.ejercico2;

public class productos_refrigerados extends comun {

    String Tipo_producto = ("Ortalizas");
    int Temperatura = 2;
    int fecha_cadu = 8/4/2022;


    public String getTipo_producto() {
        return Tipo_producto;
    }
    public void setTipo_producto(String tipo_producto) {
        Tipo_producto = tipo_producto;
    }
    public int getTemperatura() {
        return Temperatura;
    }
    public void setTemperatura(int temperatura) {
        Temperatura = temperatura;
    }
    public int getFecha_cadu() {
        return fecha_cadu;
    }
    public void setFecha_cadu(int fecha_cadu) {
        this.fecha_cadu = fecha_cadu;
    }

}

