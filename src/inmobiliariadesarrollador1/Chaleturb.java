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
public class Chaleturb extends Vivienda{
    public boolean pareado;
    public String urbanizacion;
    public double metros;

    public Chaleturb(boolean pareado, String urbanizacion, double metros, String codigo, String direccion, double precio) {
        super(codigo, direccion, precio);
        this.pareado = pareado;
        this.urbanizacion = urbanizacion;
        this.metros = metros;
    }

    public boolean isPareado() {
        return pareado;
    }

    public void setPareado(boolean pareado) {
        this.pareado = pareado;
    }

    public String getUrbanizacion() {
        return urbanizacion;
    }

    public void setUrbanizacion(String urbanizacion) {
        this.urbanizacion = urbanizacion;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    @Override
    public String toString() {
        return "Chaleturb{" + "pareado=" + pareado + ", urbanizacion=" + urbanizacion + ", metros=" + metros + '}';
    }
    
    @Override
    public double Calcularmetros() {
         double total=0;
        for(Estancia indice: this.getEstancias()){
        }
        total= total + this.metros*0.5;
        return total;
    }
}
