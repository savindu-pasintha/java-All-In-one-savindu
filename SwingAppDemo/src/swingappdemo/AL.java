import java.awt.*;
import java.awt.event.*;

public class AL extends Frame implements WindowListener,ActionListener {
        TextField text = new TextField(20);
        Button b;
        private int numClicks = 0;

        
        // main program run 
        public static void main(String[] args) {
                AL myWindow = new AL("Event Listner");
                myWindow.setSize(500,500);
                myWindow.setVisible(true);
        }

        
        
        
        
        public AL(String title) {

                super(title);
                
                setLayout(new FlowLayout());
                addWindowListener(this);
                
                b = new Button(" BTN CLICK");
                add(b);
                add(text);
                
                
                b.addActionListener(this);
        }

        
        
        public void actionPerformed(ActionEvent e) {
                numClicks++;
               
                text.setText("Button Clicked * 10-> " + numClicks + " times");
        }

        
        
        public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
        }

        
        
        public void windowOpened(WindowEvent e) {}
        public void windowActivated(WindowEvent e) {}
        public void windowIconified(WindowEvent e) {}
        public void windowDeiconified(WindowEvent e) {}
        public void windowDeactivated(WindowEvent e) {}
        public void windowClosed(WindowEvent e) {}

}