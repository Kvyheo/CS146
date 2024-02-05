import java.util.HashMap;

public class TwoSum {
  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();

  for (int i = 0; i < nums.length(); i++) {
      int complement = target - nums[i];
    // Check if complement exists 
    if (map.containsKey(a)) {
        return new int[]{map.get(a),i};
      }
    // if not add cur element and its index to map
    map.put(nums[i], i);
  }
    //No solution found
  throw new IllegalArgumentException("No two sum solution");
  }

public static void main(String[] args) {
  int[] nums = {3,5,10,14};
  int target = 8;
  int[] result = twoSum(nums,target);
  System.out.println("Indices: " + result[0] + ", " + result[1]);
}
