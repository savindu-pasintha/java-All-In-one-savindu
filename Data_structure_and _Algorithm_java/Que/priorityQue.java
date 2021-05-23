
package Que;


public class priorityQue {
    int[] arrpq;
    int elements,size,front,rear;
    
    
    public void create(int s){
        size=s; arrpq=new int[size]; front=0;  elements=0;
    }
    
    public void insert(int add){
        
       if(isempty()){  arrpq[++front]=add;
       }else{     
       for(int i=elements-1; i>0;  i++){
         arrpq[i]=add;
       }
        
       }
     }
    
       public int remove(){
         int r=arrpq[front++];
         if(front==size) {front=0;}
         
         elements--;
         return r;
     }
       public int peek(){
           int peek=arrpq[front];
         return peek;
     }
       
       public boolean isempty(){   
           return elements==0;
     }
       public boolean isfull(){
         return elements==size;
     }
       
       //way 2 insert
    public void insert2(int add){
        int x;
       if(isempty()){  arrpq[elements]=add;
       }else{     
       for( x=elements-1; x>0;  x--){
           if(arrpq[x]<add){
               arrpq[x+1]=arrpq[x];
           }else{
               break;
           }
         arrpq[x+1]=add;
       }
       elements++;
        
       }
     }
     public int remove2(){
         return arrpq[--elements];
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


