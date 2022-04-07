package edu.fpdual.ejemplo.proyect.ejercico2;

public class producto_congelado_agua extends productos_congelados {

    String Cogelado = "Estos productos se congelan mediante agua";
    String Temperatura = "El agua debe estar a almenos -50 grados";
    String Peligrosiadad = "Media";

    public String getCogelado() {
        return Cogelado;
    }
    public void setCogelado(String cogelado) {
        Cogelado = cogelado;
    }
    public String getTemperatura() {
        return Temperatura;
    }
    public void setTemperatura(String temperatura) {
        Temperatura = temperatura;
    }
    public String getPeligrosiadad() {
        return Peligrosiadad;
    }
    public void setPeligrosiadad(String peligrosiadad) {
        Peligrosiadad = peligrosiadad;
    }

}
