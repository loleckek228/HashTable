package Hash;

public class HashTable {
    HashBucket[] table;

    public HashTable(int size) {
        table = new HashBucket[size];

    }

    private int Code(int key) {
        int hash = key % table.length;
        return hash;
    }

    public void add(int key, int value) {
        int hash = Code(key);
        if (table[hash] == null) {
            table[hash] = new HashBucket();
        }

        table[hash].addPair(key, value);

    }

    public int contains(int key) throws KeyMissing {
        int hash = Code(key);
        if (table[hash] == null) {

            throw new KeyMissing();
        }
        return table[hash].getValue(key);

    }

    public void remove(int key) {
        int hash = Code(key);
        if (table[hash] != null) {
            table[hash].removeKey(key);

        }
    }


}
