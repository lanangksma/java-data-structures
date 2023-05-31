package LatihanRemoveList;

public class ListApp {
    public static void main(String[] args) {
        StrukturList myList = new StrukturList();

        myList.addHead(2);
        myList.addHead(9);
        myList.addHead(7);
        myList.displayElement();
        myList.removeHead();
        System.out.println(" ");
        myList.displayElement();
        myList.removeHead();
        System.out.println(" ");
        myList.displayElement();
        myList.removeHead();
        System.out.println(" ");
        myList.displayElement();

        System.out.println(" Baris bawah merupakan hapus tail ");

        StrukturList myList2 = new StrukturList();

        myList2.addTail(2);
        myList2.addTail(6);
        myList2.addTail(3);
        myList2.addTail(5);
        myList2.addTail(1);
        myList2.displayElement();
        myList2.removeTail();
        System.out.println(" ");
        myList2.displayElement();
        myList2.removeHead();
        System.out.println(" ");
        myList2.displayElement();
        myList2.removeTail();
        System.out.println(" ");
        myList2.displayElement();
        System.out.println(" ");

        System.out.println(" Baris bawah merupakan hapus tengah ");

        StrukturList myList3 = new StrukturList();

        myList3.addHead(9);
        myList3.addHead(1);
        myList3.addHead(8);
        myList3.addHead(7);
        myList3.addHead(3);
        myList3.addHead(4);
        myList3.displayElement();
        System.out.println(" ");
        myList3.removeMid(4);
        myList3.displayElement();
        System.out.println(" ");
        myList3.removeMid(2);
        myList3.displayElement();
        System.out.println();
        myList3.removeTail();
        myList3.displayElement();
        System.out.println(" ");
        myList3.removeHead();
        myList3.removeHead();
        myList3.displayElement();
        myList3.addHead(4);
        myList3.addHead(2);
        System.out.println(" ");
        myList3.displayElement();
    }
}
