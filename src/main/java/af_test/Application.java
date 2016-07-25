package af_test;

/**
 * Created by liushanchen on 16/2/19.
 */
public class Application {
    static int  n = 3;
    static int size = 4;
    public static void main(String[] arg) {

        MyList1 myList = new MyList1(size);
        System.out.println("duplicate size:" + myList.duplicate(n).size());
        System.out.println("duplicate size:" + myList.duplicate(n).size());
    }
}
