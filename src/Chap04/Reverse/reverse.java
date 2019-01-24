import java.io.*;

reverse.java
        stack used to reverse a string
        to run this program:C>java ReverseApp for I

class StackX {
    stack is
    private int maxSize;
    private char[] stackArray;
    private int top;

    {
        return (top == -1);
    }

    public StackX(int max)    constructor {
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j)  put item on top of stack {
        stackArray[++top] = j;
    }

    public char pop()         take item from top of stack {
        return stackArray[top--];
    }  true if

    public char peek()        peek at top of stack {
        return stackArray[top];
    }

    empty

    public boolean isEmpty()

}  end

class StackX

class Reverser {
    input string
    output string
    private String output;
    private String input;

    public Reverser(String in)           constructor {
        input = in;
    }

    public String doRev()                reverse the string {
        int stackSize = input.length();
        get max stack size
        StackX theStack = new StackX(stackSize);
        make stack

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            get a char from input
            theStack.push(ch);
            push it
        }
        output = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            pop a char,
            output = output + ch;
            append to output
        }
        return output;
    }

    end doRev()

}  end

class Reverser

class ReverseApp {
    public static void main(String[] args) throws IOException {
        String input, output;
        while (true) {
            System.out.print("Enter a string: ");
            System.out.flush();
            input = getString();
            read a string from kbd
            if (input.equals("")) quit if [Enter]
            break;
            make a Reverser
            Reverser theReverser = new Reverser(input);
            output = theReverser.doRev();
            use it
            System.out.println("Reversed: " + output);
        } end while
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    end main()

}  end

class ReverseApp

