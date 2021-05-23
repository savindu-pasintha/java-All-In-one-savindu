/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author HACKER PERSON
 */
import java.util.Scanner;
public class Furniture {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("input p-m-o");
        
        char type=s.next().charAt(0);
        
        
         switch(type){
             
             case 'p' -> {
                 System.out.println("tabli price is 300");
             }
              case 'o' -> {
                   System.out.println("tabli price is 300");
             }
              case 'm' -> {
                   System.out.println("tabli price is 300");
             }
              
              default -> {
                   System.out.println("invalid input");
              }
         }
    }
    
}
