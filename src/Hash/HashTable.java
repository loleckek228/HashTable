package Hash;

public class HashTable {
    HashBucket[] table;

    public HashTable(int size) {
        table = new HashBucket[size];

    }

    private int hashCode(int key) {
        int hash = key % table.length;
        return hash;
    }

    public void add(int key, int value) {
        int hash = hashCode(key);
        if (table[hash] == null) {
            table[hash] = new HashBucket();
        }

        table[hash].addPair(key, value);



    }

    public int get(int key) throws KeyMissing {
        int hash = hashCode(key);
        if (table[hash] == null) {

            throw new KeyMissing();
        }
        return table[hash].getValue(key);

    }

    public void remove(int key) {
        int hash = hashCode(key);
        if (table[hash] != null) {
            table[hash].removeKey(key);

        }
    }


}
