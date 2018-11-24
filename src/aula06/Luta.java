/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

import java.util.Random;

/**
 *
 * @author Bruno
 */
public class Luta { 
    
    // Atributos 
   
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada ;
    
    // Metodos 
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) 
                && l1 != l2 ){
            this.aprovada = true ;
            this.desafiado = l1;
            this.desafiante = l2;
        
    }    else { 
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
           
               
            
        }
                
        
    }
    
    public void lutar () {
        if (this.isAprovada()){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresenta();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresenta();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor ) {
                
                case 0 : //Empate 
                    System.out.println("EMPATE");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                    
                case 1://Desafiado ganha luta
                    System.out.println(this.desafiado.getNome() + " VENCEU A LUTA");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                    
                case 2:// Desafiante ganha luta
                    System.out.println(this.desafiante.getNome() + "VENCEU A LUTA ");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
                   
                            
        }else{
            System.out.println(" A luta não pode acontecer");
        }
        
    }
    
    // Metodos Especiais acessores

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
}
