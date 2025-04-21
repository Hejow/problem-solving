class Solution {
	public boolean isHappy(int n) {
		var set = new HashSet<Integer>();

		while (n != 1) {
			if (!set.add(n)) {
				return false;
			}

			n = calculate(n);
		}

		return true;
	}

	private int calculate(int n) {
		var sum = 0;
		var current = n;

		while (current != 0) {
			var remain = current % 10;

			current /= 10;
			sum += Math.pow(remain, 2);
		}

		return sum;
	}
}
