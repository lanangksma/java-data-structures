package Latihan;

public class StrukturListMHS {
    private Node head;

    private Node curNode;
    private Node posNode;

    public boolean isEmpty() {
        return head == null;
    }

    public void addHead(Mahasiswa data) {
        curNode = null;
        posNode = null;

        Node newNode = new Node(data);

        if (!isEmpty()) {
            newNode.setNext(head);
        }
        head = newNode;
    }

    public void addTail(Mahasiswa data) {
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

    public boolean find(int x){
        Node curNode = head;
        boolean found = false;

        while (curNode != null && !found){
            if (curNode.getData().equals(x)){
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

    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List Kosong");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.println(curNode.getData().getNamaMhs() + " " + curNode.getData().getNrpMhs());
            curNode = curNode.getNext();
        }
    }

    public void dispose(Node temp){
        temp.setNext(null);
        temp = null;
    }
}
