package Latihan;

public class StrukturListMatkul {

    Node curNode;
    Node posNode;
    Node head;

    public boolean isEmpty() {return head == null;}

    public void addHead(Matakuliah dataMatkul) {
        curNode = null;
        posNode = null;

        Node newNode = new Node(dataMatkul);

        if (!isEmpty()) {
            newNode.setNext(head);
        }
        head = newNode;
    }

    public void addMid(Matakuliah dataMatkul, int position) {
        Node posNode = head;
        Node curNode;
        int i;

        Node newNode = new Node(dataMatkul);
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

    public void addTail(Matakuliah dataMatkul) {
        Node newNode = new Node(dataMatkul);

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

    public void removeHead(){
        if (head != null){
            Node temp = head;
            head = head.getNext();
            dispose(temp);
        } else {
            System.out.println("List Kosong");
        }
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

    public boolean find(Matakuliah kode){
        Node curNode = head;
        boolean found = false;

       while (curNode != null && !found){
            if (curNode.getDataMatkul().getKode().equals(kode.getKode())){
                found = true;
            } else {
                curNode = curNode.getNext();
            }
        }

        if (found){
            System.out.println("Matakuliah: " + curNode.getDataMatkul().getKode() + ", " + curNode.getDataMatkul().getNama() + ", " + curNode.getDataMatkul().getSks());
        } else {
            System.out.println("\n"+curNode.getDataMatkul().getKode()+" Tidak Ditemukan dalam list");
        }

        return found;
    }

    public void displayElementMatkul() {
        if (isEmpty()) {
            System.out.println("List Kosong");
            return;
        }
        
        Node curNode = head;
        while (curNode != null) {
            System.out.println("Matakuliah: " + curNode.getDataMatkul().getKode() + ", " + curNode.getDataMatkul().getNama() + ", " + curNode.getDataMatkul().getSks());
            curNode = curNode.getNext();
        }
        size();
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

    public void dispose(Node temp){
        temp.setNext(null);
        temp = null;
    }
}
