package ThisStack;

public class ParsePost {

    private MyStack theStack;
    private String input;

    public ParsePost(String input) {
        this.input = input;
    }

    public int doParse() {
        theStack = new MyStack(20);

        char ch;
        int num1, num2, hasilOps;

        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            theStack.displayStack(" " + ch + " ");
            if (ch >= '0' && ch <= '9') {
                theStack.push((int) (ch - '0'));
            } else {
                num2 = theStack.pop();
                num1 = theStack.pop();
                hasilOps = switch (ch) {
                    case '+' -> num1 + num2;
                    case '-' -> num1 - num2;
                    case '*' -> num1 * num2;
                    case '/' -> num1 / num2;
                    default -> 0;
                };
                theStack.push(hasilOps);
            }
        }
        hasilOps = theStack.pop();
        return hasilOps;
    }

}
