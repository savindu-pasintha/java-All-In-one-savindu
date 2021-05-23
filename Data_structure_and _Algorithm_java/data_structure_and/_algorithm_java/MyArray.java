
package data_structure_and._algorithm_java;


public class MyArray extends View{
    
    private int[] a;
    private int elements;
    private int size;
    
    public void create(int s){
        size=s;
        a=new int[size];
        elements=0;
        
    }
    
    public void insert(int p){
        a[elements]=p;
        elements++;
        
    }
    
    public void find(int p){
        
    }
    
    
    int v;
    
    public void setV(int id) {
        this.v = v;
    }

    public int getV() {
        return v;
    }
    
    public void display(){
        for (int var : a) 
        { 
          d.setText(v.toS());
        } 
       
    } 

     public void delete(int p){
        
    }
    
    
    
}
