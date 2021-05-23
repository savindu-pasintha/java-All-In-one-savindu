
package Que;


public class circularQue {
    int[] arrque;
    int size,front,rear,elements;
    
    public void create(int s){
        size=s; arrque=new int[size]; front=0; rear=-1; elements=0;
    }
    
    public void insert(int add){
        if(rear==size-1){rear=-1;}
           arrque[++front]=add;
          elements++;
     }
     
    
       public int remove(){
         int r=arrque[front++];
         if(front==size) {front=0;}
         
         elements--;
         return r;
     }
       public int peek(){
           int peek=arrque[front];
         return peek;
     }
       
       public boolean isempty(){   
           return elements==0;
     }
       public boolean isfull(){
         return elements==size;
     }
}

