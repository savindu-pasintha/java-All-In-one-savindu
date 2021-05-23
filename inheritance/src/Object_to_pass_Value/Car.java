
package Object_to_pass_Value;


public class Car {
    
    //1-variable 
    String color;
    int seat;
    
    
    
    
    
    public static void main(String[] args) {
        
    //2-creat  c- obj in Car class
    Car c=new Car();
    
    //3-value pass
    c.color="red";
    c.seat=8;
    
    
    //4-out put class method 
        System.out.println("color is-"+ c.color+  "\n"   +"seat is -"+c.seat);
        
    }
    
}
