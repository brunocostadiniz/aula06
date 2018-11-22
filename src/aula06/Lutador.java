/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author Bruno
 */
public class Lutador {
    
    //Atributos da Classe
private String nome;
private String nascionalidade ;
private int idade;
private float altura;
private float peso;
private String categoria;
private int vitotias ;
private int derrotas;
private int empates;

// Metodos 
public void apresenta () {
    
}
public void  status (){
    
}
public void ganharLuta(){
    
}
public void perderLuta(){
    
}
public void empatarLuta (){
    
}
      
// Metodos acessores Get e Set

    public Lutador(String nome, String nascionalidade, int idade, float altura, float  int vitotias, int derrotas, int empates) {
        this.nome = nome;
        this.nascionalidade = nascionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.categoria = categoria;
        this.vitotias = vitotias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitotias() {
        return vitotias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }


       
        
       
        
       
     
             
    
}
