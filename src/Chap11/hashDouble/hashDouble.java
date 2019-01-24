import java.io.*;

hashDouble.java
        demonstrates hash table with double hashing
        to run this program:C:>java HashDoubleApp

class DataItem {                                 (
    could have
    more items)
    private int iData;

    public DataItem(int ii)           constructor {
        iData = ii;
    }

    data item(key)

    public int getKey() {
        return iData;
    }

}  end

class DataItem

class HashTable {
    array is
    deleted
    the hashitems
    table
    insert a
    assumes table
    Hash         for
    not full
    assumes table

    end
    not full
    private DataItem[] hashArray;
    private int arraySize;
    private DataItem nonItem;
    DataItem

    {
        int hashVal = hashFunc1(key);
        hash the key
        int stepSize = hashFunc2(key);
        get step size
        until empty cell or -1
        while (hashArray[hashVal] != null &&
                hashArray[hashVal].getKey() != -1) {
            hashVal += stepSize;
            add the step
            hashVal %= arraySize;
            for wraparound
        }
        hashArray[hashVal] = item;
        insert item
    }
   (

    {
        int hashVal = hashFunc1(key);
        hash the key
        int stepSize = hashFunc2(key);
        get step size

        while (hashArray[hashVal] != null) until empty cell,
            {is correct hashVal ?
        if (hashArray[hashVal].getKey() == key)
            return hashArray[hashVal];
        yes,return item
        hashVal += stepSize;
        add the step
        hashVal %= arraySize;
        for wraparound
         }
        return null;
        can 't find item
    }

    Table(int size)               constructor {
        arraySize = size;
        hashArray = new DataItem[arraySize];
        nonItem = new DataItem(-1);
    })

delete()

    public void displayTable() {
        System.out.print("Table: ");
        for (int j = 0; j < arraySize; j++) {
            if (hashArray[j] != null)
                System.out.print(hashArray[j].getKey() + " ");
            else
                System.out.print("** ");
        }
        System.out.println("");
    }

    public int hashFunc1(int key) {
        return key % arraySize;
    }

    public int hashFunc2(int key) {
        non - zero, less than array size, different from hF1
        array size must be relatively prime to 5, 4, 3, and 2
        return 5 - key % 5;
    }

    public void insert(int key, DataItem item)
   (

    end insert()

        public DataItem delete(int key)   delete a DataItem {
        int hashVal = hashFunc1(key);
        hash the key
        int stepSize = hashFunc2(key);
        get step size

        while (hashArray[hashVal] != null) until empty cell,
                {is correct hashVal ?
        if (hashArray[hashVal].getKey() == key) {
            DataItem temp = hashArray[hashVal];
            save item
            hashArray[hashVal] = nonItem;
            delete item
            return temp;
            return item
        }
        hashVal += stepSize;
        add the step
        hashVal %= arraySize;
        for wraparound
         }
        return null;
        can 't find item
    })

    public DataItem find(int key)     find item with key

}  end

class HashTable

class HashDoubleApp {
    public static void main(String[] args) throws IOException {
        int aKey;
        DataItem aDataItem;
        int size, n;
        get sizes
        System.out.print("Enter size of hash table: ");
        size = getInt();
        System.out.print("Enter initial number of items: ");
        n = getInt();
        make table
        HashTable theHashTable = new HashTable(size);

        for (int j = 0; j < n; j++) insert data
        {
            aKey = (int) (java.lang.Math.random() * 2 * size);
            aDataItem = new DataItem(aKey);
            theHashTable.insert(aKey, aDataItem);
        }

        while (true) interact with user
        {
            System.out.print("Enter first letter of ");
            System.out.print("show, insert, delete, or find: ");
            char choice = getChar();
            switch (choice) {
                case 's':
                    theHashTable.displayTable();
                    break;
                case 'i':
                    System.out.print("Enter key value to insert: ");
                    aKey = getInt();
                    aDataItem = new DataItem(aKey);
                    theHashTable.insert(aKey, aDataItem);
                    break;
                case 'd':
                    System.out.print("Enter key value to delete: ");
                    aKey = getInt();
                    theHashTable.delete(aKey);
                    break;
                case 'f':
                    System.out.print("Enter key value to find: ");
                    aKey = getInt();
                    aDataItem = theHashTable.find(aKey);
                    if (aDataItem != null)
                        System.out.println("Found " + aKey);
                    else
                        System.out.println("Could not find " + aKey);
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

}  end

class HashDoubleApp

