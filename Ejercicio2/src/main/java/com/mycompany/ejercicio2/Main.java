package com.mycompany.ejercicio2;

import java.util.*;
/**
 *
 * @author jose
 */
public class Main {
    
    static Queue <Integer> ventasturno1 = new LinkedList<Integer>();
    static Queue <Integer> ventasturno2 = new LinkedList<Integer>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion;
        
        do{
            System.out.println("========Menu========"+
                    "\n 1.- Mostra ventas."+
                    "\n 2.- Agregar Datos."+
                    "\n 3.- Venta Diaria."+
                    "\n 4.- Ventas Totales."+
                    "\n 5.- Ventas Semanal."+
                    "\n 0.- Salir.");
                    System.out.println("Ingrese Opcion");
                    opcion = Integer.parseInt(sc.next());
                    switch(opcion){
                        case 1:
                            System.out.println(MostrarVentas());
                            break;
                        case 2:
                            AgregarDatos();
                            break;
                        case 3:
                            VentaDiaria();
                            break;
                        case 4:
                            VentasTotales();
                            break;
                        case 5:
                            VentasSemana();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Opcion Incrrecta");
                    } 
        }while(opcion!=0);   
        
    }
    
    static String MostrarVentas(){
        if(ventasturno1.isEmpty()){
            if (ventasturno2.isEmpty()){
              return("no hay ventas ingresadas");  
            }   
        }
        return("Ventas Turno 1 "+ ventasturno1 +
                    "\nVentas Turno 2 "+ ventasturno2);

        
    }
    static void AgregarDatos(){
        int turno, cantidad;
        System.out.println("Ingrese Turno");
        turno = sc.nextInt();
        System.out.println("Ingrese cantidad de datos");
        cantidad = sc.nextInt();
        
        if (turno == 1){
            int venta;
            for (int i = 0; i<cantidad; i++){
                System.out.println("Ingrese venta "+ (i+1));
                venta = sc.nextInt();
                ventasturno1.add(venta);
            }
        }
        if (turno == 2){
            int venta;
            for (int i = 0; i<cantidad; i++){
                System.out.println("Ingrese venta "+i);
                venta = sc.nextInt();
                ventasturno2.add(venta);
            }
        }
        
    }
    static void VentaDiaria(){
        int ventaDiaria, dia = 0;
        for(Integer venta0: ventasturno1){
            for (Integer venta: ventasturno2){
                ventaDiaria = venta0 + venta;
    
                System.out.println("Venta Dia  "+ (dia+1) + ": "+ ventaDiaria);
                dia++;
            }
            break;
        }
    }
    static void VentasTotales(){
        int ventas1, ventas2;
        ventas1 = ventasturno1.size();
        ventas2 = ventasturno2.size();
        System.out.println("Ventas Turno 1 : "+ ventas1);
        System.out.println("Ventas Turno 2 : "+ventas2);
        System.out.println("Ventas Total 2 turnos : "+ (ventas1+ventas2));
        
        
    }
    static void VentasSemana(){
        int ventaSemana = 0;
        for(Integer venta0: ventasturno1){
            for (Integer venta: ventasturno2){
                ventaSemana =+ venta0 + venta;
            }
            break;
        }
        System.out.println("El total de ventas Semanal es "+ ventaSemana);
    }
    
}
