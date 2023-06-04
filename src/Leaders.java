import java.util.ArrayList;
import java.util.List;

public class Leaders {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2, 3};
        leaderArray(arr);
    }

    static void leaders(int[] arr){
        boolean isLeader = false;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
               if (arr[i]>arr[j]){
                   isLeader=true;
                   continue;
               }
               else {
                   isLeader = false;
                   break;
               }
            }
            if (isLeader || arr.length-1 == i )
                System.out.println("leader in the array :"+arr[i]);
        }
    }

    static void leaderArray(int []arr){
        List<Integer> leaderList = new ArrayList<>();
        int maxSoFar = arr[arr.length - 1];
        leaderList.add(maxSoFar);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i]>maxSoFar){
                maxSoFar = arr[i];
                leaderList.add(maxSoFar);
            }
        }
        System.out.println(leaderList);
    }
}
