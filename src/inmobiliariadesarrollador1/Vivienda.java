/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliariadesarrollador1;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public abstract class Vivienda  {
    public String codigo;
    public String direccion;
    public double precio;
    public ArrayList<Estancia> estancias = new ArrayList <>();

    public Vivienda(String codigo, String direccion, double precio) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Estancia> getEstancias() {
        return estancias;
    }

    public void setEstancias(ArrayList<Estancia> estancias) {
        this.estancias = estancias;
    }

    
     public abstract double Calcularmetros();

    @Override
    public String toString() {
        return "Vivienda{" + "codigo=" + codigo + ", direccion=" + direccion + ", precio=" + precio + ", estancias=" + estancias + '}';
    }
    
    public void addEstancia(Estancia nueva){
        if(estancias.contains(nueva)==true){
            System.out.println("Repetido");
        }
        else{
            estancias.add(nueva);
            System.out.println("Estancia añadida");
        }
    }
}
