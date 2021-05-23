
package Arr;
import java.awt.HeadlessException;
import java.util.Arrays;
import javax.swing.JOptionPane;


public class ArrayClass extends A{
    
  private int arrname[];
  private int arraysize;
  private int insertvalue;
  private  int index;
    
  public void  create(int inputsize){
      try{
       arraysize=inputsize;
       arrname =new int[arraysize];
       index=0;
       JOptionPane.showMessageDialog(this,"CREATED NEW SIZE "+arraysize+" ARRAY");
         }finally{
         JOptionPane.showMessageDialog(this,"Thank You..!");
         }
  }
  public void  insert(int values){
      
      try{
       insertvalue=values;
       arrname[index]=insertvalue;
       int[] arrn=new int[5];
       int a=arrn[index];
       System.out.println(a);
      }finally{
       index++;
       JOptionPane.showMessageDialog(this,"Thank You..!"); 
  }
  }
  public void  update(){}
  public void  search(){}
  public void  delete(){}
    
  
  int sv,elements;
  public String dublicatesearch(){
      int[] array={4,5,4,8,6,4};
      int c=0;
      for(int x=0; x<elements; x++){
          if (array[x]==sv){
          c++;
          }if(c==0){return "not found";
          }else{return "found"+c+"times";}
      }
      return null;
  }
  
   public String dublicatedelete(){
        int[] array={4,5,4,8,6,4};
        int[] temp=new int[elements];
        int i=0;
        int c=0;
      for(int x=0; x<elements; x++){
          if (array[x]==sv){
          c++;
          }else{ temp[i]=array[x]; i++;}
          
      }if(c==0){return "not found";}
      else{elements=elements-c;
      for(int x=0; x<elements; x++){
          array[x]=temp[x];
      }return "deleted "+c+" times";
      }
      }
}
