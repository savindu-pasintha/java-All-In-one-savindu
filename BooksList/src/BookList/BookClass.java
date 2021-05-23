/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookslist;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.nio.file.FileAlreadyExistsException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookClass{
               
  //Global Variable define
    public String no="0";//ISBN NUMBER have 13 digits
    public double price ;
    public String title, author,edition;
    
    
    //Book list array
    public String[] bookArray;
    
  //Arrays variable define to searching
  //public int[] noArray;//ISBN NUMBER 987-334545
    public double priceArray[] ;
    public String titleArray[], authorArray[] ,editionArray[];
    public long  noArray[];
    
    public double temppriceArray[] ;
    public String temptitleArray[], tempauthorArray[] , tempeditionArray[];
    public long  tempnoArray[];
    
    
      //file details
     //Book.txt
    public String filename="src/BookList.txt";
    File file,filetemp;
    FileWriter fw,fwx; 
    FileReader fr;
    
    //array index-value-count of Size
    public int count;
    public int index;
    public String value;
    public String searcheddata[];
    
 
    //functional task define
    public void createList(String no,String title,String Author,String Edition, double price){
    // this.no="979-9295055025";   this.title="Title";  this.author="Author";  this.edition="Edition"; this.price=59.45;
        
        bookArray =new String[5];
        bookArray[0]=String.valueOf(no);// int to string 
        bookArray[1]=title;  
        bookArray[2]=Author;  
        bookArray[3] =Edition;
        bookArray[4] = String.valueOf(price);// double to string
        
        //Store data to file.text 
        try {
                file=new File(filename);
                file.createNewFile();
                writeFileInside(bookArray);
                System.out.println(" executed createList() block");  
        } catch (IOException ex) {
            Logger.getLogger(BookClass.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error in createList() catch block"+ "/n" +ex);
        }
    }
    public void writeFileInside(String input[]){
// filewriter class object create
      
        try {
            
            fw=new FileWriter(filename, true); //file write append enable;
            //write data file inside
             for(int i=0; i<input.length; i++)
             {
                 fw.write(input[i] +  ",");
             }
            fw.write('\n');
            fw.close();// close the writing
           System.out.println("write all the data inside the file");
        } catch (IOException ex) {
            Logger.getLogger(BookClass.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error in writefileInside()" + "/n"+ ex);
        }
    }
    public void readFileInsideData(){
        try {
            
            System.out.print(" Work in the readFileInsideData()  ");
         //   fr = new FileReader(filename);
         
            int c=0;
          
            long colOne;
            String colTwo,colThree,colFour,word;
            double colFive;
            
//            int x=0;
//            Scanner countLine = new Scanner(fr);
//            while(countLine.hasNext()){
//               x++;// find th how many rows /Lines in the text file
//             }
//             System.out.println(x);
//             
            
              //  System.out.println(scan.nextLine());
              
            fr = new FileReader(filename);  
            Scanner scan = new Scanner(fr);
            //asign array
              BookClass obj = new BookClass();
              int z = obj.coutLine();// count the How many lines in the text file
            priceArray =new double[z];
            titleArray=new String[z];
            authorArray = new String[z];
            editionArray = new String[z];
            noArray = new long[z];
            
            while(scan.hasNext()){
            
                word=scan.nextLine();//line data store variable
                
                Scanner separatebyscan = new Scanner(word); //that string scan 
                separatebyscan.useDelimiter(","); //separate by that ","
                
                // ISBN remove "-" simble and convert to long array
                String y=separatebyscan.next();//"978-87878787"
                String[] x =y.split("-"); // [ "978","65656565"]
                String ISBN= x[0]+x[1];
                
                colOne=Long.parseLong(ISBN);
                colTwo=separatebyscan.next();
                colThree=separatebyscan.next();
                colFour=separatebyscan.next();
                colFive=separatebyscan.nextDouble();
                
                noArray[c]=colOne;
                titleArray[c]=colTwo;
                authorArray[c]=colThree;
                editionArray[c]=colFour; 
                priceArray[c]=colFive;
                
                System.out.println(c+"-"+colOne+'\n'+c+"-"+colTwo+'\n'+c+"-"+colThree+'\n'+c+"-"+colFour+'\n'+c+"-"+colFive+"\n");
                
                /*
                noArray[c]=colOne;
                titleArray[c]=colTwo;
                authorArray[c]=colThree;
                editionArray[c]=colFour; 
                priceArray[c]=colFive;
                */
                
                c++;
            }
            
            for(int i=0; i<priceArray.length; i++){
                 System.out.println(i+" - "+noArray[i]+'-'+priceArray[i]+'-'+authorArray[i]+"-"+ titleArray[i]+"-"+editionArray[i]);
                 
            }
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BookClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int coutLine() {
      //int count =0;
    try{
          
            fr = new FileReader(filename);  
            Scanner s = new Scanner(fr);  
            while(s.hasNext()){
                String w=s.nextLine();
             count++;
            }
            System.out.println("count is---"+count);
        } catch (FileNotFoundException ex) { 
            Logger.getLogger(BookClass.class.getName()).log(Level.SEVERE, null, ex);
        }
      return count;
}

    public void updateList(){
      SearchByNo(555);
    }
  
    public void deleteList(String p){
       try{
            // readFileInsideData();
             BookClass obj = new BookClass();
             int c=obj.coutLine();
             
             /*if (file.delete()) { 
            System.out.println("Deleted the folder: BookList.txt" + file.getName());
             } else {
            System.out.println("Failed to delete the folder: BookList.txt");
             } */
             
             // ISBN remove "-" simble and convert to long array
               
                String[] x =p.split("-"); // [ "978","65656565"]
                String isbn= x[0]+x[1];
                long ISBN = Long.parseLong(isbn);
            
             for(int h=index; h<=c; h++){
                 if(noArray[h] == ISBN)
                 {
                 index=h;
                 
             
            
               filetemp=new File("src/temp.txt");
               filetemp.createNewFile();
            
                c=c-1;//when we delete some item , so one index should remove
                temppriceArray =new double[c];
                temptitleArray=new String[c];
                tempauthorArray = new String[c];
                tempeditionArray = new String[c];
                tempnoArray = new long[c];
          
             //range=0 ->> index + index+1 ->> last increment   
            for(int k=0; k<index; k++){
                temppriceArray[k] = priceArray[k];
                temptitleArray[k] = authorArray[k];
                tempauthorArray[k] = titleArray[k];
                tempeditionArray[k] = editionArray[k];
                tempnoArray[k] = noArray[k];
               }
            
            for(int n=index; n<=c; n++){
                temppriceArray[n] = priceArray[n+1];
                temptitleArray[n] = titleArray[n+1];
                tempauthorArray[n] = authorArray[n+1];
                tempeditionArray[n] = editionArray[n+1];
                tempnoArray[n] = noArray[n+1];
               }
            
            //rewright the bookslisttext file
             fwx=new FileWriter(filename,true); //file write appending disable;
            //write data file inside
             for(int j=0; j<c; j++)
             {
               fwx.write( tempnoArray[j] + "," +  temptitleArray[j] +  "," +  tempauthorArray[j] +  "," +  tempeditionArray[j]  +  "," +'\n' );
               System.out.println(tempnoArray[j]);
             }
       
           fwx.close();// close the writing
           System.out.println("delete method all the data inside the file index-->  ");
       
           
            try {
            filetemp=new File("src/temp.txt");
            filetemp.createNewFile();
            //rewright the text file
             fwx=new FileWriter(filetemp,true); //file write appending disable;
            //write data file inside
             for(int j=0; j<c; j++)
             {
               fwx.write(tempnoArray[j] + "," +  temptitleArray[j]+  "," +  tempauthorArray[j] +  "," +  tempeditionArray[j] +  "," +'\n' );
               System.out.println("tempnoArray[j]");
             }
       
           fwx.close();// close the writing
         
           } catch (IOException ex) {
            Logger.getLogger(BookClass.class.getName()).log(Level.SEVERE, null, ex);
           }
           
          }else{
                    System.out.println("INVALID ISBN NUMBER OR CAN NOT FIND ISBN");
                 }
        } 
           
       }catch(IOException ex){
          Logger.getLogger(BookClass.class.getName()).log(Level.SEVERE, null, ex);
          System.out.println("error in delete() catch block"+ "/n" +ex);
       }
    }
    public void displayList(){
        
        try {
            filetemp=new File("src/temp.txt");
            filetemp.createNewFile();
            //rewright the text file
             fwx=new FileWriter(filetemp,true); //file write appending disable;
            //write data file inside
             for(int j=0; j<5; j++)
             {
               fwx.write(" tempnoArray[j]" + "," + " temptitleArray[j]" +  "," +  "tempauthorArray[j] "+  "," +  "tempeditionArray[j]"  +  "," +'\n' );
               System.out.println("tempnoArray[j]");
             }
       
           fwx.close();// close the writing
         
        } catch (IOException ex) {
            Logger.getLogger(BookClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    //preparing order
    public void sortAccendingOrderListUsingPrice(){
  
        
        int[] x={1,2,3,4,8,7};  
        System.out.println(Arrays.toString(x));
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
       
        String[] y = {"one", "two", "four"};
        System.out.println(Arrays.toString(y));
        Arrays.sort(y);
        System.out.println(Arrays.toString(y));
        
       
         
        
        Arrays.sort(priceArray);
      System.out.println(Arrays.toString(priceArray));
    } 
    public void sortdeccendingOrderListUsingPrice(){
       String[] y = {"one", "two", "four"};
       System.out.println(Arrays.toString(y));
        Arrays.sort(y, Comparator.reverseOrder());
        System.out.println(Arrays.toString(y));
    }
    
    public String[] commonSearchMethod(String name,String array[]){
      searcheddata = new String[3];
      
      readFileInsideData();
      
        for (String array1 : array) {
            if (array1.equals(name)) {
                searcheddata[0] = String.valueOf(45);
                searcheddata[1]=name;
                break;
            } else {
                index = 0;
                searcheddata[0] =String.valueOf(0);
                searcheddata[1]=null;
            }
        } 
        
        return  searcheddata;
    }
    public void SearchByNo(long num){
       int size = noArray.length;
        String[] str = new String[size];
        for(int i=0; i<size; i++) {str[i] = String.valueOf(noArray[i]);}
        
        String[] arrn = new String[3];
        arrn=commonSearchMethod(String.valueOf(num),str);
        System.out.println("SearchByno() work"+arrn[0]+arrn[1]);
    }
    public void SearchBytitle(String title){
        String[] arrt = new String[3];
        arrt=commonSearchMethod(title,titleArray);
         System.out.println("SearchBytitle() work"+arrt[0]+arrt[1]);
    }
    public void searchByedition(String edition){
        String[] arra=new String[3];
        arra=commonSearchMethod(edition,editionArray);
        System.out.println("SearchByedition() work"+arra[0]+arra[1]);
    }
    public void SearchByauthor(String author){
        String[] arra=new String[3];
        arra=commonSearchMethod(author,authorArray);
        System.out.println(arra[1]+"SearchByauthor() work"+arra[0]+""+arra[1]);
    }
    public void SearchByprice(double price){
        int size = priceArray.length;
        String[] str = new String[size];
        for(int i=0; i<size; i++) {str[i] = String.valueOf(priceArray[i]);}
        String[] arrp=new String[3];
        arrp=commonSearchMethod(String.valueOf(price),str);
        System.out.println("SearchByprice() work"+arrp[0]+""+arrp[1]);
    }
   
    public static void main(String[] args) throws Exception {
     
        System.out.println("--Runn main Method()--");
        BookClass obj = new BookClass();
       // obj.createList();
        obj.readFileInsideData();
        obj.sortAccendingOrderListUsingPrice();
        obj.deleteList("979-7878787825");
       // obj.displayList();
        // obj.SearchByauthor("Author");
        
        // obj.SearchBytitle("Title");
        //  obj.searchByedition("Edition");
        //  obj.SearchByprice(59.41);
        //  obj.SearchByNo(9799295055021L);
        //obj.deleteList(12);
     
    } 

}


