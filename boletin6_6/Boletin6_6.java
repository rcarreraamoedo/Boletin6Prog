/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_6;
/**
 *
 * @author rcarreraamoedo
 */
public class Boletin6_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Ventas obxVentas = new Ventas();
        String prod;
        prod = obxVentas.anuaisString();
        int cif;
        cif = obxVentas.anuaisInt();
        obxVentas.anuais(cif, prod);    
    }
    
}
