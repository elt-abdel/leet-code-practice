import CtCILibrary.LinkedListNode;

public class Partion {
    public static void main(String[] args) {
		/* Create linked list */
		int[] vals = {3,5,8,5,10,2,1};
		LinkedListNode head = new LinkedListNode(vals[0], null, null);
		LinkedListNode current = head;
		for (int i = 1; i < vals.length; i++) {
			current = new LinkedListNode(vals[i], null, current);
		}
		System.out.println(head.printForward());
		
		LinkedListNode h = partition(head, 5);
		System.out.println(h.printForward());
    }

    public static LinkedListNode partition(LinkedListNode node, int x) {
        
        LinkedListNode head = node;
        LinkedListNode tail = node;

        // partion list
        while (node != null) {
            LinkedListNode next = node.next;
            if (node.data < x) {
                // insert node at head
                node.next = head;
                head = node;
            } else {
                // insert node at tail
                tail.next = node;
                tail = node;
            }
        node = next;
        }
        tail.next = null;
        
        return head;
    }
}
