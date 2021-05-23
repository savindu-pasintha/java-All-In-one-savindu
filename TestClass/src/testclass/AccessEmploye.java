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

//balann empliyee class eke get /set hadpuw eke thin ew thmi othn accees kle
public class AccessEmploye {
    public static void main(String[] args) {
        
        //created employee1 object
        Employee saman=new Employee();
        //print object data
        System.out.println("Employee number" + saman.getempnum());
        //seterr to put new data bracket in (--write values--)
        saman.setempnum(80);
        System.out.println("Employee number" + saman.getempnum());
        
        
        
        //created employee2 object
        Employee sama=new Employee();
        //print object data
        System.out.println("Employee number" + sama.getempnum());
        //seterr to put new data bracket in (--write values--)
        sama.setempnum(140000000);
        System.out.println("Employee number" + sama.getempnum());
    }
    
}
