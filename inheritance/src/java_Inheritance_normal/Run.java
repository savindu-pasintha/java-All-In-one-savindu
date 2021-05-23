/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_Inheritance_normal;

/**
 *
 * @author HACKER PERSON
 */
public class Run {
    public static void main(String[] args) {
        Parent p=new Parent();
        Child1 c=new Child1();
       
        p.Commom();//only  call parent class object
        c.fish();// inheritance-this time child1 class c object through access parent class method
        c.bird();//access child1 clas method
    }
    
}
