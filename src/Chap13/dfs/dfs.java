dfs.java
        demonstrates depth-first search
        to run this program:C>java DFSApp

class StackX {
    private final int SIZE = 20;
    nothing on
    private int[] st;
    private int top;

    {
        return (top == -1);
    }

    public StackX()           constructor {
        st = new int[SIZE];
        make array
        top = -1;
    }

    public void push(int j)   put item on stack {
        st[++top] = j;
    }

    public int pop()          take item off stack {
        return st[top--];
    }  true if

    public int peek()         peek at top of stack {
        return st[top];
    }

    stack

    public boolean isEmpty()

}  end

class StackX

class Vertex {
    public char label;
    public boolean wasVisited;

    label(e.g . 'A')

    public Vertex(char lab)   constructor {
        label = lab;
        wasVisited = false;
    }

}  end

class Vertex

class Graph {
    private final int MAX_VERTS = 20;
    list of
    adjacency matrix
    end constructor

    vertices
    current number
    of vertices

    search


  returns an

    public v first    public voioid dis
    unvisited vertex

    public vo
    adj to
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private StackX theStack;-

    {
        begin at vertex 0
        vertexList[0].wasVisited = true;
        mark it
        displayVertex(0);
        display it
        theStack.push(0);
        push it

        while (!theStack.isEmpty()) until stack empty,
            {
                    get an unvisited vertex adjacent to stack top
        int v = getAdjUnvisitedVertex(theStack.peek());
        if (v == -1) if no such vertex,
            theStack.pop();
         else if it exists,
        {
            vertexList[v].wasVisited = true;
            mark it
            displayVertex(v);
            display it
            theStack.push(v);
            push it
        }
         }end while

        stack is empty, so we 're done
        for (int j = 0; j < nVerts; j++) reset flags
        vertexList[j].wasVisited = false;
    }

    public Graph()               constructor {
        vertexList = new Vertex[MAX_VERTS];
        adjacency matrix
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int y = 0; y < MAX_VERTS; y++) set adjacency
        for (int x = 0; x < MAX_VERTS; x++) matrix to 0
        adjMat[x][y] = 0;
        theStack = new StackX();
    }

    playVertex(int v) {
        System.out.print(vertexList[v].label);
    }

    public void addVertex(char lab) {
        vertexList[nVerts++] = new Vertex(lab);
    }

    d addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    id dfs()  depth

    v

    public int getAdjUnvisitedVertex(int v) {
        for (int j = 0; j < nVerts; j++)
            if (adjMat[v][j] == 1 && vertexList[j].wasVisited == false)
                return j;
        return -1;
    }

    end getAdjUnvisitedVertex()

}  end

class Graph

class DFSApp {
    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVertex('A');
        0 (start for dfs)
        theGraph.addVertex('B');
        1
        theGraph.addVertex('C');
        2
        theGraph.addVertex('D');
        3
        theGraph.addVertex('E');
        4

        theGraph.addEdge(0, 1);
        AB
        theGraph.addEdge(1, 2);
        BC
        theGraph.addEdge(0, 3);
        AD
        theGraph.addEdge(3, 4);
        DE

        System.out.print("Visits: ");
        theGraph.dfs();
        depth - first search
        System.out.println();
    }

    end main()
}  end

class DFSApp


