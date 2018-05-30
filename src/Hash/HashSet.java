package Hash;

public class HashSet {
    private int key;
    private int value;
    private boolean deleted;

    public HashSet(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {

        return key;
    }

    public int getValue() {

        return value;
    }

    public void setValue(int value) {
        this.value = value;

    }

    public boolean isDeleted() {
        return deleted;
    }

    public boolean deletePair() {
        if (!this.deleted) {
            this.deleted = true;
            return true;
        } else {
            return false;
        }
    }
}

