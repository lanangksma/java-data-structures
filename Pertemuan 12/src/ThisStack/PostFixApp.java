package ThisStack;

import java.io.IOException;
import java.util.Scanner;

public class PostFixApp {
    public static void main(String[] args) throws IOException {
        String input;
        int output;

        while (true) {
            System.out.print("Enter postfix: ");
            System.out.flush();
            input = consoleInput();
            if (input.equals(""))
                break;

            ParsePost aParser = new ParsePost(input);
            output = aParser.doParse();
            System.out.println("Hasil Operasi: " + output);
        }
    }

    public static String consoleInput() throws IOException {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();
        return input;
    }
}
