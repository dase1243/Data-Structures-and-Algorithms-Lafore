import java.io.*;

hash.java
        demonstrates hash table with linear probing
        to run this program:C:>java HashTableApp

class DataItem {                                (
    could have
    more data)
    private int iData;

    public DataItem(int ii)          constructor {
        iData = ii;
    }

    data item(key)

    public int getKey() {
        return iData;
    }

}  end

class DataItem

class HashTable {
    array holds
    deleted it
    hash table
    assumes table

    pubems
    not full        for
    private DataItem[] hashArray;
    private int arraySize;
    private DataItem nonItem;

    {
        int key = item.getKey();
        extract key
        int hashVal = hashFunc(key);
        hash the key
        until empty cell or -1,
        while (hashArray[hashVal] != null &&
                hashArray[hashVal].getKey() != -1) {
            ++hashVal;
            go to next cell
            hashVal %= arraySize;
            wraparound if necessary
        }
        hashArray[hashVal] = item;
        insert item
    }

    public HashTable(int size)       constructor {
        arraySize = size;
        hashArray = new DataItem[arraySize];
        nonItem = new DataItem(-1);
        deleted item key is -1
    }
   (

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

    lic

    int hashFunc(int key) {
        return key % arraySize;
        hash function
    })

    public void insert(DataItem item) insert a DataItem

    end insert()

    public DataItem delete(int key)  delete a DataItem {
        int hashVal = hashFunc(key);
        hash the key

        while (hashArray[hashVal] != null) until empty cell,
                {found the key ?
        if (hashArray[hashVal].getKey() == key) {
            DataItem temp = hashArray[hashVal];
            save item
            hashArray[hashVal] = nonItem;
            delete item
            return temp;
            return item
        }
        ++hashVal;
        go to next cell
        hashVal %= arraySize;
        wraparound if necessary
         }
        return null;
        can 't find item
    }

    end delete()

    public DataItem find(int key)    find item with key {
        int hashVal = hashFunc(key);
        hash the key

        while (hashArray[hashVal] != null) until empty cell,
                {found the key ?
        if (hashArray[hashVal].getKey() == key)
            return hashArray[hashVal];
        yes,return item
                ++ hashVal;
        go to next cell
        hashVal %= arraySize;
        wraparound if necessary
         }
        return null;
        can 't find item
    }

}  end

class HashTable

class HashTableApp {
    public static void main(String[] args) throws IOException {
        DataItem aDataItem;
        int aKey, size, n, keysPerCell;
        get sizes
        System.out.print("Enter size of hash table: ");
        size = getInt();
        System.out.print("Enter initial number of items: ");
        n = getInt();
        keysPerCell = 10;
        make table
        HashTable theHashTable = new HashTable(size);

        for (int j = 0; j < n; j++) insert data
        {
            aKey = (int) (java.lang.Math.random() *
                    keysPerCell * size);
            aDataItem = new DataItem(aKey);
            theHashTable.insert(aDataItem);
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
                    theHashTable.insert(aDataItem);
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
                    if (aDataItem != null) {
                        System.out.println("Found " + aKey);
                    } else
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

class HashTableApp


