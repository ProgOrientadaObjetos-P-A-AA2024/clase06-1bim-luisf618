/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Venta {
    private double valorVenta;
    private ArrayList<Computador> computadoras; 

    public Venta(ArrayList<Computador> c) {
        computadoras = c;
    }
    
    public void calcularValorVenta() {
        double suma = 0;
        for (int i = 0; i < computadoras.size(); i++) {
            suma = suma + computadoras.get(i).obtenerCostoComputador();
        }
    }
    
    public void establecerComputadoras(ArrayList<Computador> c) {
        computadoras = c;
    }
    
    public double obtenerValorVenta() {
        return valorVenta;
    }
    
    public ArrayList<Computador> obtenerComputadoras() {
        return computadoras;
    }

    @Override
    public String toString() {
        String cadena = "Reporte total de ventas";
        for (int i = 0; i < computadoras.size(); i++) {
            cadena = String.format("%s\nComputadora %d"
                + "Marca del computador: %s\n"
                + "Costo del computador: %.2f\\n"
                + "Marca del procesador: %s\n"
                + "Costo del procesador: %.2f\n"
                + "Marca de la memoria: %s\n"
                + "Costo de la memoria: %.2f\n"
                + "Valor total de la venta: %.2f\n", 
                    cadena,
                    computadoras.get(i).obtenerMarca(), );
        return cadena;
        }
        
        
    }
    
}
