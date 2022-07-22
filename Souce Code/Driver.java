/*
Student 1 Abdulelah Alanzi (439015929)  
Student 2 Rayan almengash (439016742) 
Student 3 Saleh alsaeed (439016667)  
*/
public class Driver {
    public static void main(String[] args) 
    {
    	for(int i = 100 ; i <= 1000 ; i+=100) {    		
    		System.out.println("");
    		System.out.println("---- When N = "+i+" ----");
    		Algorithms.operationSize(i);
                    
       int bestTenary = Algorithms.Minimum( Algorithms.ternaryComparisonList);
       int AverageTenary = Algorithms.Average( Algorithms.ternaryComparisonList);
       int worstTenary= Algorithms.Maximum( Algorithms.ternaryComparisonList);
        
       int bestBinary = Algorithms.Minimum( Algorithms.binaryComparisonList);
       int AverageBinary = Algorithms.Average( Algorithms.binaryComparisonList);
       int worstBinary = Algorithms.Maximum( Algorithms.binaryComparisonList);

       int bestSequence = Algorithms.Minimum( Algorithms.sequenceComparisonList);
       int AverageSequence = Algorithms.Average( Algorithms.sequenceComparisonList);
       int worstSequence = Algorithms.Maximum(Algorithms.sequenceComparisonList);
      
       // --- Prints number of comparisons in each case ---
        System.out.println("[Best case] Tenary is "+ bestTenary+ " , Binary is "+ bestBinary +" , Sequence is "+ bestSequence);  
        System.out.println("[Average case] Tenary is "+ AverageTenary+ " , Binary is "+ AverageBinary +" , Sequence is "+ AverageSequence);  
        System.out.println("[Worst case] Tenary is "+ worstTenary+ " , Binary is "+ worstBinary +" , Sequence is "+ worstSequence);   
    
    	} 
    }
    
}

