/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_4;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Boletin6_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Teclea primer nome: ");
        String nome1 = sc.next();
        System.out.print("Teclea o primer peso: ");
        float peso1 = sc.nextFloat();
        Peso obxPeso1 = new Peso(nome1, peso1);
        System.out.print("Teclea o segundo nome: ");
        String nome2 = sc.next();
        System.out.print("Teclea o segundo peso: ");
        float peso2 = sc.nextFloat();
        Peso obxPeso2 = new Peso(nome2, peso2);
        //Finalizar
        if (obxPeso1.getpeso()> obxPeso2.getpeso()) {
        System.out.println(obxPeso1.getnome()+" ten maior peso");
        System.out.println("Diferencia de peso: "+(obxPeso1.getpeso() - obxPeso2.getpeso()+" kg"));
        } else {
        System.out.println(obxPeso2.getnome()+" ten maior peso");
        System.out.println("Diferencia de peso: "+(obxPeso2.getpeso() - obxPeso1.getpeso()+" kg"));
        }
    }
    
}
