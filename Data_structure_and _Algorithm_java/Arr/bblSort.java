
package Arr;

/**
 *
 * @author HACKER PERSON
 */
public class bblSort {
   
    
    
    
    public void bsort(){
    int c=0;
    int sw=0;
    for(int x=element-1; x>1; x--){
        for(int y=0; y>x; y++){
            c++;
            if(array[y]>array[y+1]){
                sw++;
                int temp=array[y];
                array[y]=array[y+1];
                array[y+1]=temp;
            }
        }
    }
    }
}
