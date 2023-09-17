import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.xml.bind.ValidationException;

public class QueueUsingLinkedList {
    private class QueueNode {
        private int val;
        private QueueNode next;

        QueueNode(int item) {
            this.val = item;
        }
    }

    private QueueNode first, last;

    private int maxSize = 5;
    private int currSize;

    public void add(int item) throws ValidationException {
        if (isFull()) {
            throw new ValidationException("Queue is full");
        }
        QueueNode node = new QueueNode(item);
        if (last != null) {
            last.next = node;
        }
        last = node;
        if (first == null) {
            first = last;
        }
        currSize++;
    }

    public int remove() {
        if (first == null) {
            throw new NoSuchElementException("stack is empty");
        }
        int ans = first.val;
        first = first.next;
        if (first == null) {
            last = null;
        }
        currSize--;
        return ans;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public boolean isFull() {
        return currSize == maxSize;
    }

    public int peek() {
        if (first == null) {
            throw new NoSuchElementException("stack is empty");
        }
        return first.val;
    }
}

class Main {
    public static void main(String[] args) throws ValidationException {
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        QueueUsingLinkedList queueUsingLinkedList = new QueueUsingLinkedList();
        queueUsingLinkedList.add(item);
        int item1 = sc.nextInt();
        queueUsingLinkedList.add(item1);
        int remove = queueUsingLinkedList.remove();
        System.out.println(remove);
        int peek = queueUsingLinkedList.peek();
        System.out.println(peek);
        int remove1 = queueUsingLinkedList.remove();
        System.out.println(remove1);
        int item2 = sc.nextInt();
        queueUsingLinkedList.add(item2);
        int remove2 = queueUsingLinkedList.remove();
        System.out.println(remove2);

    }
}
