/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_6;
import java.util.Scanner;
/**
 *
 * @author rcarreraamoedo
 */
public class Ventas {
    Scanner sc = new Scanner(System.in);
    public void anuais(int cifra,String producto){
        if (cifra<=100)
            System.out.println(+cifra+", "+producto+" é Baixo");
        else if (cifra>100 && cifra<=500)
            System.out.println(+cifra+", "+producto+" é Medio");
        else if (cifra>500 && cifra<=1000)
            System.out.println(+cifra+", "+producto+" é Alto");
        else if (cifra>1000)
            System.out.println(+cifra+", "+producto+" é de Primeira Necesidade");
        else
            System.out.println("Número non válido");
    }
    public int anuaisInt(){
        System.out.print("Teclea as ventas anuais do producto: ");
        int cifra=sc.nextInt();
        return cifra;
    }
    public String anuaisString(){
        System.out.print("Teclea o nome do producto: ");
        String producto=sc.next();
        return producto;
    }

}
