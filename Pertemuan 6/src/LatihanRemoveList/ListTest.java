package LatihanRemoveList;

public class ListTest {
    public static void main(String[] args) {
        StrukturList ls1 = new StrukturList();

        int [] datals1 = {5, 4, 6};
        ls1.addMany(datals1);

        ls1.displayElement();
        ls1.find(6);

        System.out.println("###################################");
        StrukturList ls2 = new StrukturList();

        int [] datals2 = {7, 6, 4, 2, 3};
        ls2.addMany(datals2);
        ls2.displayElement();
        ls2.size();

        System.out.println("###################################");
        StrukturList ls3 = new StrukturList();

        int[] datals3 = {4, 3, 7, 8, 1, 9};
        ls3.addMany(datals3);
        ls3.displayElement();
        ls3.removeAll();
        ls3.displayElement();
    }
}
