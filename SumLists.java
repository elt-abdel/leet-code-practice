import java.util.ArrayList;
import java.util.Arrays;

import CtCILibrary.LinkedListNode;

public class SumLists {
    public static void main(String[] args) {

        int[] firstArr = {6,1,7};

        System.out.println(Arrays.toString(firstArr));

        int sum = 0;
        for (int i = 0; i < firstArr.length; i++) {
            // to continue power Math.pow(a,b)
        }



    }

    public static LinkedListNode sum(LinkedListNode first, LinkedListNode second) {
        // 6 1 7 +      length = x;     2   sum = 6 * 10 ^ 2 + 1 * 10 ^ 1 + 7 * 10 ^ 0
        // 2 9 5
        // 9 1 2

        ArrayList<Integer> firstArr = new ArrayList<>();
        ArrayList<Integer> secondArr = new ArrayList<>();

        LinkedListNode current = first;

        // fill the arrays
        while (current != null) {
            firstArr.add(current.data);
            current = current.next;
        }
        current = second;

        // fill the arrays
        while (current != null) {
            secondArr.add(current.data);
            current = current.next;
        }

        LinkedListNode head = first;

        return head;
    }
}
