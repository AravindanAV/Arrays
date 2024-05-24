package Arrayzz.src;

import java.util.Arrays;

public class ArrangeGreaterEven {

    public static void main(String[] args) {
        int []arr = {4,1,5,2,1,6,9,8,0,7,4};
        rearrangeGreaterEven(arr);
    }

    static void rearrangeGreaterEven(int []arr){
        int j = 0;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            j=i+1;
            if (arr[i]>arr[j] && i< arr.length) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i = j++;
        }
        System.out.println(Arrays.toString(arr));

    }

}
