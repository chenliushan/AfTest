package af_test;

/**
 * Created by liushanchen on 16/2/19.
 */
public class MyListMain {
    static int  n = 3;
    static int size = 4;
    public static void main(String[] arg) {
//        int size = Integer.parseInt(arg[0]);
//        int n = Integer.parseInt(arg[1]);

        MyList1 myList = new MyList1(size);
        System.out.println("duplicate size:" + myList.duplicate(n).size());
    }
    public static void out(){
        System.out.println("duplicate size:" +n);

    }
}
