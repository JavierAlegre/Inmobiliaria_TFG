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
public class Piso extends Vivienda{

    public int altura;

    public Piso(int altura, String codigo, String direccion, double precio) {
        super(codigo, direccion, precio);
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Piso{" + "altura=" + altura + '}';
    }

    @Override
    public double Calcularmetros() {
        double total=0;
        for(Estancia indice: this.getEstancias()){
            if( indice instanceof Habitacion){
               total= total+ indice.getMetros();
            }
            if( indice instanceof Terraza){
               total= total+ indice.getMetros()*0.5;
            }
        }
        return total;
    }
    
}
