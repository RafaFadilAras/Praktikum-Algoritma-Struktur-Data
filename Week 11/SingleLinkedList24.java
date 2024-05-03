public class SingleLinkedList24 {
    Node24 head, tail;

    boolean isEmpty () {
        return head == null;
    }
    
    void print () {
        if (!isEmpty()) {
            Node24 tmp = head;
            System.out.print("Isi Linked List : ");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        } 
    } 

    void addFirst(int input) {
        Node24 ndInput = new Node24(input, head);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
        }
    }

    void addLast (int input) {
        Node24 ndInput = new Node24(input, null);
        if (isEmpty()) {
            head = ndInput;
        } else {
            tail.next = ndInput;
        }
        tail = ndInput;
    }

    void insertAfter (int key, int input) {
        Node24 ndInput = new Node24(input, null);
        Node24 temp = head;
        while (temp != null) {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next != null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt (int index, int input) {
        if (index < 0) {
            System.out.println("Perbaiki logikanya! indeks tidak boleh negatif.");
            return;
        } 
        if (index == 0) {
            addFirst(input);
        } else {
            Node24 temp = head;
            for (int i = 0; i < index && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                addLast(input);
            } else {
                temp.next = new Node24(input, temp.next);
            }
            
        }
    }
}
