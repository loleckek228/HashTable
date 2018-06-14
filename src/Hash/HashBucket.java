package Hash;

import Hash.HashSet;
import Hash.KeyMissing;

public class HashBucket {

    private HashSet[] chain;

    public HashBucket() {
        chain = new HashSet[8];

    }


    public void addPair(int key, int value) {
        for (int i = 0; i < chain.length; i++) {
            if (chain[i] == null) {
                chain[i] = new HashSet(key, value);
                break;
            }
        }
    }

    public int getValue(int key) throws KeyMissing {
        for (int i = 0; i < chain.length; i++) {
            if (chain[i] != null && chain[i].getKey() == key) {
                return chain[i].getValue();

            }
        }
        throw new KeyMissing();
    }

    public void removeKey(int key) {
        for (int i = 0; i < chain.length; i++) {
            if (chain[i].getKey() == key) {
                chain[i] = null;
                break;
            }
        }
    }


}
