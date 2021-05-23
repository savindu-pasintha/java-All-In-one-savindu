
package Que;

import java.util.PriorityQueue;
import java.util.Queue;
import javax.swing.JOptionPane;
public class Ques {
    Queue q=new PriorityQueue();
    
    
    
    int[] queArr;
    int size;
    int first,rear;
    public void create(int s){
        this.size=s;
        queArr=new int[size];
        JOptionPane.showMessageDialog(null,"Created---"+size);
        first=0;
        rear=-1;
    }
    
     public void insert(int add){
           queArr[first]=add;
           first++;
     }
     
     public int front(){
            
           int front=queArr[first++];
         return front;
     }
     
      public int peekk(){
            int le=queArr.length;
           int peek=queArr[le-1];
           le--;
         return peek;
     }
      
       public int remove(){
           int r=queArr[first++];
         return r;
     }
       public int peek(){
           int peek=queArr[first];
         return peek;
     }
       
       public boolean isempty(){
         return rear==-1;
     }
       public boolean isfull(){
         return rear==-1;
     }
}
