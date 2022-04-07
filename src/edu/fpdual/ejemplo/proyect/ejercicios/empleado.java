package edu.fpdual.ejemplo.proyect.ejercicios;

public class empleado{


    private String nomEmpeado = "Claudio";
    private String puestoenEmpresa = "Director";

    public String getnomEmpeado() {
        return nomEmpeado;
    }

    public void setnomEmpeado(String nomEmpeado) {
        this.nomEmpeado = nomEmpeado;
    }

    private int numeroenlaEmpresa = 30098;

    public void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(nomEmpeado);
        System.out.println(puestoenEmpresa);
        System.out.println(numeroenlaEmpresa);

    }
}
