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
public class Aula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lutador l[]= new Lutador [6];
        l[0]= new Lutador ("Pretty Boy ", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1]= new Lutador ("Putscript ", "Brasil", 29 , 1.68f ,57.8f , 14,2,30);
        l[2]= new Lutador ("Snapshadow" , "Brasil" , 29 , 1.65f , 80.9f , 14 , 2, 1);
        l[3]= new Lutador ("Deade Code ", "Australia" , 28 , 1.93f ,81.6f ,13 ,0 ,2);
        l[4]= new Lutador ("Ufocobol", "Brasil" , 37, 1.70f,119.3f,5,4,3);
        l[5]= new Lutador ("Nerdaard", "EUA",30,1.70f, 119.3f , 5, 4, 3);
          
         l[1].ganharLuta();
         l[1].apresenta();
         l[3].apresenta();
       
         
        
        
        
               
   
    }
    
}
