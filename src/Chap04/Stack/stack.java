stack.java
        demonstrates stacks
        to run this program:C>java StackApp

class StackX {
    size of
    top ofpriva
    stack array
    stack is
    stack is
    te
    int maxSize;
    stack
    private long[] stackArray;
    private int top;

    {
        return (top == -1);
    }

    {
        return (top == maxSize - 1);
    }

    public StackX(int s)         constructor {
        maxSize = s;
        set array size
                stackArray = new long[maxSize];
        create array
        top = -1;
        no items yet
    }    true if

    public void push(long j)    put item on top of stack {
        stackArray[++top] = j;
        increment top, insert item
    }

    empty

    public long pop()           take item from top of stack {
        return stackArray[top--];
        access item, decrement top
    }

    public long peek()          peek at top of stack {
        return stackArray[top];
    }     true if

    public boolean isEmpty()

    full

    public boolean isFull()

}  end

class StackX

class StackApp {
    public static void main(String[] args) {
        StackX theStack = new StackX(10);
        make new stack
        theStack.push(20);
        push items onto stack
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        while (!theStack.isEmpty()) until it 's empty,
        {
            delete item from stack
            long value = theStack.pop();
            System.out.print(value);
            display it
            System.out.print(" ");
        } end while
        System.out.println("");
    }

    end main()
}  end

class StackApp

