
package Method_to_Parameeter_set;


public class Run_time_set {
    
   //create method
         /*return data type     parameeter datatype with variable names */    
    public String Method(String s,String  d){
        String p=s+d;//catch the parameeter values using p
        System.out.println("p is----"+ p);
       return p;
    }
    
    
    
    
    //main run 
    public static void main(String[] args) {
        
        
        //call method using object through 
        new Run_time_set().Method("savindu","k");
    }
    
}
