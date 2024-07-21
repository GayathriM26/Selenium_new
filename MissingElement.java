package Week1.day1;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input_array = {1,4,3,2,8,6,7};

		Arrays.sort(input_array);
		int missingNumber = 1;
		for (int index = 0; index < input_array.length; index++) {
			if(input_array[index]!=index+1)
			{
				missingNumber=index+1;
				System.out.println("The missing Number is : "+missingNumber);
				break;
			}
	}

}
}