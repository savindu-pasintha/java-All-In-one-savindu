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
public class Employee {
    private int empnum;
    private String empname;
    
    
    //getters setters
    public void setempnum(int n){
        empnum=n;
    }
    public int getempnum(){
        return empnum;
    }
    
    //create constructor ek default hadenw auto 
    //namuth apit hadnnt puluwn compile weddi run wenn ekt agyk dil
    //ok haduwe passe aniwarya nh
    public Employee(){
        empnum=151515;
     //return krn kisim deykmh
    }

}
