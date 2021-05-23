/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looptwotohundred;

/**
 *
 * @author HACKER PERSON
 */
public class Sum50 {
    
    public static void main(String[] args) {
        int z=0;
        for(int x=1; x<51;x++){
           
            //1+2+3+6+7...50=? sum get
            z+=x;
            System.out.println(x+"--"+(z-x)+"----"+z);
        }
    }
    
}
