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
public class Inmobiliaria {
    public HashMap <String,Vivienda> viviendas = new HashMap <>();  
    public HashMap <String,Vendedor> vendedores = new HashMap <>();

    public HashMap<String, Vivienda> getViviendas() {
        return viviendas;
    }

    public void setViviendas(HashMap<String, Vivienda> viviendas) {
        this.viviendas = viviendas;
    }

    public HashMap<String, Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(HashMap<String, Vendedor> vendedores) {
        this.vendedores = vendedores;
    }
    public void addVendedor (Vendedor nuevo){
        if(vendedores.containsKey(nuevo.getNif())){
           System.out.println("Ya existe");
        }
        else{
             vendedores.put(nuevo.getNif(), nuevo);
             System.out.println("Añadido");
        }
    }
    public void addVivienda (Vivienda nueva){
        if( viviendas.containsKey(nueva.getCodigo())){
            System.out.println("Ya existe");
        }
        else{
            viviendas.put(nueva.getCodigo(), nueva);
            System.out.println("Añadido");
        }
    }
    
    //Realizar una venta
    public void venta (String codigo, String nif){
        //1ºComprobar que existe la vivienda
        if(vendedores.containsKey(nif)==true){
            //2ºComprobar si existe vendedor
                if(viviendas.containsKey(codigo)==true){
                 vendedores.get(nif).getViviendas().put(codigo,viviendas.get(codigo));
                 viviendas.remove(codigo);
                    System.out.println("Venta realizada");
                }
                else{
                    System.out.println("La vivienda no existe");
                }
        
            //3º Si existen los dos. Añadir las viviendas de ese vendedor
        } 
    }
  
}
