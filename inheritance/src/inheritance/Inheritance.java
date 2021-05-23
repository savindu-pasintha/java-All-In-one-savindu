/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author HACKER PERSON
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Computer c1=new Computer("core i3",4.7);
        MultimeadiaComputer mc1=new MultimeadiaComputer("core i7",3.5,1);
        
        System.out.println("Model-c1: "+ c1.getModel());
        
        System.out.println("Model-mc1 : "+ mc1.getModel());
        
        
        
         System.out.println("speed-c1 : "+ c1.getSpeed() +"GHZ");
          System.out.println("speed-mc1: "+ mc1.getSpeed()+ "GHZ");
        
        
    }
    
}
