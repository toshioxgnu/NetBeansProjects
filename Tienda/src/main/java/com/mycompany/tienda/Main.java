package com.mycompany.tienda;

import java.util.*;

/**
 *
 * @author jose
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    static Queue<Integer> turno1 = new LinkedList<Integer>();
    static Queue<Integer> turno2 = new LinkedList<Integer>();

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("Menu Ventas "
                    + "\n"
                    + "\n1.- Mostrar Ventas"
                    + "\n2.- AgregarDatos"
                    + "\n3.- Venta Diaria"
                    + "\n4.- Ventas Totales"
                    + "\n5.- Ventas Semana"
                    + "\n0.- Salir"
                    + "\nIngrese opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    mostrarVentas();
                    break;
                case 2:
                    agregarDatos();
                    break;
                case 3:
                    ventaDiaria();
                    break;
                case 4:
                    ventasTotales();
                    break;
                case 5:
                    ventaSemana();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }

        } while (opcion != 0);
    }

    static void mostrarVentas() {
        System.out.println("Turno1:\n "
                + turno1);
        System.out.println("Turno2:\n "
                + turno2);
    }

    static void agregarDatos() {
        int turno, cantidad, dato;
        System.out.println("Ingrese turno: ");
        turno = sc.nextInt();
        System.out.println("Ingrese cantidad de datos a agregar");
        cantidad = sc.nextInt();
        if (turno == 1) {
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese venta");
                dato = sc.nextInt();
                turno1.add(dato);
            }
        }
        if (turno == 2) {
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese venta");
                dato = sc.nextInt();
                turno2.add(dato);
            }
        }
    }

    static void ventaDiaria() {
        int venta = 0, dia = 0;

        for (Integer item : turno1) {
            for (Integer item2 : turno2) {
                venta = item + item2;
                System.out.println("Venta dia " + (dia + 1) + " : " + venta);
                dia++;
            }
            break;
        }
    }

    static void ventasTotales() {
        int t1 = 0, t2 = 0;

        for (Integer item : turno1) {

            for (Integer item2 : turno2) {
                t1++;
                t2++;
            }
            break;
        }
        System.out.println("Ventas turno1 :" + t1);
        System.out.println("ventas turno2 :" + t2);
    }

    static void ventaSemana() {
        int ventaTurno1 = 0, ventaTurno2 = 0;

        for (Integer item : turno1) {

            for (Integer item2 : turno2) {
                ventaTurno1 = +item;
                ventaTurno2 = +item2;
            }
            break;
        }
        System.out.println("Venta Turno 1: " + ventaTurno1);
        System.out.println("Venta Turno 2: " + ventaTurno2);
        System.out.println("Venta Total: " + (ventaTurno1 + ventaTurno2));

    }

}
