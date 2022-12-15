public class Solution {
    public static void main(String[] args){
        int[] nums1 = {1,2,3};
        int[] nums2 = {7,8,9};
        System.out.println("aAAAAA");
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length = nums1.length + nums2.length;

        int[] temp = new int[length];
        for (int i = 0; i < nums1.length; i++) {
            temp[i] = nums1[i];
        }   
        for(int i = 0; i < nums2.length; i++){
            temp[nums1.length-1 + i] = nums2[i];
        }


        sort(temp);

        length = temp.length;
        for(int i = 0; i < temp.length; i++){
            System.out.println(temp[i]);
        }
        if (temp.length % 2 == 0) {
            return (temp[(int) Math.floor(length / 2)]) + (temp[(int) Math.round(length / 2)]) / 2;
        }

        return temp[temp.length / 2 ];
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
    }
}