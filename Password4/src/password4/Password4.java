/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password4;

/**
 *
 * @author HACKER PERSON
 */
public class Password4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
         char a,b,c,d;
        
         a =(char)System.in.read();
         b =(char)System.in.read();
         c=(char)System.in.read();
         d=(char)System.in.read();
        System.out.println("password is==" +a+b+c+d);
        
        if(a=='B'){
        System.out.println("valid passwoed");
        }
        else
        {
            System.out.println("in valid password");

        }
            
    }
    
}
