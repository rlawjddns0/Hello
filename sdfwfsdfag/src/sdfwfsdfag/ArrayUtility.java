package sdfwfsdfag;

public class ArrayUtility {
	
	
	static double[] intToDouble(int []source)
	{
	
		int len=source.length;
		double []dsource=new double[len];
		for(int i=0; i<len; i++)
			dsource[i]=source[i];
		
		return dsource;
		
	}
	static int[] doubleToInt(double []dsource)
	{
		
		int len=dsource.length;
		int []source=new int[len];
		for(int i=0; i<len; i++)
			source[i]=(int)dsource[i];
		
		return source;
	}

}
