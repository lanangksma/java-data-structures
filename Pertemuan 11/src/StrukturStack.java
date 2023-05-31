public class StrukturStack {

    private int[] stack;
    private int capacity;
    private int top;
    public final int MIN = -1;

    public StrukturStack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = MIN;
    }

    public boolean isEmpty() {
        return top == MIN;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = data;
        }
    }

    public int pop() {
        return stack[top--];
    }

    public int peek() {
        return stack[top];
    }

    public int size() {
        return top + 1;
    }

    public void displayElement() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print(stack[top] + " ");
            for (int i = top - 1; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public void displayPushed() {
        for (int i = 0; i <= top; i++) {
            System.out.print("push " + stack[i]);
            if (i != top) {
                System.out.print(", ");
            }
        }
    }

    public void displayPoped() {
        pop();
        System.out.println("\nPoping...\nAfter poping: ");
        System.out.println("Size: " + size());
        System.out.println("Capacity: " + capacity);
        System.out.println("Is Empty: " + isEmpty());
        System.out.println("Is Full: " + isFull());
        System.out.println("top: " + peek());
        System.out.print("Element from top: ");
        displayElement();
    }

    public void displayStack() {
        System.out.println("## Sebelum Push ##");
        System.out.println("Size: 0");
        System.out.println("Is Empty: true");
        System.out.println("Is Full: false");
        System.out.println("top: -1");
        System.out.println("Element from top: Stack is empty\n");

        System.out.println("## Setelah Push " + size() + "x ##");
        displayPushed();
        System.out.println("\nSize: " + size());
        System.out.println("Capacity: " + capacity);
        System.out.println("Is Empty: " + isEmpty());
        System.out.println("Is Full: " + isFull());
        System.out.println("top: " + peek());
        System.out.print("Element from top: ");
        displayElement();
        displayPoped();

    }
}