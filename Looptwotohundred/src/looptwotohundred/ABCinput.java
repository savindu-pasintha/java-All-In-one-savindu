/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looptwotohundred;
import java.awt.event.WindowListener;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HACKER PERSON
 */
public class ABCinput {
JFrame f;

ABCinput(){  
   
    f.addWindowListener((WindowListener) this);  
    f.setSize(300, 300);  
    f.setLayout(null);  
    f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
    f.setVisible(true);
    f=new JFrame();  
    JOptionPane.showMessageDialog(f,"GOOD JOB !");     
} 


    /**
     *
     * @param args
     */
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);  //create obj sc 
                
       System.out.println("Enter your A-B-C-Q--:");  
       String c;
        c = sc.next();

        switch(c){
        case "A" -> {
          //display good job message
          ABCinput abCinput = new ABCinput();
        }
       

        case "B" -> {
          //display good job message
          ABCinput abCinput = new ABCinput();
        }
        
        case "c" -> {
          //display good job message
          ABCinput abCinput = new ABCinput();
        }
        case "Q" -> {
              /**  //display exit message and exit later
       int r;
       r = JOptionPane.showConfirmDialog(null,"EXIT NOW....!","EXIT",JOptionpane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
       if(r==JOptionPane.YEs_OPTION){
           System.out.println("YES BUtton");
           System.exit(0);
       }

**/
        }

        default -> {
                //display comfrim message
                //return to loop

        }
    }
    }
    
    
}
