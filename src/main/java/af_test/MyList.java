package af_test;


import com.google.java.contract.Requires;

import java.util.ArrayList;

/**
 * Created by liushanchen on
 *
 */
public class MyList {

    private  ArrayList<String> storage;


    private int index = 0;

    @Requires(" a_size > 0 ")
    public  MyList(int a_size) {
        storage = new ArrayList<String>(a_size);
    }

    @Requires("n >= 0")
    public MyList duplicate(int n) {
        int idx;
        int to_be_copied = 0, counter = 0;
        MyList result = new MyList(storage.size());
        idx = index;
        to_be_copied = Math.min(n, this.count() - index);
        while (counter < to_be_copied) {
            result.extend(this.item());
            forth();
            counter++;
        }
        return result;
    }

    public void start() {
        index = 0;
    }

    @Requires("!after()")
    private void forth() {
        index++;
    }

    public boolean after() {
        return index >= storage.size() ;
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
