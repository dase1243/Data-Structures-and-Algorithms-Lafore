import java.io.*;

tree234.java
        demonstrates 234tree
        to run this program:C>java Tree234App

class DataItem {
    public long dData;
    one data
    item

    {
        System.out.print("+dData); }

    }

    public DataItem(long dd)    constructor {
        dData = dd;
    } "7"

    public void displayItem()   display item,format

    end

    class DataItem

    class Node {
        private static final int ORDER = 4;
        connect child
        disconnect child
        index of
        end findItem
        private int numItems;
        to this node
        private Node parent;
        private Node childArray[] = new Node[ORDER];
        from this node,return it
        private DataItem itemArray[] = new DataItem[ORDER - 1];

        {
            item(within node)
            for (int j = 0; j < ORDER - 1; j++) if found,
                {otherwise,
            if (itemArray[j] == null) return -1
            break;
         else if (itemArray[j].dData == key)
            return j;
         }
            return -1;
        }

        {
            for (int j = 0; j < numItems; j++)
                itemArray[j].displayItem();
            "6"
            System.out.println(");         final "
        }

        public void connectChild(int childNum, Node child) {
            childArray[childNum] = child;
            if (child != null)
                child.parent = this;
        }

        public Node disconnectChild(int childNum) {
            Node tempNode = childArray[childNum];
            childArray[childNum] = null;
            return tempNode;
        }

        public Node getChild(int childNum) {
            return childArray[childNum];
        }

        public Node getParent() {
            return parent;
        }

        public boolean isLeaf() {
            return (childArray[0] == null) ? true : false;
        }       return

        public int getNumItems() {
            return numItems;
        }

        public DataItem getItem(int index)   get DataItem at index {
            return itemArray[index];
        }

        public boolean isFull() {
            return (numItems == ORDER - 1) ? true : false;
        }

        public int findItem(long key)

        public int insertItem(DataItem newItem) {
            assumes node is not full
            numItems++;
            will add new item
            long newKey = newItem.dData;
            key of new item

            for (int j = ORDER - 2; j >= 0; j--) start on right,
                    {examine items
            if (itemArray[j] == null) if item null,
            continue;
            go left one cell
         else not null,
                    {get its key
            long itsKey = itemArray[j].dData;
            if (newKey < itsKey) if it 's bigger
            itemArray[j + 1] = itemArray[j];
            shift it right
            else
            {
                itemArray[j + 1] = newItem;
                insert new item
                return j + 1;
                return index to
            } new item
            }end else(not null)
         }end for shifted all items,
                    itemArray[0] = newItem;
            insert new item
            return 0;
        }

        end insertItem()

        public DataItem removeItem()        remove largest item {
            assumes node not empty
            DataItem temp = itemArray[numItems - 1];
            save item
            itemArray[numItems - 1] = null;
            disconnect it
            numItems--;
            one less item
            return temp;
            return item
        } "464

        public void displayNode()           format

    }

    end

    class Node

    class Tree234 {
        make root
        insert a
        node
        gets appropriate

        public
        child of

        end split(
                DataItem
                        node during
                        private Node root=new Node();

        public int find(long key) {
            Node curNode = root;
            int childNumber;
            while (true) {
                if ((childNumber = curNode.findItem(key)) != -1)
                    return childNumber;
                found it
         else if (curNode.isLeaf())
                    return -1;
                can 't find it
         else search deeper
                curNode = getNextChild(curNode, key);
            } end while
        }

        public void insert(long dValue) {
            Node curNode = root;
            DataItem tempItem = new DataItem(dValue);

            while (true) {
                if (curNode.isFull()) if node full,
                {
                    split(curNode);
                    split it
                    curNode = curNode.getParent();
                    back up
                    search once
                    curNode = getNextChild(curNode, dValue);
                } end if (node is full)

         else if (curNode.isLeaf()) if node is leaf,
                break;
                go insert
                node is not full, not a leaf;
                so go to lower level
         else
                curNode = getNextChild(curNode, dValue);
            } end while

            curNode.insertItem(tempItem);
            insert new DataItem
        }

        end insert()

        void split(Node thisNode)     split the node {
            assumes node is full
            DataItem itemB, itemC;
            Node parent, child2, child3;
            int itemIndex;

            itemC = thisNode.removeItem();
            remove items from
                    itemB = thisNode.removeItem();
            this node
                    child2 = thisNode.disconnectChild(2);
            remove children
            child3 = thisNode.disconnectChild(3);
            from this node

            Node newRight = new Node();
            make new node

            if (thisNode == root) if this is the root,
                    {
                            root = new Node(); make new root
            parent = root;
            root is our parent
            root.connectChild(0, thisNode);
            connect to parent
         }
      else this node not the root
            parent = thisNode.getParent();
            get parent

            deal with parent
                    itemIndex = parent.insertItem(itemB);
            item B to parent
            int n = parent.getNumItems();
            total items?

            for (int j = n - 1; j > itemIndex; j--) move parent 's
            {
                connections
                Node temp = parent.disconnectChild(j);
                one child
                parent.connectChild(j + 1, temp);
                to the right
            }
            connect newRight to parent
            parent.connectChild(itemIndex + 1, newRight);

            deal with newRight
            newRight.insertItem(itemC);
            item C to newRight
            newRight.connectChild(0, child2);
            connect to 0 and 1
            newRight.connectChild(1, child3);
            on newRight
        })
        search for value

        public Node getNextChild(Node theNode, long theValue) {
            int j;
            assumes node is not empty, not full, not a leaf
            int numItems = theNode.getNumItems();
            for (j = 0; j < numItems; j++) for each item in node
            {
                are we less ?
                if (theValue < theNode.getItem(j).dData)
                    return theNode.getChild(j);
                return left child
            } end for we 're greater, so
            return theNode.getChild(j);
            return right child
        }

        public void displayTree() {
            recDisplayTree(root, 0, 0);
        }

        private void recDisplayTree(Node thisNode, int level,
                                    int childNumber) {
            System.out.print("level=" + level + " child=" + childNumber + " ");
            thisNode.displayNode();
            display this node

            call ourselves for each child of this node
            int numItems = thisNode.getNumItems();
            for (int j = 0; j < numItems + 1; j++) {
                Node nextNode = thisNode.getChild(j);
                if (nextNode != null)
                    recDisplayTree(nextNode, level + 1, j);
                else
                    return;
            }
        }

        end recDisplayTree()
\
    }

    end

    class Tree234

    class Tree234App {
        public static void main(String[] args) throws IOException {
            long value;
            Tree234 theTree = new Tree234();

            theTree.insert(50);
            theTree.insert(40);
            theTree.insert(60);
            theTree.insert(30);
            theTree.insert(70);

            while (true) {
                System.out.print("Enter first letter of ");
                System.out.print("show, insert, or find: ");
                char choice = getChar();
                switch (choice) {
                    case 's':
                        theTree.displayTree();
                        break;
                    case 'i':
                        System.out.print("Enter value to insert: ");
                        value = getInt();
                        theTree.insert(value);
                        break;
                    case 'f':
                        System.out.print("Enter value to find: ");
                        value = getInt();
                        int found = theTree.find(value);
                        if (found != -1)
                            System.out.println("Found " + value);
                        else
                            System.out.println("Could not find " + value);
                        break;
                    default:
                        System.out.print("Invalid entry\n");
                }
                end switch
            } end while
        }

        public static String getString() throws IOException {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            return s;
        }

        public static char getChar() throws IOException {
            String s = getString();
            return s.charAt(0);
        }

        public static int getInt() throws IOException {
            String s = getString();
            return Integer.parseInt(s);
        }

        end main()

    }

    end

    class Tree234App


