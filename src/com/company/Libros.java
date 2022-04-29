package com.company;

public class Libros extends Lectura implements Acciones{
    private String genero;

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


    public Libros(int codigo, String titulo, int anio, String genero) {
        super(codigo, titulo, anio);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
