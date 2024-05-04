package Arrays;

public class LargestNum {
    public static void main(String[] args) {
        int [] arr = {2,4,8,10};
        int largest_num = max(arr);
        System.out.println(largest_num);

    }
    static int max(int[] arr) {

        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
