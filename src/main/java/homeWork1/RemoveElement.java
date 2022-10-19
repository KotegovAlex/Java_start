package homeWork1;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] a = {0,1,2,2,3,0,4,2};
        int val = 2;
        removeElement(a, val);
    }

    public static void removeElement(int[] nums, int val) {
        int k = 0;
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        while (l-- > k) {
            nums[l] = 0;
        }
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }
}
