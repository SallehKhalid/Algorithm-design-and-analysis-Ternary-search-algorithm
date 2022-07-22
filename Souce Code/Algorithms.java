/*
Student 1 Abdulelah Alanzi (439015929)  
Student 2 Rayan almengash (439016742) 
Student 3 Saleh alsaeed (439016667)  
*/
import java.util.*;

public class Algorithms {
	// ---- Attributes ----
     public static List<Integer> mainList = new ArrayList<>();
     public static List<Integer> BinaryList = new ArrayList<>();
     public static List<Integer> TrenaryList = new ArrayList<>();
     public static  int [] binaryComparisonList = new int[20];
     public static  int [] ternaryComparisonList = new int[20];
     public static  int [] sequenceComparisonList = new int[20];
     public static int  binaryCount=0,tenaryCount=0,sequenceCount=0;

     // ---- Search Methods ----
       public static void generateRandomList(int size ){
         mainList = new ArrayList<>();
         BinaryList = new ArrayList<>();
         TrenaryList = new ArrayList<>();
    while (mainList.size() <size){
        int number = (int) ( 1+ Math.random() * (size+1));
        if (!mainList.contains(number))
        {
            mainList.add(number);
        }
    }
     
}

       public static int ternarySearch(int l, int r, int key, Integer [] ar)
      {     
        if (r >= l) {
 
            int middleOne = l + (r - l) / 3;
            int middleTwo = r - (r - l) / 3;
 
            if (ar[middleOne] == key) 
            {    tenaryCount++;
                return middleOne;
            }
            if (ar[middleTwo] == key) 
            {    tenaryCount++;
                return middleTwo;
            }

            if (key < ar[middleOne]) {
                 tenaryCount++;
                return ternarySearch(l, middleOne - 1, key, ar);
            }
            else if (key > ar[middleTwo]) {
                 tenaryCount++;
                return ternarySearch(middleTwo + 1, r, key, ar);
            }
            else {
 
               tenaryCount++;
                return ternarySearch(middleOne + 1, middleTwo - 1, key, ar);
            }
        }
        return -1;
    }

       public static int binarySearch(int l,int r, int key ,Integer arr[])
    { 
    	binaryCount++;

        if (r >= l && l < arr.length-1) { 
           
            int middle = l + (r - l) / 2;

            if (arr[middle] == key)
                return middle;
            if (arr[middle] > key)
                return binarySearch( l, middle - 1, key,arr);
            return binarySearch(middle + 1, r, key,arr);
        }
        return -1;
    }

       public static int sequenceSearch( int l, int r, int key,Integer arr[]) 
     {  
    	  sequenceCount++;
          if (r < l) 
             return -1; 
          if (arr[l] == key) 
             return l; 
          if (arr[r] == key) 
             return r; 
          return sequenceSearch( l+1, r-1, key,arr); 
     } 

     // ---- Operation and Calculation Methods ----
       public static void operationSize(int size)
       {
            generateRandomList(size);
            for(int i = 0 ; i < mainList.size() ; i++)
            {
            	BinaryList.add(mainList.get(i));
             TrenaryList.add(mainList.get(i));
            }

            Collections.sort(BinaryList);
            Collections.sort(TrenaryList);

   Integer[] binaryArray = BinaryList.toArray(new Integer[0]);
   Integer[] tenaryArray = TrenaryList.toArray(new Integer[0]);
   Integer[] sequenceArray = mainList.toArray(new Integer[0]);
             System.out.println("");
             System.out.println(">>> Print all Arrays <<<");
             System.out.println("");
        	 System.out.print("[Unsorted]");
             PrintenaryArray(sequenceArray);
             System.out.println("");
             System.out.print("[Sorted]");
             PrintenaryArray(tenaryArray);
             System.out.println("");  
             
//  Generate Random number and search for it
            int number;
            for(int i = 0 ; i < 20 ; i++)
            { 
            number = (int) (Math.random() * (size - 0+1 ) + 1);
   			tenaryCount = 0;
   			binaryCount = 0;
   			sequenceCount = 0;              
             
   			System.out.println(i+1 +"  - [TenarySearch] Searching for " + ternarySearch(0,tenaryArray.length-1,number,tenaryArray)+ " Comparisons = " + tenaryCount);
            System.out.println("   - [BinarySearch] Searching for " + binarySearch(0,binaryArray.length-1,number,binaryArray)+ " Comparisons = " + binaryCount);
            System.out.println("   - [SequenceSearch] Searching for " + sequenceSearch(0,tenaryArray.length-1,number,sequenceArray)+ " Number of comparison = " + sequenceCount);
               
            ternaryComparisonList[i]=tenaryCount;
            binaryComparisonList[i]=binaryCount;
            sequenceComparisonList[i]=sequenceCount;
               
            }
       }

       public static int Maximum(int []arr)
       {int max = arr[0];
        for(int i = 1 ; i < arr.length ; i++)
                    if(max<arr[i])
                          max=arr[i];
        return max;
        }

       public static int Minimum(int []arr)
       {int min = arr[0];
                for(int i = 1 ; i < arr.length ; i++)
                    if(min>arr[i])
                          min=arr[i];
               return min;
        } 

       public static int Average(int []arr)
       {int sum = 0;
        for(int i = 1 ; i < arr.length ; i++)
                    sum+=arr[i];
                int  avg=sum/arr.length;
        
        return avg;
        }

       // ---- Print ----
       public static void PrintenaryArray(Integer [] arr)
       {
        for(int i = 0 ; i < arr.length ; i++)
                 {   
        			if(i%10 == 0)
                     System.out.println("");
                     System.out.print(arr[i]+" ");
                 
                 }
       
       }

}