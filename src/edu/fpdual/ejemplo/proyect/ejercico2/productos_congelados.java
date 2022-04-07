package edu.fpdual.ejemplo.proyect.ejercico2;

public class productos_congelados extends comun {

    String Tipo_producto = ("judias");
    int fecha_cadu = 17/2/2023;
    String tipo_congelado = "Aire ,Agua ,Nitrogeno";

    public String getTipo_congelado() {
        return tipo_congelado;
    }
    public void setTipo_congelado(String tipo_congelado) {
        this.tipo_congelado = tipo_congelado;
    }

    public String getTipo_producto() {
        return Tipo_producto;
    }
    public void setTipo_producto(String tipo_producto) {
        Tipo_producto = tipo_producto;
    }
    public int getFecha_cadu() {
        return fecha_cadu;
    }
    public void setFecha_cadu(int fecha_cadu) {
        this.fecha_cadu = fecha_cadu;
    }

}

