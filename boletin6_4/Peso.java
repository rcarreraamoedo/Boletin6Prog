/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_4;
/**
 *
 * @author usuario
 */
public class Peso {
    private String nome;
    private float peso;
    
    public Peso(){
    }
    
    public Peso(String nome, float peso){
        this.nome=nome;
        this.peso=peso;
    }
    public void setnome(String nome){
        this.nome=nome;
    }
    public String getnome(){
        return nome;
    }
    public void setpeso(float peso){
        this.peso=peso;
    }
    public float getpeso(){
        return peso;
    }
}
