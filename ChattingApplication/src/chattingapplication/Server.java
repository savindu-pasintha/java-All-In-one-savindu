
package chattingapplication;
bimport javax.swing.*;
public class server extend JFrame implements Actionlistener{
    //constructor create
    server(){
        setSize(500,600);
        /*frame size ek hadala pixel 500*600 kotuwak*/
        setVisible(true);
        //hadapu frame ek pennanna kiyala
    }
    
    //main class
    public static void main(String[] args) {
        new server().setVisible(true); 
    }
    
}
