package com.mycompany.parcial_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Parcial_2 {

    public void EscribirArchivoDeudores(String name, boolean rent) {
        String renta = null;
        boolean EstadoRenta;
        EstadoRenta = rent;

        try {
            if (EstadoRenta == false) {
                renta = "No realizo el pago";
                FileWriter escribir = new FileWriter("Deudores.txt", true);
                escribir.write("\n" + name + ": " + renta);
                escribir.close();
            } else {
                FileWriter escribir = new FileWriter("Deudores.txt", true);
                escribir.close();
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        }
    }

    public void EscribirArchivoPago(String name, boolean rent) {
        String renta = null;
        boolean EstadoRenta;
        EstadoRenta = rent;
        try {
            if (EstadoRenta == true) {
                renta = "Pago realizado";
                FileWriter escribir = new FileWriter("Pago al dia.txt", true);
                escribir.write("\n" + name + ": " + renta);
                escribir.close();
            } else {
                FileWriter escribir = new FileWriter("Pago al dia.txt", true);
                escribir.close();
            }
            System.out.println("Lista de pagos escrita");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        }
    }

    public void EscribirListaInquilinos(String name, boolean rent) {
        String renta = null;
        boolean EstadoRenta;
        EstadoRenta = rent;
        try {
            if (EstadoRenta == true) {
                renta = "Pago realizado";
            } else {
                renta = "No realizo el pago";
            }
            FileWriter escribir = new FileWriter("Lista general.txt", true);
            escribir.write("\n" + name + ": " + renta);
            escribir.close();
            System.out.println("Lista general editada");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        }
    }

    public static void main(String[] args) {

        List<Person> lista = new ArrayList<Person>();

        lista.add(new Person("Pedro", false));
        lista.add(new Person("Juan", true));
        lista.add(new Person("Alfredo", false));
        lista.add(new Person("Carmen", true));
        lista.add(new Person("Emiliano", false));
        lista.add(new Person("Carlos", true));
        lista.add(new Person("Emiliano", false));
        lista.add(new Person("Catalina", false));
        lista.add(new Person("Wilver", true));
        lista.add(new Person("Karol", false));

        Parcial_2 metodos = new Parcial_2();

        //inquilinos generales
        for (Person inquilino : lista) {
            metodos.EscribirListaInquilinos(inquilino.getName(), inquilino.isRent());
        }
        for (Person inquilino: lista){
            metodos.EscribirArchivoDeudores(inquilino.getName(), inquilino.isRent());
        }
        for (Person inquilino: lista){
            metodos.EscribirArchivoPago(inquilino.getName(), inquilino.isRent());
        }
  }
}
        
        

   
