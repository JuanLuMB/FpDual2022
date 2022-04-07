package edu.fpdual.ejemplo.proyect.ejercico2;

public class producto_congelado_nitrogeno extends productos_congelados {

    String Cogelado = "Estos productos se congelan mediante nitrogeno";
    String Temperatura = "El nitrogeno se encuentra a una temperatura de -200 grados";
    String Peligrosiadad = "Alta";

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

