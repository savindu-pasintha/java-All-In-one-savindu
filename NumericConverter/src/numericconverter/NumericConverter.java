/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericconverter;

/**
 *
 * @author HACKER PERSON
 */
public class NumericConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //implecitly converter
        short x=45;
        float y=x;
        System.out.println("short to floate is="+y);
        
        //emplicity converter
        double n=12.52222222;
        int m;
        m=(int)n;
        System.out.println("double to int=" +m);
        
        //char variable used to only single chracters
        char k='j' ,j='5' ;
        
        String z="savindu_pasingtha";
        System.out.println("k="+k); 
        System.out.println("j="+j); 
        System.out.println("z is="+z);
        
        System.out.println("hiiiii\\iiiiiiiii\niiiii\'iiii\tiiii\bii");
        
        //ascii codes characters
        char v1=65;
        System.out.println("v1 is asci=--------"+v1);
        //unicodes chracters
        char v3='\u0041';
        System.out.println("v3---------"+v3);
        
    }
    
}
