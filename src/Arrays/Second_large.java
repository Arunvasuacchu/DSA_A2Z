package Arrays;

public class Second_large {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int second_large = second_largest(arr);
        System.out.println(second_large);

    }
    static int second_largest(int[] arr) {
        int max = arr[0];
        for(int num : arr) {
            if(num > max) {
                max = num;
            }
        }
        int second_large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != max && arr[i] > second_large) {
                second_large = arr[i];
            }

        }
        if(second_large == Integer.MIN_VALUE) {
            return -1;
        } else {
            return second_large;
        }
    }

}
