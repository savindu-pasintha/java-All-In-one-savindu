
package Up_Down_Casting_in_Inheritance;


public class Run {
    
    
    
    
    public static void main(String[] args) {
        
      /*  Upcasting - Parent class ekt B class ek obj Ekk damm*/
      
      B_class bobj=new B_class();
      A_Parent_class aobj=new A_Parent_class();
      aobj=(A_Parent_class) bobj;
      aobj.a();
      aobj.b();
      //end up casting
        
     /*  Down casting-parent class ekt child class eke obj ekk damm   */
        A_Parent_class ab=new B_class();
        ((B_class)ab).b();
        ((B_class)ab).a();
        //end down casting
        
        
    }
}
