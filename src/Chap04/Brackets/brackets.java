import java.io.*;

brackets.java
        stacks used to check matching brackets
        to run this program:C>java bracketsApp for I

class StackX {
    stack is
    private int maxSize;
    private char[] stackArray;
    private int top;

    {
        return (top == -1);
    }

    public StackX(int s)       constructor {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j)  put item on top of stack {
        stackArray[++top] = j;
    }

    public char pop()         take item from top of stack {
        return stackArray[top--];
    }    true if

    public char peek()        peek at top of stack {
        return stackArray[top];
    }

    empty

    public boolean isEmpty()

}  end

class StackX

class BracketChecker {
    input string
    private String input;

    public BracketChecker(String in)        constructor {
        input = in;
    }

    public void check() {
        int stackSize = input.length();
        get max stack size
        StackX theStack = new StackX(stackSize);
        make stack

        for (int j = 0; j < input.length(); j++) get chars in turn
        {
            char ch = input.charAt(j);
            get char
            switch (ch) {
                case '{':
                    opening symbols
                case '[':
                case '(':
                    theStack.push(ch);
                    push them
                    break;

                case '}':
                    closing symbols
                case ']':
                case ')':
                    if (!theStack.isEmpty()) if stack not empty,
                        {
                    char chx = theStack.pop();
                    pop and check
                    if ((ch == '}' && chx != '{') ||
                            (ch == ']' && chx != '[') ||
                            (ch == ')' && chx != '('))
                        System.out.println("Error: " + ch + " at " + j);
                  }
               else prematurely empty
                    System.out.println("Error: " + ch + " at " + j);
                    break;
                default:
                    no action on other characters
                    break;
            } end switch
        } end for
        at this point, all characters have been processed
        if (!theStack.isEmpty())
            System.out.println("Error: missing right delimiter");
    }

    end check()

}  end

class BracketChecker

class BracketsApp {
    public static void main(String[] args) throws IOException {
        String input;
        while (true) {
            System.out.print(
                    "Enter string containing delimiters: ");
            System.out.flush();
            input = getString();
            read a string from kbd
            if (input.equals("")) quit if [Enter]
            break;
            make a BracketChecker
            BracketChecker theChecker = new BracketChecker(input);
            theChecker.check();
            check brackets
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

class BracketsApp

