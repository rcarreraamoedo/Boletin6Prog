/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_7;
import java.util.Scanner;
/**
 *
 * @author rcarreraamoedo
 */
public class Boletin6_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu obxMenu = new Menu();
        Scanner sc = new Scanner(System.in);
        System.out.print("Teclea a opción que queres calcular: ");
        int numero = sc.nextInt();
        System.out.print("Teclea a base: ");
        int b = sc.nextInt();
        System.out.print("Teclea a altura: ");
        int h = sc.nextInt();       
        System.out.print("Teclea o radio: ");
        int r= sc.nextInt();
        obxMenu.superficieSwitch(numero, b, h, r);
    }
    
}
