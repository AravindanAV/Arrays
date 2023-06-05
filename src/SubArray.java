public class SubArray {
    //Find Subarray with given sum = 7
    public static void main(String[] args) {
        int arr[]={1,2,0,0,5,2,6,8,3,2};
        findSubArray(arr,7);
    }

    static void findSubArray(int []arr,int sum){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                total=total+arr[j];
                if (total==sum){
                    System.out.println("sub array index "+i+" , "+ j);
                }
            }
            total = 0;
        }

    }

}
