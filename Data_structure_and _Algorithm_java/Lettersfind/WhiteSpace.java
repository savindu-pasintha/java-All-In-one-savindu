/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lettersfind;
import java.lang.Character;
/**
 *
 * @author HACKER PERSON
 */
public class WhiteSpace {
    
    public String text;
    
    public void number(){
        int c=0;
        for(int x=0; x<text.length(); x++){
           c=text.charAt(x);
            if(Character.isLetterOrDigit(c)){
                c++;
            }
        }
    }
    
     
    public int numberofVOLEL(){
        int c=0;
        for(int x=0; x<text.length(); x++){
         char  cr=text.charAt(x);
             if( cr== 'a' || cr== 'A'){
                 c++;
             }
            else if( cr== 'e' || cr== 'E'){
                  c++;
             }else  if( cr== 'i' || cr== 'I'){
                  c++;
             }else  if( cr== 'o' || cr== 'O'){
                  c++;
             }else if( cr== 'u' || cr== 'U'){
                  c++;
             }    
        }
        return c;
    }
    
    
     public int[] frequencynumberofVOLEL(){
        int c,d,e,f,g;
        
        c=0; d=0; e=0; f=0; g=0;
        for(int x=0; x<text.length(); x++){
         char  cr=text.charAt(x);
             
             if( cr== 'a' || cr== 'A'){
                 c++;
             }
            if( cr== 'e' || cr== 'E'){
                  d++;
             }
            if( cr== 'i' || cr== 'I'){
                  e++;
             }
            if( cr== 'o' || cr== 'O'){
                  f++;
             }
            if( cr== 'u' || cr== 'U'){
                  g++;
             }
         
        }
        
        int arr[] = {c,d,e,f,g };  
        return  arr;
    }
    
    public String InsertEXternalString(String text,String insert,int psition){
       
        String p,newstring = null;
        p=text;
        String addstring=insert;
        
        for(int x=0; x<p.length(); x++){
         char  cr=p.charAt(psition);
               if(cr==){
                  
               }
                   
                   
        }
        
        return newstring;
}
    
    
    
    
    
    
    
    
    
    
      public int NumberofVOLEL(){
        int c=0;
        for(int x=0; x<text.length(); x++){
         char  cr=text.charAt(x);
            c
            
        }
        return c;
    }
    
    
    public static void main(String[] args) {
        text=textINputpara.getText().trim();
        textpara.setText(text);
    }
        
  
}

