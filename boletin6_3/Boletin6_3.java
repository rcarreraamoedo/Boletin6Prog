/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_3;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Boletin6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simbolo obxSimbolo = new Simbolo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Teclea un número positivo, negativo ou cero: ");
        int num = sc.nextInt();
        obxSimbolo.numero(num);
    }
}
