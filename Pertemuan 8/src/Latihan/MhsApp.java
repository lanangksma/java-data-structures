package Latihan;

public class MhsApp {
    public static void main(String[] args) {
        StrukturListMHS run = new StrukturListMHS();

        Mahasiswa MHS1 = new Mahasiswa("Asep Saepul", "2100");
        Mahasiswa MHS2 = new Mahasiswa("Arif Saepul", "2101");
        Mahasiswa MHS3 = new Mahasiswa("Yoga Saepul", "2102");


        run.addTail(MHS1);
        run.addTail(MHS2);
        run.addTail(MHS3);

        run.displayElement();
    }
}
