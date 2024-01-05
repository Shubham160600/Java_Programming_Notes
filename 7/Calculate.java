/* Method overloading by changing data type of Arguments. */

package shubham;

class Calculate { 
	void sum (int a, int b) { 
		System.out.println("Sum is "+(a+b)) ; 
	} 
	void sum (float a, float b) { 
		System.out.println("Sum is "+(a+b)); 
	} 
	public static void main (String[] args) { 
		Calculate cal = new Calculate(); 
		cal.sum (8,5); //sum(int a, int b) is method is called. 
		cal.sum (4.6f, 3.8f); //sum(float a, float b) is called. 
	} 
}

