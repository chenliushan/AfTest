package polyu_af;

import com.google.java.contract.Requires;

import java.util.ArrayList;

/**
 * Created by liushanchen on 16/2/19.
 */
public class MyList1 {

    private ArrayList<String> storage;
    int index = 0;

    @Requires(" a_size > 0 ")
    public MyList1(int a_size) {
        storage = new ArrayList<String>(a_size);
        /*
        have to new object like this or the list always empty
         */
        System.out.println("storage.size:" + storage.size());
        String g = new String();
        for (int i = 0; i < a_size; i++) {
            storage.add(g);
        }
        System.out.println("storage.size:" + storage.size());
    }

    @Requires("n>1")
    public ArrayList<String> duplicate(int n) {
        int idx;
        int to_be_copied, counter = 0;
        ArrayList<String> result = new ArrayList<String>(storage.size());
        idx = index;
        to_be_copied = Math.min(n, count() - index + 1);
        while (counter != to_be_copied) {
            System.out.println();
            extend(result, storage.get(index));
            forth();
            counter++;
        }
        return result;
    }

    @Requires("index<count()")
    private void forth() {
        index++;
    }

    @Requires("a_item!=null")
    public boolean has(String a_item) {
        return storage.contains(a_item);
    }

    public boolean off() {
        return storage.isEmpty();
    }

    public int count() {
        return storage.size();
    }

    @Requires("a_item!=null")
    public void extend(ArrayList<String> result, String a_item) {
        result.add(a_item);
    }

    @Requires("!off()")
    public void remove() {
        storage.remove(index);
    }

}
