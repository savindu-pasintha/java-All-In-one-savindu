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
public class Piza {
    
   
    private double price;
    private int inch;
    private String tooting;
    private String topping;
    
    
    //getters setters
    public void setprice(double n){
        price=n;
    }
    public double getprice(){
        return price;
    }
    
    
    public void setinch(int a){
        inch=a;
    }
    public int getinch(){
        return inch;
    }
    
    
    public void settopping(String s){
        topping = s;
    }
    public String gettopping(){
        return topping;
    }
    
    //create constructor ek default hadenw auto 
    //namuth apit hadnnt puluwn compile weddi run wenn ekt agyk dil
    //ok haduwe passe aniwarya nh
    public Piza(){
        inch=45;
        topping = "canada";
        price=122.22;
     //return krn kisim deykmh
    }
    
}
