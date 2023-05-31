package Latihan;

public class ListTest {
    public static void main(String[] args) {
        StrukturList List = new StrukturList();

        List.addTail(3);
        List.addTail(4);
        List.addMid(7,2);
        List.addMid(8,2);
        List.addHead(5);

        List.displayElement();
    }
}
