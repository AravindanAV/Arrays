public class Last3High {
    public static void main(String[] args) {
        int []arr = {2,44,22,55,66,1,5,8,88,92,64,3,4,110,105,98,102,88,89};
        findThreeLargest(arr);
    }

    static void findThreeLargest(int[] arr){

        int high1,high2,high3,temp ;
        high1=high2=high3=Integer.MIN_VALUE;
        for (Integer val : arr) {
            if (val>high1){
                high3=high2;
                high2= high1;
                high1 = val;
            } else if (val > high2) {
                high3=high2;
                high2=val;
            } else if (val > high3) {
                high3 = val;
            }

        }
        System.out.println(high1);
        System.out.println(high2);
        System.out.println(high3);

    }
}
