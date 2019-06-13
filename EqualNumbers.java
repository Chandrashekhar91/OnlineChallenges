// Java implementation of above approach 
class EqualNumbers 
{ 

	// Function that returns true if all 
	// the array elements can be made equal 
	// with the given operation 
	static boolean EqualNumbers(int a[], int n) 
	{ 
		for (int i = 0; i < n; i++) 
		{ 

			// Divide number by 2 
			while (a[i] % 2 == 0) 
			{ 
				a[i] /= 2; 
			} 

			// Divide number by 3 
			while (a[i] % 3 == 0) 
			{ 
				a[i] /= 3; 
			} 
		} 

		// Remaining numbers 
		for (int i = 1; i < n; i++) 
		{ 
			if (a[i] != a[0]) 
			{ 
				return false; 
			} 
		} 

		return true; 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		int a[] = {0,50, 75, 150 , 1200}; 

		int n = a.length; 

		if (EqualNumbers(a, n)) 
		{ 
			System.out.println("Yes"); 
		} 
		else
		{ 
			System.out.println("No"); 
		} 
	} 
} 
