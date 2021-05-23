
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package time;

/**
 *
 * @author HACKER PERSON
 */
public class Time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m=150; 
        float h=m/60; 
        float r=m%60; 
        
        System.out.println(h +"hours and"+ r +"minites now.");
        
        
        import java.util.Scanner;
        Scanner obj=new Scanner(System.in);
        
        System.out.println("Input MINITES---"); 
        int M=obj.nextInt();
        float HR=M/60;   float RE=M%60;
       System.out.println(HR +"hours and"+ RE +"minites now.");

        
        
    }
    
}
