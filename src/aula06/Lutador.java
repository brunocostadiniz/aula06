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
private int vitorias ;
private int derrotas;
private int empates;

// Metodos 
public void apresenta () {
    System.out.println("Nome: " + getNome());
    System.out.println("Nascionalidade: " + getNascionalidade());
    System.out.println("Idade:  " + getIdade());
    System.out.println("Altura:  " + getAltura() );
    System.out.println("peso:  " + getPeso());
    System.out.println("Categoria:  " + getCategoria());
    System.out.println("Vitorias:  " + getVitorias());
    System.out.println("Derrotas:  "+ getDerrotas());
    System.out.println("Empates:  " + getEmpates());
}
public void  status (){
    System.out.println("Nome.....Vitorias .... Derrotas....Empates" );
    System.out.println(getNome() );
    System.out.print(getVitorias());
    System.out.print(getDerrotas());
    System.out.print(getEmpates());
    
}
public void ganharLuta(){
    setVitorias(getVitorias()+ 1);
}
public void perderLuta(){
    setDerrotas(getDerrotas() + 1);
   
}


public void empatarLuta (){
    setEmpates (getEmpates() + 1);   
}
      
// Metodos acessores Get e Set

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

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
       getCategoria ();
       
               
      
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
        if (getPeso() < 52.2 ) {
            System.out.println("Invalida");          
        } else if (getPeso() <= 70.3){ 
            System.out.println("Leve");
        } else if (getPeso()<=83.9){ 
            System.out.println("Médio");
        } else if (getPeso()<=120.2 ) {
            System.out.println("Invalido");
        }
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }


       
        
       
        
       
     
             
    
}
