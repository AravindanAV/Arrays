import java.util.ArrayList;
import java.util.List;

public class ZeroShiifter {
    public static void main(String[] args) {
        int[] arrs = {2,4,0,9,3,5,0,8,0,6,0};
        pushZerosToEnd(arrs,arrs.length);
        for (Integer in:arrs) {
            System.out.print(in);
        }
        List<Integer> aa=new ArrayList<>();
        List<Integer> bb=new ArrayList<>();
        for (Integer arr: arrs) {
            if(arr != 0){
                aa.add(arr);
            }else {
                bb.add(arr);
            }
        }
        aa.addAll(bb);
       // System.out.println("anitha" + aa);
    }

    static void pushZerosToEnd(int arr[], int n)
    {
        int count = 0;  // Count of non-zero elements

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is
        // incremented

        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < n)
            arr[count++] = 0;
    }
}
