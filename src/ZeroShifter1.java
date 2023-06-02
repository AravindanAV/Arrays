// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ZeroShifter1 {
    public static void main(String[] args) {
      int[] arr = {2,4,0,9,3,5,0,8,0,6,0,4,0,8,0,0};
      int zeroIndex = findNonZero(arr);;
      int temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                if (i-1==zeroIndex)
                    break;
                temp=arr[zeroIndex];
                arr[zeroIndex]= arr[i];
                arr[i]= temp;
                zeroIndex = findNonZero(arr);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    static int findNonZero(int[] arr){
        for (int i = arr.length-1; i >0; i--) {
            if (arr[i]!=0){
                return i;
            }
        }
        return 0;
    }
}