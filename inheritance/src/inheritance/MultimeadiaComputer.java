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
public class MultimeadiaComputer extends Computer{
    //aditional interger feild
    
    private int data;
    
    public MultimeadiaComputer(String model,double speed,int data){
        
        super(model, speed);
        this.data=data;
        
    } 
    
    
    public int getData(){
        return data;
    }
}
