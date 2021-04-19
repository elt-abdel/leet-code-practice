import java.util.HashSet;
import CtCILibrary.LinkedListNode;
import CtCILibrary.AssortedMethods;

public class RemoveDups {
    public static void main(String[] args) {
        LinkedListNode first = AssortedMethods.randomLinkedList(10, 0, 10);
		LinkedListNode head = first;
		System.out.println(head.printForward());
		deleteDups(head);
		System.out.println(head.printForward());
    }

    public static void deleteDups(LinkedListNode n) {
        HashSet<Integer> set = new HashSet<>();
        LinkedListNode previous = null;
        while (n != null) {
            if (set.contains(n.data)) {
                previous.next = n.next;
            } else {
                set.add(n.data);
                previous = n;
            }
            n = n.next;
        }

    }
}
