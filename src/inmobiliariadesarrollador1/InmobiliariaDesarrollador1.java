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
public class InmobiliariaDesarrollador1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Inmobiliaria inmobiliaria = new Inmobiliaria();
        
        Vendedor v1= new Vendedor ("1111","Ana");
        Vendedor v2= new Vendedor ("2222","Carlos");
        Vendedor v3= new Vendedor ("1111","Javier");
        
        Piso p1= new Piso (3,"123","Licenciados",30.000);
        Chaleti c1= new Chaleti (200,false,"234","AV CARLOS IV",200.000);
        

        
        //Para añadir vendedores
        inmobiliaria.addVendedor(v1);
        inmobiliaria.addVendedor(v2);
        inmobiliaria.addVendedor(v3);
        
        //Para añadir viviendas
        inmobiliaria.addVivienda(p1);
        inmobiliaria.addVivienda(c1);
        //Realizar una venta
        inmobiliaria.venta("123", "2222");
        inmobiliaria.venta("234", "1111");
    }
    
}
