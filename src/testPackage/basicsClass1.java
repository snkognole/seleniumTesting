package testPackage;


public class basicsClass1 {
	
	
	public static void main(String[] args) {
	 
		
		String a = "utkarsh";
		
		System.out.println(a.substring(0,1));
		
		
		
	String name = "shubham neminath kognole";
	
	String word[]=name.split(" ");
	String rev = "";
	String revs = "";
	for( int i = 0; i<= word.length-1; i++)
	{
		char[] a1 = word[i].toCharArray();
;		 for(int j = a1.length-1; j >=0; j-- )
		 {
			 
			rev=rev+a1[j];
			
		 }
		rev=rev+" ";

		
		 revs= rev+" ";
		
		
	}
	
	System.out.println(revs);
} 
}

