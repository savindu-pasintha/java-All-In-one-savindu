/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arr;
import java.util.Arrays;
/**
 *
 * @author HACKER PERSON
 */
public class OrderdArray {
    
    
    int[] array;
    int elements;
    public void orderedarrayInser(int v){
        array[elements]=v;
    }
    
    public void oai(int v){
        
        for(int x=0; x<=array.length; x++){
        if(array[x] == 0){
            array[x]=v;
            break;
        }else{
            continue ;
        }
        
        }
        
    }
}
