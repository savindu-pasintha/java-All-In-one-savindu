/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedobjectjava;

/**
 *
 * @author HACKER PERSON
 */
public class Advancedobjectjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        myMethod();
        
        mymethod2();
    }
    
    public static void myMethod () {
  
  { // first block is out side block
   int num1=10;
   System.out.println("Number one is " + num1);
  }
  {// second block
   int num2=20;
   System.out.println("Number one is " + num2);
   
   // othana num 1 thibb nam error ekk enwa .bracket eke athule nathu hind
  }
}

    
    public static void mymethod2(){
        //block 1
        
        {
            int num=20;
            System.out.println(num);
            
        }
        
        //block 2
        
        {
            int num=30;
            System.out.println(num);
        }
    }
    
    
    //overide instant variables
public class Number {
 private int num1 =10;
 private int num2 =20;
  public void myMethod22 () {
   int num1=30;
   System.out.println("Number one is " + num1);
   System.out.println("Number one is " + num2);
  }
 public void myMethod2() {
   System.out.println("Number one is " + num1);
   System.out.println("Number one is " + num2);
  }
 
      public static void main(String[] args) {
          Number n1=new Number();
          
          n1.myMethod22();
      }
 
 
 
 
}

        
        
        
}
