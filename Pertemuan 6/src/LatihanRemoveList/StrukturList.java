package LatihanRemoveList;

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

    public void addMany(int[] data){
        for (int datum : data) {
            addTail(datum);
        }
    }

    // Method removeHead()
    public void removeHead(){
        if (head != null){
            Node temp = head;
            head = head.getNext();
            dispose(temp);
        } else {
            System.out.println("List Kosong");
        }
    }

    // Method removeTail()
    public void removeTail(){
        Node preNode = null;
        Node lastNode = null;

        if (head != null){
            if (head.getNext() == null){
                head = null;
            }else {
                lastNode = head;
                while (lastNode.getNext()!=null){
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }
            }
            preNode.setNext(null);
            dispose(lastNode);
        }
    }

    // Method removeMid()
    public int size(){
        Node curNode = head;
        int sum = 0;

        while (curNode != null){
            sum+=1;
            curNode = curNode.getNext();
        }
        System.out.println("\nUkuran List: "+sum);
        return sum;
    }

    public void removeMid(int position) {
        Node posNode = null;
        Node delNode = null;

        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            if (position == 1) {
                removeHead();
            } else {
                posNode = head;
                delNode = head.getNext();
                int i = 2;
                while (delNode != null && i < position) {
                    posNode = delNode;
                    delNode = delNode.getNext();
                    i++;
                }
                if (delNode != null) {
                    posNode.setNext(delNode.getNext());
                    dispose(delNode);
                } else {
                    System.out.println("Posisi Tidak Ditemukan");
                }
            }
        }
    }

    public void removeAll() {
        Node curNode = head;

        while (curNode != null) {
            Node nextNode = curNode.getNext();
            dispose(curNode);
            curNode = nextNode;
        }
        System.out.println("\n RemoveAll... ");
        head = null;
    }

    public boolean find(int x){
        Node curNode = head;
        boolean found = false;

        while (curNode != null && !found){
            if (curNode.getData() == x){
                found = true;
            } else {
                curNode = curNode.getNext();
            }
        }

        if (found){
            System.out.println("\n"+x+" Ditemukan dalam list");
        } else {
            System.out.println("\n"+x+" Tidak Ditemukan dalam list");
        }

        return found;
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

    public void dispose(Node temp){
        temp.setNext(null);
        temp = null;
    }
}