import java.lang.classfile.components.ClassPrinter.Node;

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
        else if (index == 0) {
            addFirst(input);
        } else {
            Node24 temp = head;
            for (int i = 0; i < index -1; i++) {
                temp = temp.next;
            }
            temp.next = new Node24(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    public int getData (int index) {
        Node24 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int indexOf (int key) {
        Node24 tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    void removeFirst() {
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
        } else {
            System.out.println("Linked List masih kosong, tidak dapat dihapus.");
        }
    }

    void removeLast() {
        if (!isEmpty()) {
          if (head == tail) {
            head = tail = null;
          } else {
            Node24 temp = head;
            while (temp.next == null) {
              temp = temp.next;
            }
            temp.next = null;
            tail = temp.next;
          }
        } else {
          System.out.println("Linked List masih kosong, tidak dapat dihapus.");
        }
      }

      void remove (int key) {
        if (!isEmpty()) {
            Node24 temp = head;

            if (temp.data == key) {
                removeFirst();
                return;
            }
            while (temp != null && temp.next != null) {
                if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Elemen tidak ditemukan.");
            }
        } else {
            System.out.println("Linked List masih kosong, tidak dapat dihapus.");
        }
      }

    public void removeAt (int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node24 temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
