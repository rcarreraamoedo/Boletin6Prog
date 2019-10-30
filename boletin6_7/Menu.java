/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_7;
/**
 *
 * @author rcarreraamoedo
 */
public class Menu {
    public void superficieSwitch(int numero,int b,int h,int r){
        switch(numero){
            case 1: System.out.println("1...Cuadrado = "+(b*b));break;
            case 2: System.out.println("2...Triángulo = "+(b*(h/2)));break;
            case 3: System.out.println("3...Circulo = "+(Math.PI*r*Math.pow(r, 2)));break;
            default: System.out.println("Opción Incorrecta");
        }
    }
 
}
