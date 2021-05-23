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
public class JavaMath {
    public static void main(String[] args) {
        System.out.println(" "+ Math.pow(2,3));
        System.out.println(" "+ (double)Math.pow(5.4,3));
        System.out.println(""+ Math.random());
        
        
        
        int x = 72;
        if(x<100 || x>10){
            System.out.println(""+ Math.random());

        }
        
        
        
        //cal circle area=2 pi R
        double R = 556,b;
        double area;
        b=Math.PI;
        area=R*b*2;
        
        System.out.println("circle area is---" + area);

        
    }
    
}
