
package Que;
import java.util.LinkedList;

public class Linkedlist {
    int[] arrpq;
    int elements,size,front,rear;
    
    public void newg(){ 
    LinkedList listname=new LinkedList();
    listname.add(10);
        System.out.println(listname.remove());
    }
    
    public int peek2(){
           int peek=arrpq[--elements];
         return peek;
     }
       
       public boolean isempty2(){   
           return elements==0;
     }
       public boolean isfull2(){
         return elements==size;
     }
    
}
