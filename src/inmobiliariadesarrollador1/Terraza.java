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
public class Terraza extends Estancia{
    public boolean cerrada;

    public Terraza(boolean cerrada, double metros) {
        super(metros);
        this.cerrada = cerrada;
    }

    public boolean isCerrada() {
        return cerrada;
    }

    public void setCerrada(boolean cerrada) {
        this.cerrada = cerrada;
    }

    @Override
    public String toString() {
        return "Terraza{" + "cerrada=" + cerrada + '}';
    }
}
