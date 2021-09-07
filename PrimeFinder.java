public class PrimeFinder {

	public static void main(String[] args) {
		
		int i =0;
	    int num =0;
	     System.out.println("Prime numbers from 1 to 100:")

	       for (num = 1; num <= 100; num++)         
	       { 		  	  
	          int count=0; 	  
	          for(i =num; i>=1; i--)
	          {
	             if(num%i==0)
	             {
	            	 count = count + 1;
		         }
	          }
	          
		     if (count==2)
		     {
		    	 System.out.println(num);
		     }
		     		
	        }	
	      
	}

}
