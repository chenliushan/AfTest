package af_test;

/**
 * Created by liushanchen on 16/2/19.
 */
public class Application {
    static int  n = 3;
    static int size = 4;
    public static void main(String[] arg) {

        MyList myList = new MyList();
        myList.make(size);

        System.out.println("myList size:" + myList.count());
        System.out.println("duplicate size:" + myList.duplicate(0).count());
        System.out.println("duplicate size:" + myList.duplicate(n).count());
    }
}
