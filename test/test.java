import org.junit.Test;
import Hash.HashTable;

public class test {

    @Test

    public void test() {
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
        hashTable.remove(9);
        System.out.println(hashTable.get(2));
        System.out.println(hashTable.get(5));
        System.out.println(hashTable.get(8));
        

    }


}


