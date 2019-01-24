import java.io.*;

stackTriangle2.java
        evaluates triangular numbers,stack replaces recursion
        to run this program:C>java StackTriangle2App for I

class StackX {
    size of
    top ofmaxSi
    stack array
    stack is
    private int ze;
    private int[] stackArray;
    stack
    private int top;

    {
        return (top == -1);
    }

    public StackX(int s)        constructor {
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int p)     put item on top of stack {
        stackArray[++top] = p;
    }

    public int pop()            take item from top of stack {
        return stackArray[top--];
    }    true if

    public int peek()           peek at top of stack {
        return stackArray[top];
    }

    empty

    public boolean isEmpty()

}  end

class StackX

class StackTriangle2App {
    static int theNumber;
    static int theAnswer;
    static StackX theStack;

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number: ");
        System.out.flush();
        theNumber = getInt();
        stackTriangle();
        System.out.println("Triangle=" + theAnswer);
    }

    public static void stackTriangle() {
        theStack = new StackX(10000);
        make a stack

                theAnswer = 0;
        initialize answer

        while (theNumber > 0) until n is 1,
                {
                        theStack.push(theNumber); push value
        --theNumber;
        decrement value
         }
        while (!theStack.isEmpty()) until stack empty,
                {
        int newN = theStack.pop();
        pop value,
        theAnswer += newN;
        add to answer
         }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }

    end main()

}  end

class StackTriangle2App

