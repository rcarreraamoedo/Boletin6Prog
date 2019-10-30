/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_2;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Boletin6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numeros obxNumeros = new Numeros();
        Scanner sc = new Scanner(System.in);
        System.out.print("Teclea primer número: ");
        short num1 = sc.nextShort();
        System.out.print("Teclea segundo número: ");
        short num2 = sc.nextShort();
        obxNumeros.numero(num1, num2);
    }
    
}
