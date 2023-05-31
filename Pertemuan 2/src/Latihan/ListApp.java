package Latihan;

public class ListApp {
    public static void main(String[] args) {
        StrukturList myList = new StrukturList();

        // menambahkan elemen pada awal dan akhir list
        myList.addHead(2);
        myList.addHead(1);
        myList.addTail(3);

        // menampilkan isi list
        myList.displayElement();

        // menambahkan elemen pada awal, tengah, dan akhir list
        myList.addHead(5);
        myList.addTail(6);
        myList.addHead(4);
        myList.addTail(7);
        myList.addHead(3);
        myList.addTail(8);

        // menampilkan isi list
        myList.displayElement();
    }
}
