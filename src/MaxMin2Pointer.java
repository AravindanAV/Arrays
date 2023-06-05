import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxMin2Pointer {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7,8,9};
        reArrange(arr);
    }

    //works only on even numbers
    static void rearrangeMaxMin (int[] arr){
        int small = 0;
        int big = arr.length-1;
        for (int i = 0; i < arr.length/2 ; i++) {
            System.out.print(arr[big--]);
            System.out.print(" , ");
            System.out.print(arr[small++]);
            System.out.print(" , ");
        }
    }

    static void reArrange(int[] arr){
        boolean flag= true;
        int []temp= Arrays.copyOf(arr,arr.length);
        int small=0,large=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            temp[i]=flag?arr[large--]:arr[small++];

            flag=!flag;
        }
        System.out.println(Arrays.toString(temp));
    }
}
