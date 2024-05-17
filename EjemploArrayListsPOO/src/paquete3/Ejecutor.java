/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejecutor {

    public static void main(String[] args) {
        ArrayList<Computador> com1 = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        String marcaComp;
        String marcaPro;
        String marcaMem;
        double costoPro;
        double costoMem;
        int n;

        System.out.println("Ingrese el numero de computadoras a ingresar");
        n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la marca del computador " + (i + 1));
            entrada.nextLine();
            marcaComp = entrada.nextLine();
            System.out.println("Ingrese la marca del procesador");
            marcaPro = entrada.nextLine();
            System.out.println("Ingrese el costo del procesador");
            costoPro = entrada.nextDouble();
            System.out.println("Ingrese la marca de la memoria");
            entrada.nextLine();
            marcaMem = entrada.nextLine();
            System.out.println("Ingrese el costo de la memoria");
            costoMem = entrada.nextDouble();

            Procesador pro = new Procesador(marcaPro, costoPro);
            Memoria mem = new Memoria(marcaMem, costoMem);
            Computador comp = new Computador(marcaComp, pro, mem);
            comp.calcularCostoComputador();
            com1.add(comp);

        }
        Venta vent1 = new Venta(com1);
        vent1.calcularValorVenta();
        
        System.out.printf("%s\n", vent1);

    }
}
