package Hash;

import Hash.HashSet;

import java.util.*;

public class HashTable {
    HashSet[] table;

    HashTable(int size) {
        table = new HashSet[size];
        for (int i = 0; i < size; i++) {
            table[i] = null;
        }
    }

    public int hashCode(int key) {
        int hash = key % table.length;
        return hash;
    }

    public void add(int key, int value) {
        int hash = hashCode(key);
        if (table[hash] == null) {
            table[hash] = new HashSet(key, value);
        } else {
            if (table[hash] != null && table[hash].getKey() == key)
                table[hash].setValue(value);
            else
                table[hash] = new HashSet(key, value);

        }
    }

    public int get(int key) {
        int hash = hashCode(key);
        if (table[hash] != null && table[hash].getKey() == key) {
            return table[hash].getValue();
        }
        return hash;
    }

    public boolean remove(int key) {
        int hash = hashCode(key);
        if (!table[hash].isDeleted() && table[hash].getKey() == key) {
            table[hash].deletePair();
            return true;
        }
        return false;

    }
}
