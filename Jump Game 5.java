import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        boolean canReachEnd = canJump(nums);
        System.out.println(canReachEnd);
    }

    public static boolean canJump(int[] nums) {
        int maxPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxPos) {
                return false;
            }
            maxPos = Math.max(maxPos, i + nums[i]);
            if (maxPos >= nums.length - 1) {
                return true;
            }
        }
        return true;
    }
}
