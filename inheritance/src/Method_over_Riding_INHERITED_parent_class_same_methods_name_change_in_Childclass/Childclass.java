
package Method_over_Riding_INHERITED_parent_class_same_methods_name_change_in_Childclass;


public class Childclass extends Parentclass{



    
//chancge the parentclass same name with method
    @Override
    void parentmethod() {
        
        int p=100*20;
        System.out.println(" override-parentmethod change code in child class .own customized code"+p);
    }
   
}
