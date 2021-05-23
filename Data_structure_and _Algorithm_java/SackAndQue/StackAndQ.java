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
public class StackAndQ {
   
Stack myStack = new Stack();
myStack.push(1);


System.out.println(myStack.pop());
System.out.println(myStack.pop(1));

myStack.peek();
myStack.empty(); // True if stack is empty
}
