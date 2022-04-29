package com.company;

import java.util.Objects;

abstract public class Lectura {
    private int codigo;
    private String titulo;
    private int anio;
    private boolean estado;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lectura)) return false;
        Lectura lectura = (Lectura) o;
        return Objects.equals(titulo, lectura.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }

    public Lectura(int codigo, String titulo, int anio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anio = anio;
        this.estado = false;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


}
