
package EncriptDcript;


public class EncriptDcriptClass {
    
    int count,pos;
    String orgMsg="";
    
     public String encriptMessage(String block, String msg){
       StringBuilder strBlock=new  StringBuilder(block);
       int msglength = msg.length();
       
       pos=0;
       count=0;
       int first,last;
       
        for(int x=200; x<block.length()-200; x++){
            char letter=strblock.charAt(x);
            if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u'){
                count++;
            }
            if(count==3){
               pos=x;
                break;
            }
        }
     }
    
    public String decriptMessage(String block){
        
       
        for(int x=200; x<block.length()-200; x++){
            char letter=block.charAt(x);
            if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u'){
                count++;
            }
            if(count==3){
               pos=x;
                break;
            }
        }
         
        orgMsg +=block.charAt(pos+1);
        return  orgMsg;
    }
}
