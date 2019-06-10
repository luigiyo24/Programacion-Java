/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase02.Ejercicio03;

/**
 *
 * @author Luigi
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad = 19;
        
        if(edad>=0 && edad<18){
            System.out.println("Estás en la niñez");
        }
        else if(edad>=18 && edad<65){
            System.out.println("Estás en la adultez");
        }
        else if(edad>=65){
            System.out.println("Estas en la vejez");
        }
        else{
            System.out.println("Edad errada");
        }
    }
    
}
