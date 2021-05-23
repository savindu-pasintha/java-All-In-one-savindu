/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedobjectjava;

/**
 *
 * @author HACKER PERSON
 */
public class Commission {
    
    static double sf=100;
    static double cr=5.5;
    static int CR=21;
    
    
    //1--create overload method
    public static void computeComission(double sf,double cr){
        System.out.println("commission is--"+ (sf*cr/100.0));
    }
    
    
    //1--create overload method
   
    public static void computeComission((double sf,int CR) {
       System.out.println("commission is--" + (sf * cr) );
    }
    
    
    //part b
     //3--create overload method
    public static void computeComission(double sf){
        System.out.println("commission $="+ (sf*7.5));
    }
    
    
    //main program
    public static void main(String[] args) {
        
        //call
        computeComission(sf,CR);
        computeComission(sf,cr);
        computeComission(sf);


    }
    
    
}
