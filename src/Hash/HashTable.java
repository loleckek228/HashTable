package Hash;

import Hash.HashSet;

import java.util.*;

public class HashTable {
    private HashSet[] table;

    public HashTable(int size) {
        table = new HashSet[size];
        for (int i = 0; i < size; i++) {
            table[i] = null;
        }
    }

    private int hashCode(int key) {
        int hash = key % table.length;
        return hash;
    }

    public void add(int key, int value) {
        int hash = hashCode(key);
        if (table[hash] == null ) {
            table[hash] = new HashSet(key, value);
        } else  {
            if (table[hash] != null && table[hash] != DeletedSet.getDeletedSet()
                    && table[hash].getKey() == key)
                table[hash].setValue(value);
            else
                table[hash] = new HashSet(key, value);

        }

    }

    public int get(int key) {
        int hash = hashCode(key);
        if (table[hash] != null && table[hash].getKey() == key
                && table[hash] != DeletedSet.getDeletedSet() ) {

            return table[hash].getValue();
        }
        return hash;

    }

    public HashTable remove(int key) {
        int hash = hashCode(key);
        if (table[hash] != null && table[hash].getKey() == key) {
            table[hash] = DeletedSet.getDeletedSet();

        }
        return null;
    }


}
