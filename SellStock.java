import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(i, sc.nextInt());
        }
        sc.nextLine();
        int k = sc.nextInt();
        rotateArray(arr, k);
    }

    private static void rotateArray(List<Integer> arr, int k) {
        int n = arr.size();
        k = k % n;
        Collections.reverse(arr);
        reverseSubList(arr, 0, k - 1);
        reverseSubList(arr, k, n - 1);
        for(int a:arr){
            System.out.println(a);
        }
    }

    private static void reverseSubList(List<Integer> nums, int start, int end) {
        while (start < end) {
            Collections.swap(nums, start, end);
            start++;
            end--;
        }
    }
}
