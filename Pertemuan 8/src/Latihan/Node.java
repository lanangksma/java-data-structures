package Latihan;

public class Node {
    private Mahasiswa data;

    private Matakuliah dataMatkul;
    private Node next;

    public Node(Matakuliah dataMatkul) {
        this.dataMatkul = dataMatkul;
    }

    public Matakuliah getDataMatkul() {
        return dataMatkul;
    }

    public void setDataMatkul(Matakuliah dataMatkul) {
        this.dataMatkul = dataMatkul;
    }

    /* Inisialisasi Atribut Node */
    public Node(Mahasiswa data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Mahasiswa getData() {
        return data;
    }

    public void setData(Mahasiswa data) {
        this.data = data;
    }
}
