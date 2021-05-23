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
public class AccsesStudent {
    public static void main(String[] args) {
        Student s1=new Student();//cteat student  to s1 object
        
        //object to set values
        s1.setcredit(50);
        s1.setid(1);
        s1.setpoint(12);
        
        System.out.println(s1.getpoint()+"student point is");
        System.out.println("student id is"+s1.getid());
        System.out.println(s1.getcredit()+"student credit is");

        
        
    }
}
