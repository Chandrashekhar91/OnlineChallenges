
public class Divide_Conquer {

	public static void main(String[] args) {
		System.out.println(" Calculated Value - " +Cal_Value (16 , 3 , 10));

	}
	public static int Cal_Value(int i , int j , int k){
		int ret = 0;
		int temp = i / 5 ; //Max value is 5
		
		if ( temp > j){
			ret = j + ( i - k);
		} else {
			ret = temp +(i-k);
		}
		
		return ret;
		
	}

}
