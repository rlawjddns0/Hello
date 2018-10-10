package sdfwfsdfag;

public class ArrayUtilityEx {
	public static void main(String args[])
	{
		int []source={1,2,3,4,5};
		double[] dsource= {1.1,2.2,3.3,4.4,5.5};
				
		int[] newd=ArrayUtility.doubleToInt(dsource);
		double[] newi=ArrayUtility.intToDouble(source);
		
		for(int i=0; i<5; i++)
			System.out.println(newd[i]);

		for(int i=0; i<5; i++)
			System.out.println(newi[i]);		
		
		
		
	}

}
