public class Main {

  public static void main(String[] args) {
    int[] nums1 = {2, 1, 2, 3, 4};
    int[] nums2 = {2, 2, 0};
    int[] nums3 = {1, 3, 5};
    System.out.println(countEvens(nums1));
    System.out.println(countEvens(nums2));
    System.out.println(countEvens(nums3));
  }

  public static int countEvens(int[] nums) {
    int count = 0;
    for (int num : nums) {
      if (num % 2 == 0) {
        count++;
      }
    }
    return count;

  }

}
