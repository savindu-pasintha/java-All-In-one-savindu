/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SackAndQue;
import java.util.Stack;
/**
 *
 * @author HACKER PERSON
 */
public class MuStack {
    
    int size;
    int stackarr[];
    int top;
    
    public void create(int s){
        this.size=s;
    stackarr =new int[size];
    top=-1;
    
    //postfix 
   //ok nn  top=0; nam stackarr[top++]=v;
    }
   
    public void push(int v){
    stackarr[++top]=v;
    }
    
    public int pop(){
    return stackarr[top--];
    }
    
    public int peek(){
    return stackarr[top];
    }
}
