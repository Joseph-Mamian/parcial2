package com.mycompany.parcial_2;

import java.io.*;
import java.util.ArrayList;


public class Parcial_2 {

    public void EscribirArchivoDeudores(String name, boolean rent) {
        String renta = null;
        boolean EstadoRenta;
        EstadoRenta = rent;
        

        try {
            if(EstadoRenta == false){
                renta="No realizo el pago";
                FileWriter escribir = new FileWriter("Deudores.txt", true);
            escribir.write("\n" + name + ": " + renta);
            escribir.close();
            }else{
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
            }else{
                FileWriter escribir = new FileWriter("Pago al dia.txt", true);
            escribir.close();     
            }
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
            }else{
               renta = "No realizo el pago";
            }
            FileWriter escribir = new FileWriter("Lista general.txt", true);
            escribir.write("\n" + name + ": " + renta);
            escribir.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        }
    }

    public static void main(String[] args) {

        

        ArrayList<Person> inquilinos = new ArrayList();
        
        Person persona1 = new Person("Pedro", false);
        Person persona2 = new Person("Juan", true);
        Person persona3 = new Person("Alfredo", false);
        Person persona4 = new Person("Emiliano", true);
        Person persona5 = new Person("Carlos", false);
        Person persona6 = new Person("Karen", true);
        Person persona7 = new Person("Andrea", false);
        Person persona8 = new Person("Freddy", true);
        Person persona9 = new Person("Wilver", false);
        Person persona10 = new Person("Karla", true);
        
        inquilinos.add(persona1);
        inquilinos.add(persona2);
        inquilinos.add(persona3);
        inquilinos.add(persona4);
        inquilinos.add(persona5);
        inquilinos.add(persona6);
        inquilinos.add(persona7);
        inquilinos.add(persona8);
        inquilinos.add(persona9);
        inquilinos.add(persona10);
        
               
        Parcial_2 metodos = new Parcial_2();

        //inquilinos generales
        
        metodos.EscribirListaInquilinos(persona1.getName(), persona1.isRent());
        metodos.EscribirListaInquilinos(persona2.getName(), persona2.isRent());
        metodos.EscribirListaInquilinos(persona3.getName(), persona3.isRent());
        metodos.EscribirListaInquilinos(persona4.getName(), persona4.isRent());
        metodos.EscribirListaInquilinos(persona5.getName(), persona5.isRent());
        metodos.EscribirListaInquilinos(persona6.getName(), persona6.isRent());
        metodos.EscribirListaInquilinos(persona7.getName(), persona7.isRent());
        metodos.EscribirListaInquilinos(persona8.getName(), persona8.isRent());

        
        //inquilinos que deben pagar
        metodos.EscribirArchivoDeudores(persona1.getName(), persona1.isRent());
        metodos.EscribirArchivoDeudores(persona2.getName(), persona2.isRent());
        metodos.EscribirArchivoDeudores(persona3.getName(), persona3.isRent());
        metodos.EscribirArchivoDeudores(persona4.getName(), persona4.isRent());
        metodos.EscribirArchivoDeudores(persona5.getName(), persona5.isRent());
        metodos.EscribirArchivoDeudores(persona6.getName(), persona6.isRent());
        metodos.EscribirArchivoDeudores(persona7.getName(), persona7.isRent());
        metodos.EscribirArchivoDeudores(persona8.getName(), persona8.isRent());
        metodos.EscribirArchivoDeudores(persona9.getName(), persona9.isRent());
        metodos.EscribirArchivoDeudores(persona10.getName(), persona10.isRent());
        
        //inquilinos que ya pagaron
        
        metodos.EscribirArchivoPago(persona1.getName(), persona1.isRent());
        metodos.EscribirArchivoPago(persona2.getName(), persona2.isRent());
        metodos.EscribirArchivoPago(persona3.getName(), persona3.isRent());
        metodos.EscribirArchivoPago(persona4.getName(), persona4.isRent());
        metodos.EscribirArchivoPago(persona5.getName(), persona5.isRent());
        metodos.EscribirArchivoPago(persona6.getName(), persona6.isRent());
        metodos.EscribirArchivoPago(persona7.getName(), persona7.isRent());
        metodos.EscribirArchivoPago(persona8.getName(), persona8.isRent());
        metodos.EscribirArchivoPago(persona9.getName(), persona9.isRent());
        metodos.EscribirArchivoPago(persona10.getName(), persona10.isRent());
       
        System.out.println("Se escribio en la lista general");
        System.out.println("Se escribio en la lista de deudores");
        System.out.println("Se escribio en la lista de pagos cumplidos");
    }

}
