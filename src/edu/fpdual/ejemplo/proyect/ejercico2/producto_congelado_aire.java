package edu.fpdual.ejemplo.proyect.ejercico2;

public class producto_congelado_aire extends productos_congelados {

    String Congelado = "Estos productos se congelan mediante aire";
    String Temperatura = "La temperatura del aire debe de ser de almenos -23 grados";
    String Peligrosiadad = "Poca";

    public String getCongelado() {
        return Congelado;
    }
    public void setCongelado(String cogelado) {
        Congelado = cogelado;
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

