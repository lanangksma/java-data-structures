package Latihan;

public class Mahasiswa {
    private String namaMhs;
    private String nrpMhs;

    public Mahasiswa(String namaMhs, String nrpMhs) {
        this.namaMhs = namaMhs;
        this.nrpMhs = nrpMhs;
    }

    public String getNamaMhs() {
        return namaMhs;
    }

    public void setNamaMhs(String namaMhs) {
        this.namaMhs = namaMhs;
    }

    public String getNrpMhs() {
        return nrpMhs;
    }

    public void setNrpMhs(String nrpMhs) {
        this.nrpMhs = nrpMhs;
    }
}
