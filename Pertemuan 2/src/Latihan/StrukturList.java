package Latihan;

public class StrukturList {
    private Node head;
    private Node curNode;
    private Node posNode;

    // Method isEmpty() digunakan untuk memeriksa apakah list kosong atau tidak.
    public boolean isEmpty() {
        return head == null;
    }

    // Method addHead(int data) digunakan untuk menambahkan elemen baru di awal list.
    public void addHead(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

   // Method addMid(int data, int position) digunakan untuk menambahkan elemen baru pada posisi tertentu dalam list.
    public void addMid(int data, int position) {
        Node posNode = head;
        Node curNode;
        int i;

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            curNode = head;
            if (position == 1) {
                newNode.setNext(head);
                head = newNode;
            } else {
                i = 1;
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            }
        }
    }

    // Method addTail(int data) digunakan untuk menambahkan elemen baru di akhir list.
    public void addTail(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        } else {
            curNode = head;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
        }
        posNode.setNext(newNode);
    }

    // Method displayElement() digunakan untuk menampilkan seluruh elemen dalam list
    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List Kosong");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }
}