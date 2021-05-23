/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author HACKER PERSON
 */
public class Payroll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int h=40;
        int hrate=7;//$
        int whs=h*7;
       int x= whs*hrate;
       float y=(x*15)/100;
        
       float nets=x-y;
        System.out.println("hour : "+h);
        System.out.println("hour rate: "+hrate);
        System.out.println("week hours : "+whs);
        System.out.println("tax per week : "+y);
        System.out.println("net salary per week : "+nets);
       
       
    }
    
}
