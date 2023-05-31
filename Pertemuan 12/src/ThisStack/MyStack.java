package ThisStack;

public class MyStack extends AbstractStack {

    public MyStack(int capacity) {
        super(capacity);
    }

    public int peekN(int n) {
        return arr[n];
    }

    public void peek() {
        for (int i = 0; i < size(); i++) {
            System.out.print(peekN(i));
            System.out.print(' ');
        }
    }

    public void displayStack(String stack) {
        System.out.print(stack);
        System.out.print("Stack (bottom --> top): ");
        peek();
        System.out.println();
    }

}

