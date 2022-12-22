import java.util.Arrays;
class Solution {
    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.out.println(m + " " + n);
        int[] temp = new int[m+n];
        int k = 0;
        int j = 0;
        int i = 0;
        while(i < m) {
            temp[k] = nums1[i];
            System.out.println(temp[k] + " i " + nums1[i]);
            k++;
            i++;
        }
        while(j < n) {
            temp[k] = nums2[j];
            System.out.println(temp[k] + " " + nums2[j]);

            j++;
            k++;

        }

        Arrays.sort(temp);
        nums1 = temp;

    }
}