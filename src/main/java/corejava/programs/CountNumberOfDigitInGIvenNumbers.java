package corejava.programs;

public class CountNumberOfDigitInGIvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123445454, count = 0;

		while (number % 10 > 0) {
		//	System.out.println(number);
			number = number / 10;
			count++;
		}

		System.out.println("No of digit in 123445454 --> " + count);

	}

}
