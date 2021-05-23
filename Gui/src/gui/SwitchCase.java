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
public class SwitchCase {
    public static void main(String[] args) {
     int p;
     switch(p){
         case 5:{
             System.out.println("Valid");
            break; 
         }
         case 10:{
             System.out.println("invalid");
             break;
         }
         
         default{
             System.out.println("input wrong");
         }
     }
     char l;
     switch(p){
         case '5':{
             System.out.println("Valid");
            break; 
         }
         case 'a':{
             System.out.println("invalid");
             break;
         }
         
         default{
             System.out.println("input wrong");
         }
    }
     
     
     // conditional
     int x=10;
     
     String r=(x>0) ? "true" : "false";
        System.out.println("result");
        
        
        //
        int r=45;
     String r=  !(x>0) ? "true" : "false";
        System.out.println("result");
     
     
    } 
}
