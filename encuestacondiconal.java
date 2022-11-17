/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author marib
 */
public class encuestacondiconal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("califique la peli de 1 a 5 estrellas");
        opinion = leer.nextInt();
        
        if (opinion >= 1 && opinion <= 5) {
        
           switch (opinion) {
               case 1:
               case 2:
                   System.out.println("nos sentimos apenados");
                   break;
               case 3:    
                   System.out.println("la peli fue buena");
                   break;
               case 4:
                   System.out.println("fue muy buena");
                   break;
               case 5:
                   System.out.println("fue excelente");
                   break;
                   
           }
    } else if (opinion < 0){
                   System.out.println("super mala?");
                   }
     else if (opinion == 0){
                   System.out.println("no valido");
                   }
     else { System.out.println(opinion + "una verga");
                   }
           System.out.println("nos vemos");
                   
    
                           
           }
    }


    

