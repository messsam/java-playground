package dsa.trees;

public class HashTable {
    Object[] table;
    public HashTable(int length) { table = new Object[length]; }
    public int hash(int key) { return (key * 21397) % table.length; } // Improved Division Method (MOD with primes)
    public void linearInsert(int key) { // Linear probing
        int index = hash(key);
        while (table[index] != null)
            index = (index+1) % table.length;
        table[index] = key;
    }
    public void quadraticInsert(int key) { // Quadratic probing

    }
    public Object linearSearch(int key) { // Linear search
        int index = hash(key);
        while (table[index] != null)
            if ((int)table[index] == key) return table[index];
            else index = (index+1) % table.length;
        return null;
    }
}
