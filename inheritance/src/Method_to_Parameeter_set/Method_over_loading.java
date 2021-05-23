
package Method_to_Parameeter_set;


public class Method_over_loading {
    //1-create methods with
    //same return type--same method name--difference parameeters
    void m(String s, int y){
        System.out.println(s+"---"+y);
    }
    
    void m(String s, int y,String v){
        System.out.println(s+"---"+y+"---"+v);
    }
    
    
    
    
    String f(String s,String v){
        System.out.println(s+"---"+v);
        return null;
    }
    
    String f(String s,String v,String z){
        System.out.println(s+"---"+v);
        return null;
    }
    
    
    
    
    
    //run
    public static void main(String[] args) {
        
        
        //2-creat object in mthods at class
        Method_over_loading n=new Method_over_loading();
        
        //object true call methods
        n.m("savindu",20);
        n.m("savindu",20,"pasinghta");
        
        
        n.f("savindu","Lakmal");
        n.f("savindu","11111111111","pasinghta");
    }
}
