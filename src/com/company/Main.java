package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Libros libro1 = new Libros(1233455,"Popeye",1900,"cuento");
        Libros libro2 = new Libros(1233457,"Crepusculo", 2015, "romance");
        Libros libro3 = new Libros(5611261,"Cocinando",2020,"cocina");
        Revista revista1 = new Revista(89495,"Salven a DEEP",2022);
        Revista revista2 = new Revista(75214,"Heard miente",2010);
        Revista revista3 = new Revista(96521,"Paparazi es insoportable",2015);
        Diario diario1 = new Diario(85632,"Clarin",2022);
        Diario diario2 = new Diario(785421,"La nacion",2022);
        Diario diario3 = new Diario(823541,"Xataca",2022);
        LinkedList<Libros> libros = new LinkedList<>();
        LinkedList<Revista> revistas = new LinkedList<>();
        LinkedList<Diario> diarios = new LinkedList<>();
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        revistas.add(revista1);
        revistas.add(revista2);
        revistas.add(revista3);
        diarios.add(diario1);
        diarios.add(diario2);
        diarios.add(diario3);
        menu(libros,revistas,diarios);
    }

    public static void menu(LinkedList<Libros> libros ,LinkedList<Revista> revistas,LinkedList<Diario> diarios){
       int casousuario = -1;
        do {
            System.out.println("Que desea hacer?");
            System.out.println("1-Alquilar libro o revista");
            System.out.println("2-Leer diario");
            System.out.println("3-Devolver");
            System.out.println("4-Comprobar Disponibilidad");
            Scanner scan = new Scanner(System.in);
            int casoUsuario = scan.nextInt();
            switch (casoUsuario){
                case 1:
                    alquilar(libros ,revistas);
                    break;
                case 2:
                    leer(diarios);
                    break;
                case 3:
                    devolver(libros,revistas,diarios);
                    break;
                case 4:
                    comprobarEstado(libros,revistas,diarios);
                    break;
            }
        }while (casousuario!= 0);
    }
    public static void alquilar(LinkedList<Libros> libros ,LinkedList<Revista> revistas){
        System.out.println("Ingrese titulo");
        Scanner scan = new Scanner(System.in);
        String objetoAlquilar = scan.nextLine();
        boolean flag = false;

        for (Libros auxlibros:libros
             ) {
         if(objetoAlquilar.equalsIgnoreCase(auxlibros.getTitulo())&&auxlibros.isEstado()==false){
                 auxlibros.alquilar();
                 flag = true;
         }
        }
        if(flag==false) {
            for (Revista auxRevista : revistas
            ) {
                if (objetoAlquilar.equalsIgnoreCase(auxRevista.getTitulo())&&auxRevista.isEstado()==false) {
                        auxRevista.alquilar();
                        flag = true;
                }
            }
        }

        if(flag==true){
            System.out.println("Se ah alquilado con exito");
        }else {
            System.out.println("No se encontro el titulo para alquilar");
        }

    }

    public static void leer(LinkedList<Diario> diarios){
        System.out.println("Que diario desea leer");
        Scanner scan = new Scanner(System.in);
        String diarioUsuario = scan.nextLine();
        boolean flag = false;
        for (Diario diarioAux:diarios
             ) {
            if(diarioUsuario.equalsIgnoreCase(diarioAux.getTitulo())&&diarioAux.isEstado()==false){
                diarioAux.leer();
                flag = true;
            }
        }
        if(flag==true){
            System.out.println("Se encontro con exito el diario disfrutelo");
        }else {
            System.out.println("El diario no se encuentra disponible o no existe");
        }
    }



    public static void devolver(LinkedList<Libros> libros ,LinkedList<Revista> revistas,LinkedList<Diario> diarios){
        System.out.println("Que desea devolver");
        System.out.println("1 - Libro");
        System.out.println("2 - Revista");
        System.out.println("3 - Diario");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        boolean flag = false;
        switch (numero){
            case 1: {
                System.out.println("Ingrese nombre");
                scan.nextLine();
                String nombre = scan.nextLine();
                for (Libros libroAux:libros
                     ) {
                    if(nombre.equalsIgnoreCase(libroAux.getTitulo())){
                        libroAux.devolver();
                        flag = true;
                        System.out.println("Se devolvio con exito");
                    }
                }
                if(flag==false){
                    System.out.println("El libro no existe");
                }
                break;
            }
            case 2:    {
                System.out.println("Ingrese nombre");
                scan.nextLine();
                String nombre = scan.nextLine();
                for (Revista revistaAux:revistas
                ) {
                    if(nombre.equalsIgnoreCase(revistaAux.getTitulo())){
                        revistaAux.devolver();
                        flag = true;
                        System.out.println("Se devolvio con exito");
                    }
                }
                if(flag==false){
                    System.out.println("La revista no existe");
                }
                break;
        }
            case 3:{

                System.out.println("Ingrese nombre");
                scan.nextLine();
                String nombre = scan.nextLine();
                for (Diario diarioAux:diarios
                ) {
                    if(nombre.equalsIgnoreCase(diarioAux.getTitulo())){
                        diarioAux.devolver();
                        flag = true;
                        System.out.println("Se devolvio con exito");
                    }
                }
                if(flag==false){
                    System.out.println("La revista no existe");
                }
                break;
        } default:
                System.out.println("opcion invalida");
        }
    }


    public static void comprobarEstado(LinkedList<Libros> libros ,LinkedList<Revista> revistas,LinkedList<Diario> diarios){
        System.out.println("Que desea checkear");
        System.out.println("1 - Libro");
        System.out.println("2 - Revista");
        System.out.println("3 - Diario");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        boolean flag = false;
        switch (numero){
            case 1: {
                System.out.println("Ingrese nombre");
                scan.nextLine();
                String nombre = scan.nextLine();
                for (Libros libroAux:libros
                ) {
                    if(nombre.equalsIgnoreCase(libroAux.getTitulo())){
                        libroAux.alquilado();
                        flag = true;
                    }
                }
                if(flag==false){
                    System.out.println("El libro no existe");
                }
                break;
            }
            case 2:    {
                System.out.println("Ingrese nombre");
                scan.nextLine();
                String nombre = scan.nextLine();
                for (Revista revistaAux:revistas
                ) {
                    if(nombre.equalsIgnoreCase(revistaAux.getTitulo())){
                        revistaAux.alquilado();
                        flag = true;
                    }
                }
                if(flag==false){
                    System.out.println("La revista no existe");
                }
                break;
            }
            case 3:{

                System.out.println("Ingrese nombre");
                scan.nextLine();
                String nombre = scan.nextLine();
                for (Diario diarioAux:diarios
                ) {
                    if(nombre.equalsIgnoreCase(diarioAux.getTitulo())){
                        diarioAux.estadoLectura();
                        flag = true;
                    }
                }
                if(flag==false){
                    System.out.println("La revista no existe");
                }
                break;
            } default:
                System.out.println("opcion invalida");
        }
    }
    }

