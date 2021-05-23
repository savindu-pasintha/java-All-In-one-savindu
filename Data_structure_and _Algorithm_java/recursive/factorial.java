/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursive;

/**
 *
 * @author HACKER PERSON
 */
public class factorial {
    
    
    public static int fac(int enter){
        
        
        int x=0;
        
        if(enter==0 || enter==1){
            return 1;
        }
        else{
          for(int y=enter; y>=1; y--){
             x=x*y;
          }
        }
        return x;
        
    }
     
    
     public static int recuaiceFac(int enter){
        
        
        int x=0;
        
        if(enter==0 || enter==1){
            return 1;
        }
        else{
          x= enter*recuaiceFac(enter-1);
        }
        return x;
        
    }
     
     public static int recuaiceFac2(int enter){
        
        
        int x=0;
        
        if(enter==0 || enter==1){
            return 1;
        }
        else{
          x= enter*recuaiceFac(enter-1);
        }
        return x;
        
    }
        
        
   
    public static void main(String[] arg){
        
        System.out.println(fac(10));
    }
}
