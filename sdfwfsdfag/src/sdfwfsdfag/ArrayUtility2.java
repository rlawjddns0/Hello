package sdfwfsdfag;

public class ArrayUtility2 {

	static int [] concat(int []s1, int []s2)
	{
		int s1len=s1.length;
		int s2len=s2.length;
		
		int []s3=new int[s1len+s2len];
		
		for(int i=0; i<s1len; i++)
			s3[i]=s1[i];
		for(int i=s1len; i<s1len+s2len; i++)
			s3[i]=s1[i];
		
		return s3;
		
	}
	
	static int []remove(int []s1, int []s2)
	{
		
		
		
	}
}
