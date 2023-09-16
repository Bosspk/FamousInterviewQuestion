import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(i, sc.nextInt());
        }
        int index = removeDuplicates(arr);
        for (int i = 0; i <= index; i++) {
            System.out.println(arr.get(i));
        }
    }

    private static int removeDuplicates(List<Integer> arr) {
        int slow = 0, fast = 1;
        for (; fast < arr.size(); fast++) {
            if (arr.get(fast) != arr.get(slow)) {
                ++slow;
                arr.set(slow, arr.get(fast));
            }
        }
        return slow;
    }
}
