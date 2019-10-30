/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_1;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Boletin6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Positivo obxPositivo = new Positivo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Teclea un número positivo: ");
        int num = sc.nextInt();
        obxPositivo.cifras(num);
    }
    
}
