import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.println("Please enter the number::");
		String strCurr = c.next();
		StringBuilder stringBuilder = new StringBuilder();
	    char amountArray[] = strCurr.toCharArray();
	    int a = 0, b = 0;
	    for (int i = amountArray.length - 1; i >= 0; i--) {
	        if (a < 3) {
	            stringBuilder.append(amountArray[i]);
	            a++;
	        } else if (b < 2) {
	            if (b == 0) {
	                stringBuilder.append(",");
	                stringBuilder.append(amountArray[i]);
	                b++;
	            } else {
	                stringBuilder.append(amountArray[i]);
	                b = 0;
	            }
	        }
	    }

	    System.out.println("Indian Rupees Format::" +stringBuilder.reverse());

	}
}