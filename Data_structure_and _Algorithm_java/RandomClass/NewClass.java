/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomClass;

import java.util.Scanner;

/**
 *
 * @author HACKER PERSON
 */
public class NewClass {
    
    
    
    public static void main(String[] args) {
        string[] sch=new string[1000];
        int count=sch.length/2;
        
        Scanner myObj = new Scanner(System.in);// Create a Scanner object
        
        //input 
        for(int i=0; i<sch.length; i++){
            
            String name = myObj.nextLine();
            System.out.println("Enter School"  + name);
            sch[i]=name;
        }
        
        
       //out put
        if(sch.length<=count){
            
        int c=0;
           while(c<=count){
             System.out.println( sch[count] + " " + sch[count+1] );
             c++;
            }
        
            }else{
           System.out.println(" ...finished... ");
        }
       
    }}     
    

