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
public abstract class Estancia {
    private double metros;

    public Estancia(double metros) {
        this.metros = metros;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    @Override
    public String toString() {
        return "Estancia{" + "metros=" + metros + '}';
    }
}
