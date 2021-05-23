/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

/**
 *
 * @author HACKER PERSONjava abstract sinhala blog
 */
public class TestAnimal2 {
     public static void main(String[] args) {
        Animal animal;
        Dog d1=new Dog("Toomy");
      //  Cat c1=new Cat("kitty");
        
        animal =d1;
         System.out.println("Name  : " + animal.getName());
         
         animal.Speak();
       /*  
         animal =c1;
         System.out.println("Name  : "+ animal.getName());
         animal.Speak();
         
    */
    
}
