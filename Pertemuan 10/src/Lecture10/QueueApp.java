package Lecture10;

public class QueueApp {

    public static void main(String[] eueue) {
        StrukturQueue run = new StrukturQueue();

        int[] soManyQueue = {2,7,6,1};
        run.manyQueue(soManyQueue);
        run.displayQueue();

        run.dequeueFun();
        System.out.println("Data Berhasil Didequeue");
        run.displayQueue();
    }

}
