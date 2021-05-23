
package data_structure_and._algorithm_java;
import java.util.Arrays;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;


public class ArrayClass extends NewArr{
    
  private int arrname[];
  private int arraysize;
    
  public void  create(int inputsize){
      try{
       arraysize=inputsize;
       arrname =new int[arraysize];
       JOptionPane.showMessageDialog(this,"CREATED NEW SIZE "+arraysize+" ARRAY");
      }catch(HeadlessException e){
          String er=e.getMessage();
         JOptionPane.showMessageDialog(this,er);
      }finally{
         JOptionPane.showMessageDialog(this,"Thank You..!");
      }
  }
  public void  insert(){}
  public void  update(){}
  public void  search(){}
  public void  delete(){}
    
}
