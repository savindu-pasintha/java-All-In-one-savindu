/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake_moving_game;
import java.awt.*;
import java.awt.event;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author HACKER PERSON
 */
public class Snake {
    JPanel p1,p2;
    JButton[] lb=new JButton[200];
    JButton bounsfood;
    JTextArea t;
    int x=1000,y=500,gu=2,directionx=1,
    directiony=0,speed=100,diffrrence=0,
    oldx,oldy,score=0;
    int[] lbx=new int[600];
    int[] lby=new int[600];
    Point[] lbp=new Point[600];
    Point bfp=new Point();
    
    Thread myt;
    boolean food=false,runl=false,runr=false,
    runu=true,rund=true,bounsflag=true;
    Random r=new Random();
    JMenuBar mymbar;
    JMenu game,help,level;
    
    public void initializeValues(){
    
    gu=3;
    lbx[0]=200;
    lby[0]=300;
    directionx=10;
    directiony=0;
    score=0;
    food=false;
    runl=false;
    runr=true;
    runu=true;
    rund=true;
    bounsflag=true;
    }
    
    
    snake(){
        
        super("snake");
        setSize(1000,590);
        
        createbar();
        
        initializeValues();
        
        p1=new JPanel();
        p2 =new JPanle();
        
        t.setEnabled(false);
        T=NEW JTextArea("score==>"+score);
        t.setBackground(Color.BLACK);

bounsfood=new JButton();
bounsfood.setEnabled(false);

creatFirstSnake();
p1.setLayout(null);
p2.setLayout(new GridLayout(0,1));
p1.setBounds(0,0,x,y);
p1.setBackground(Color.blue);
p2.setBounds(0,y,x,30);
p2.setBackground(Color.RED);

p2.add(t);

getContentPane().setLayout(null);
getContentPane().add(p1);
getContentPane().add(p2);
show();
setDefaultCloseOperation(EXIT_ON_CLOSE);
addKeyListener(this);

myt=new Thread(this);
myt.start();//go to the run method


    }

    public void creaFirstsnake(){
        //intialixe the snake has small length 3
        
        for(int i=o;i<3;i++){
            
            lb[i]=new JButton("lb"+10);
            lb[i]=setEnabled(false);
            pl.add(lb[i]);
            lb[i].setBounds(lbx[i],lby[i],10,10);
            lbx[i+1]=lbx[i]-10;
            lby[i+l]lby[i];
            
            
        }
    }
    
    
    public void createbar(){
        mybar=new JMnuBar();
        game=new JMenu("GAME");
        JMenuItem newgame=new JMenuItem("Exit");
        newgame.addActionListener(new ActionListener(){
            @Override
            public void actionformed(ActionEvent e){
            reset();
        });
        exit.addActionListener(new ActionListner(){
        @override
        
        public static void actionPerformed(ActionEvent e){
            System.exit(0);
        
    }
    });
    
    game.add(newgame);
    game.addSeparator();
    game.add(exit);
    mybar.add(game);
    level=new JMenu("Level");
    help=new JMenu("help");
JMenuItem creator=new JMenuItem("creator");
JMenuItem instruction=new JMenuItem("instruction");
creator.addActionListener(new ActionListener);


    private void creatFirstSnake() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
