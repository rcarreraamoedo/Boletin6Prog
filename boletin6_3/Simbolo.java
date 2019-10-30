/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_3;

/**
 *
 * @author usuario
 */
public class Simbolo {
    public void numero(int num){
    if (num<0)
        System.out.println("Negativo: -");
    else if (num==0)
            System.out.println("Cero: 0");
            else
            System.out.println("Positivo: +");
    }
}
