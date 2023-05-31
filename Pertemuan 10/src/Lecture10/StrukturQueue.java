package Lecture10;

public class StrukturQueue {

    private Node front;
    private Node rear;

    public boolean isEmpty() {return front == null;}

    public void enqueueFun(int data){
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = newNode;
        } else {
            rear.setNext(newNode);
        }
        rear = newNode;
    }

    public void manyQueue(int[] data) {
        for (int datum : data) {
            enqueueFun(datum);
        }
    }

    public void dequeueFun() {
        if (front != null) {
            Node temp = front;
            front = front.getNext();
            dispose(temp);
        } else {
            System.out.println("Queue Kosong");
        }
    }

    public void dispose(Node temp){
        temp.setNext(null);
        temp = null;
    }

    public int size() {
        int size = 0;
        Node curNode = front;
        while (curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }

    public int front (){
        return front != null ? front.getData() : -1;
    }

    public void tampilElement() {
        Node curNode = front;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }

    public void displayQueue() {
        System.out.println("Sebelum enqueue " + size() + "x");

        System.out.println("Size: 0");
        System.out.println("IsEmpty: true");
        System.out.print("Element Queue: Queue Kosong");
        System.out.println("\n");

        System.out.println("Setelah enqueue: " + size() + "x");

        System.out.println("Size: " + size());
        System.out.println("IsEmpty: " + isEmpty());
        System.out.print("Element Queue: ");
        tampilElement();
        System.out.println("\nFront: "+ front());
        System.out.println();
    }

}