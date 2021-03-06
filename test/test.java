import Hash.HashTable;
import Hash.KeyMissing;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class test {

    @Test


    public void test() throws KeyMissing {
        HashTable hashTable = new HashTable(8);
        hashTable.add(1, 2);
        hashTable.add(2, 3);
        hashTable.add(3, 4);
        hashTable.add(4, 5);
        hashTable.add(5, 6);
        hashTable.add(6, 7);
        hashTable.add(7, 8);
        hashTable.add(8, 9);
        hashTable.add(9, 10);
        hashTable.remove(6);
        Assertions.assertNotNull(hashTable.contains(1));
        Assertions.assertNotNull(hashTable.contains(2));
        Assertions.assertNotNull(hashTable.contains(5));
        Assertions.assertNotNull(hashTable.contains(7));
        Assertions.assertThrows(KeyMissing.class, () -> hashTable.contains(6));





    }


}


