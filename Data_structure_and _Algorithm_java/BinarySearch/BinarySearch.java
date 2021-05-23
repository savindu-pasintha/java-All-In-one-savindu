
package BinarySearch;


// Java implementation of iterative Binary Search 
class BinarySearch { 
	// Returns index of x if it is present in arr[], 
	// else return -1 
	int binarySearch(int arr[], int x) 
	{                       
        //  first index      array size  value         
		int l = 0,         r = arr.length - 1; 
		while (l <= r) { 
                    
        //midle      array size value      
			int m = l + (r - l) / 2; 

			// Check if x is present at mid 
			if (arr[m] == x) 
				return m; 

			// If x greater, ignore left half 
			if (arr[m] < x) 
				l = m + 1; 

			// If x is smaller, ignore right half 
			else
				r = m - 1; 
		} 

		// if we reach here, then element was 
		// not present 
		return -1; 
	} 
        
        
        
        
        
        
     public  void  Bsearch(){
         int[] a={10,20,30,140,50,60,70,80,90,100,120,130,140,150};
         int firstindex,lastindex,midindex,arraysize,find,leftrange,rightrange;
         
         find=140;
         
         arraysize=a.length;
         firstindex=0;
         lastindex=arraysize-1;
         midindex=(firstindex+lastindex)/2;
         
         leftrange=midindex+1;
         rightrange=midindex+1;
         
        System.out.println("Firt index "+firstindex+" value= "+a[firstindex]);
        System.out.println("last index "+lastindex+"  value= "+a[lastindex]);
        System.out.println("mid index  "+midindex+"   value= "+a[midindex]);
        System.out.println("Array fullsize= "+arraysize );
        System.out.println("");     
        
        
        /*
         if(a[midindex] > find){  
             while(leftrange>0){
                if(a[leftrange]==find){
                System.out.println(find+"I FOUND IT IN left-range ARRAY INDEX--"+ leftrange--);
          
                } 
                 leftrange--;
             }
         }
        */
         /*
         if(a[midindex] < find){  
            while(rightrange>0){
                if(a[rightrange]==find){
                System.out.println(find+" I FOUND IT IN right-range ARRAY INDEX--"+ rightrange++);
                } 
                 rightrange++;
             }
         }
         */
         /*firstindex < midindex < lastindex values*/
         
         if(a[firstindex] ==find){System.out.println(find+"I FOUND IT IN ARRAY first INDEX--"+ firstindex);}
         if(a[lastindex ] ==find){System.out.println(find+"I FOUND IT IN ARRAY last INDEX--"+ lastindex);}  
         if(a[midindex  ] ==find){System.out.println(find+"I FOUND IT IN ARRAY mid INDEX--"+ leftrange);}
         
         if(a[firstindex] < find){}
         if(a[lastindex ] < find){} 
       
            //linear no-dublicates search
            for(int i=0; i<=arraysize; i++){
                if(a[i]==find){
                    int x=i+1;
                 a[i]=20;
                System.out.println(find+" I FOUND IT "+a[i]+" IN  ARRAY INDEX--"+ i +"-SIZE-"+x);
               // break;
                } 
             }
         
        /*
          //linear dublicates search
            for(int i=0; i<=arraysize; i++){
                if(a[i]==find){
                    int x=i+1;
                System.out.println(find+" I FOUND IT IN right-range ARRAY INDEX--"+ i +"-SIZE-"+x); 
                } 
             }
        */
         /*
         if(a[midindex] > find){  
             while(leftrange>0){
                if(a[leftrange]==find){
                System.out.println(find+"I FOUND IT IN left-range ARRAY INDEX--"+ leftrange--);
          
                } 
                 leftrange--;
             }
         }
        */
         /*
         if(a[midindex] < find){  
            while(rightrange>0){
                if(a[rightrange]==find){
                System.out.println(find+" I FOUND IT IN right-range ARRAY INDEX--"+ rightrange++);
                } 
                 rightrange++;
             }
         }
         */
         
         
         
        
     }   

	// Driver method to test above 
	public static void main(String args[]) 
	{ 
            new BinarySearch().Bsearch();
            
            /*
		BinarySearch ob = new BinarySearch(); 
		int arr[] = { 2, 3, 4, 10, 40 }; 
		int n = arr.length; 
		int x = 10; 
		int result = ob.binarySearch(arr, x); 
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at "
							+ "index " + result); 
           */
	} 
} 

