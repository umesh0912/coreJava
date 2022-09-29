package corejava.programs;

public class ShiftingGivenNumberInArrayAtTheEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 0, 1, 25, 9, 0, 1, 2, 0, 3 };
		int temp;
		int num = 1;
		int counter = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != num) {
				temp = arr[counter];
				arr[counter] = arr[i];
				arr[i] = temp;
				counter = counter + 1;

			}

		}
		System.out.println("");

		// Arrays.sort(arr);

		System.out.println("");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

	}

}

/**
   Output
  i/p:  10 0 1 25 9 0 1 2 0 3

  o/p:	10 0 25 9 0 2 0 3 1 1
 	
*/ 	
