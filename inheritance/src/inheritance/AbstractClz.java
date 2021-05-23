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
public class AbstractClz {

private String name;
 public Animal(String nm) {
     
 name = nm; 
}
 public String getName(){ 
     
        return name; 
}
 
 //this is a abstract method here
public abstract void speak();  



}
   

