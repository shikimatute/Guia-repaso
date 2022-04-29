package com.company;

public class Diario extends Lectura implements SoloLectura{

    public Diario(int codigo, String titulo, int anio) {
        super(codigo, titulo, anio);
    }

    @Override
    public void estadoLectura() {
        if(!isEstado()){
            System.out.println("El diario se esta leyendo");
        }else {
            System.out.println("El diario no se esta leyendo en este momento");
        }
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
    public void leer() {
this.setEstado(true);
    }
}
