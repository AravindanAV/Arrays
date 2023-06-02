import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;

public class Last3HighPriorityQueue {

        public static void main(String[] args) {
            int[] arr = {2, 44, 22, 55, 66, 1, 5, 8, 88, 99, 64, 3, 4, 100, 88, 89};
            Integer[] largest = findThreeLargestUsingSet(arr);
            System.out.println(Arrays.toString(largest));
        }

        static int[] findThreeLargest(int[] arr) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for (int val : arr) {
                minHeap.offer(val);

                if (minHeap.size() > 3) {
                    minHeap.poll();
                }
            }

            int[] largest = new int[3];
            int i = 2;

            while (!minHeap.isEmpty()) {
                largest[i] = minHeap.poll();
                i--;
            }

            return largest;
        }

    static Integer[] findThreeLargestUsingSet(int[] arr) {
        SortedSet<Integer> sortedSet=new TreeSet<>();
        for (int val :arr) {
            sortedSet.add(val);
            if (sortedSet.size()>3){
                sortedSet.remove(sortedSet.first());
            }
        }
        return sortedSet.toArray(new Integer[0]);
    }

}
