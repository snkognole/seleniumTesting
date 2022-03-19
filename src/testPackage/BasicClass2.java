package testPackage;

import org.testng.annotations.Test;

public class BasicClass2 {
	
	@Test
	
	public void test1()
	{ System.out.println("shubham");
	int j=5;
	for (int i =0;i<5;i++) 
	{   
		System.out.println("i:"+i);
		for(j=5-j ;j>i;j--)
		{
			System.out.println("j:"+j);
		}
	}
	
	}
}
