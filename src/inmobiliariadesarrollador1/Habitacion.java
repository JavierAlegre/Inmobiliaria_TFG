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
public class Habitacion extends Estancia{
    public boolean interior;

    public Habitacion(boolean interior, double metros) {
        super(metros);
        this.interior = interior;
    }

    public boolean isInterior() {
        return interior;
    }

    public void setInterior(boolean interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "interior=" + interior + '}';
    }
}
