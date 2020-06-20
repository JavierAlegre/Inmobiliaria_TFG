/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliariadesarrollador1;

import java.util.HashMap;

/**
 *
 * @author Usuario
 */
public class Vendedor {
    public String nif;
    public String nombre;
    public HashMap <String,Vivienda> viviendas = new HashMap <>();

    public Vendedor(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<String, Vivienda> getViviendas() {
        return viviendas;
    }

    public void setViviendas(HashMap<String, Vivienda> viviendas) {
        this.viviendas = viviendas;
    }

    @Override
    public String toString() {
        return "Vendedor{"  + "nif=" + nif + ", nombre=" + nombre + ", viviendas=" + viviendas.toString() + '}';
    }
    public double calcularComision(){
        //Recorrer sus viviendas vendidas
        double comision = 0;
        for(Vivienda indice: viviendas.values()){
         comision = comision + (indice.getPrecio())*0.2;
        }
        //Devolver comision
        return comision;    
    }

}
