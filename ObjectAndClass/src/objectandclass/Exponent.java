/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectandclass;

/**
 *
 * @author HACKER PERSON
 */
public class Exponent {
    public static void main(String[] args) {
        
        square(5);//call
        cube(8);//call
        
    }
    
 //m1   
public static void square(int a){
    int a = 0,s;
    s=a*a;
    System.out.println("n square value is-" + s);
}
//m2
public static void cube(int b){
    int b = 0,c;
    c=b*b*b;
    System.out.println("n cube value is-" + c);
}

}