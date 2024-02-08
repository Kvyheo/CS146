public class findBadVersion {
	public static int firstBadVersion(int n) {
		int left = 1;
		int right = n;
		
		while (left < right) {
			int mid = left + (right - left)/2;
			if (isBadVersion(mid)) {
				right = mid;
			} else {
				left = mid +1; 
			}
		}
		return left;
	}
    public static void main(String[] args) {
        // Test your function with sample inputs
        int n = 10;
        System.out.println("First bad version is: "+ firstBadVersion(n));
    }
}
