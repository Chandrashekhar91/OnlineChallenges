import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class CompressRange {
	
	public String Compress(String stArray[]){
		List<String> list = new ArrayList<String>();
		list = Arrays.asList(stArray);
		TreeSet<String> set = new TreeSet<String>(list);
		
		
		//Create new 
		int[] ArrVal = new int[set.size()];
		for(int i = 0 ; i < set.size()  ;i++ ){
			ArrVal[i] = Integer.parseInt(list.get(i));
		}
		
		int h =0;
		String str ="";
		for (int j = 0; j < ArrVal.length - 1; j++) {
			if (ArrVal[j + 1] - ArrVal[j] != 1) {
				if (ArrVal[h] == ArrVal[j]) {
					str = str + ArrVal[j] + ",";
					h = j + 1;
				} else {
					str = str + ArrVal[h] + "-" + ArrVal[j] + ",";
					h = j + 1;
				}
			}
			if (j == ArrVal.length - 2) {
				if (ArrVal[h] == ArrVal[j + 1]) {
					str = str + ArrVal[j + 1];
					h = j + 1;
				} else {
					str = str + ArrVal[h] + "-" + ArrVal[j + 1];
					h = j + 1;
				}
			}
		}

		return str;
		
	}
	
	private static Scanner s;

	public static void main(String args[])
	{
		System.out.println("Please insert the values in comma seperated format::");
		s = new Scanner(System.in);
		String str = s.nextLine();
		String stArray[] = str.split(",");
		CompressRange cr = new CompressRange();
		String result = cr.Compress(stArray);
		System.out.println("Range== " +result);
	}

}
