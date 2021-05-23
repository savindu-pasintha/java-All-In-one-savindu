/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

/**
 *
 * @author HACKER PERSON
 */



//      set abstract keyword
public abstract class Animal {
    
    
    private String name;
    public  Animal(String n){
        name=n;
    }
    
    
    public String getName(){
        return name;
    }

    void Speak() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
