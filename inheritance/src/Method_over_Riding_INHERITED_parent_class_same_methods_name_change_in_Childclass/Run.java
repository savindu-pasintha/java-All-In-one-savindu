
package Method_over_Riding_INHERITED_parent_class_same_methods_name_change_in_Childclass;


public class Run {
    
    
    
    
    
    public static void main(String[] args) {
        
       //1-call parent class method
        new Parentclass().parentmethod();
        
        
        
        
        //2-call child class overide method
      Childclass c=new Childclass();
      c.parentmethod();
      
    }
}
