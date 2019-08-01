package application.javaRecap.hasmap;

import java.util.Objects;

public class HashMap<K, V> {

    private Entry<K, V>[] buckets;

    private final static int INITIAL_SIZE = 2;

    private int size = 0;


    public HashMap() {
        this(INITIAL_SIZE);
    }

    public HashMap(int cap) {
        this.buckets = new Entry[cap];
    }

    public void put(K key, V value) {
        //create new entry
        Entry entry = new Entry(key, value, null);

        //compute index ( hash ) --> and the index
        int bucketIndex = Objects.hashCode(key) % getBucketSize();

        Entry<K, V> existingEntry = buckets[bucketIndex];

        if (existingEntry == null) {
            buckets[bucketIndex] = entry;
            size++;
        } else {
            //Colision herr
            //iterate all entrys from same index
            while (existingEntry.getNext() != null) {
                //compare to see if is same key
                if (existingEntry.getKey().equals(key)) {
                    existingEntry.setValue(value);
                    return;
                }
                //go to next entry
                existingEntry = existingEntry.getNext();
            }
            //verify if last value from """inkedList" have to be updated
            if (existingEntry.getKey().equals(key)) {
                existingEntry.setValue(value);
            } else {
                //add entry in ""inkedList
                existingEntry.setNext(entry);
                size++;
            }
        }
    }

    public V get(K key) {

        int index = Objects.hashCode(key) % INITIAL_SIZE;
        Entry<K, V> bucket = buckets[index];


        while (bucket != null) {
            if (bucket.getKey().equals(key)) {
                return bucket.getValue();
            }
            bucket = bucket.getNext();
        }
        return null;
    }

    private int getBucketSize() {
        return this.INITIAL_SIZE;
    }

    public int getSize() {
        return size;
    }
}
