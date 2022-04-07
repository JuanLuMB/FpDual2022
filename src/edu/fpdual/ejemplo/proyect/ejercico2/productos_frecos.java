package edu.fpdual.ejemplo.proyect.ejercico2;

public class productos_frecos extends comun {

    String Origen = "Huertas ecologicas";
    String Quimicos = "Nunca han tenido contacto con pesticidas";
    int Fecha_cadu = 1/4/2022;


    public int getFecha_cadu() {
        return Fecha_cadu;
    }
    public void setFecha_cadu(int fecha_cadu) {
        this.Fecha_cadu = fecha_cadu;
    }
    public String getOrigen() {
        return Origen;
    }
    public void setOrigen(String origen) {
        Origen = origen;
    }
    public String getQuimicos() {
        return Quimicos;
    }
    public void setQuimicos(String quimicos) {
        Quimicos = quimicos;




    }

}

