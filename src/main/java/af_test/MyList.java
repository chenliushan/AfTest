package af_test;


import com.google.java.contract.Requires;

import java.util.ArrayList;

/**
 * Created by liushanchen on 16/2/19.
 */
public class MyList {

    private static ArrayList<String> storage;


    private int index = 0;

    @Requires(" a_size > 0 ")
    public void make(int a_size) {
        storage = new ArrayList<String>(a_size);
    }

    @Requires("n > 0 && !off()")
    public MyList duplicate(int n) {
        int idx;
        int to_be_copied = 0, counter = 0;
        MyList result = new MyList();
        result.make(storage.size());
        idx = index;
//        to_be_copied = Math.min(n, count() - index + 1);
        to_be_copied = Math.min(n, count() - index);

        while (counter < to_be_copied) {
            result.extend(this.item());
            forth();
            counter++;
//            idx = to_be_copied - counter + idx - n;
        }
        return result;
    }

    private void start() {
        index = 0;
    }

    @Requires("!after()")
    private void forth() {
        index++;
    }

    public boolean after() {
        return index + 1 >= storage.size() - 1;
    }

    @Requires("!off()")
    public String item() {
        return storage.get(index);
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
    public void extend(String a_item) {
        storage.add(a_item);
    }

    @Requires("!off()")
    public void remove() {
        storage.remove(index);
    }

}
