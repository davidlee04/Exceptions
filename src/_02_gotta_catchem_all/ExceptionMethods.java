package _02_gotta_catchem_all;

public class ExceptionMethods extends Exception{
	public double divide (double i, double j) throws IllegalArgumentException{
		if(j == 0.0) {
			throw new IllegalArgumentException();
		}
		double quotient = (i/j);
		return quotient;
	}
	
	
	public String reverseString (String a) throws IllegalStateException{
		if (a.equals("")	) {
			throw new IllegalStateException();
		}
		String str = "";
		char charArray[] = a.toCharArray();
		for (int i = charArray.length-1; i >= 0; i--) {
			str+= charArray[i];
		}
		return str;
		
	}
}
