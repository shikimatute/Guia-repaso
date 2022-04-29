package com.company;

public class Revista extends Lectura implements Acciones {


    public Revista(int codigo,String titulo, int anio) {
        super(codigo, titulo, anio);
    }

    @Override
    public void alquilar() {
        this.setEstado(true);
    }

    @Override
    public void devolver() {
        if(isEstado()==false){
            System.out.println("Error ya esta devuelto");
        }else {
            this.setEstado(false);
        }
    }

    @Override
    public void alquilado() {
        if(!isEstado()){
            System.out.println("El titulo esta disponible para alquilar");
        }else{
            System.out.println("El titulo se encuentra alquilado");
        }
    }
}
