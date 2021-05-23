/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclass;

/**
 *
 * @author HACKER PERSON
 */
public class TestPiza {
    public static void main(String[] args) {
        
        Piza p1=new Piza();
        
         p1.setprice(80.22);
        System.out.println("Employee number" + p1.getprice());
        
         p1.setinch(14);
        System.out.println("Employee number" + p1.getinch());
        
        p1.settopping("AMERIKA");
        System.out.println("Employee number" + p1.gettopping());
    }
}
