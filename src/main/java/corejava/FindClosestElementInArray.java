package corejava;

public class FindClosestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 7, 6, 3, 9 };

		// Arrays.sort(arr);
		int target = 6;

		System.out.println("close to " + target + "--> " + findClosest(arr, target));
	}

	public static int findClosest(int[] input, int target) {

		if (input[0] == target)
			return target;

		int i = 0;
		int j = input.length;

		while (i < j) {
			int mid = (i + j) / 2;

			if (input[mid] == target)
				return target;

			if (target < input[mid]) {
				if (target > input[mid - 1]) {
					return getClosest(input[mid - 1], input[mid], target);
				}
				j = mid;
			} else if (target > input[mid]) {
				if (target < input[mid + 1]) {
					return getClosest(input[mid], input[mid + 1], target);
				}
				i = mid + 1;
			}
		}
		return 0;

	}

	public static int getClosest(int value1, int value2, int target) {
		if (target - value1 >= value2 - target) {
			return value2;
		} else {
			return value1;
		}
	}

}
