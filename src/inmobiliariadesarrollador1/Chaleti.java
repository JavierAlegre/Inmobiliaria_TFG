/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliariadesarrollador1;

/**
 *
 * @author Usuario
 */
public class Chaleti extends Vivienda{
    public double metros;
    public boolean piscina;

    public Chaleti(double metros, boolean piscina, String codigo, String direccion, double precio) {
        super(codigo, direccion, precio);
        this.metros = metros;
        this.piscina = piscina;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    @Override
    public String toString() {
        return "Chaleti{" + "metros=" + metros + ", piscina=" + piscina + '}';
    }

   
    @Override
    public double Calcularmetros() {
        double total=0;
        for(Estancia indice: this.getEstancias()){
    
        }
        total= total + this.metros;
        return total;
    }
}
