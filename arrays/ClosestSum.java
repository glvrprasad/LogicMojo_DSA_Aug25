package mojo;

public class ClosestSum {

	public static void main(final String[] args) {
		final int arr[] = {6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
		final int x = 0;
		closestSum(arr, x);

	}

	private static int closestSum(final int[] arr, final int x) {
		// TODO Auto-generated method stub

		int l = 0;
		int r = arr.length - 1;
		int closestSum = Integer.MAX_VALUE;

		while (l < r) {
			final int currMax = arr[l] + arr[r];

			if (Math.abs(closestSum) < Math.abs(currMax)) {
				closestSum = currMax;
			}
			if (closestSum == 0) {
				return 0;
			} else if (closestSum < 0) {
				l++;
			} else {
				r--;
			}

		}

		return closestSum;

	}
}
