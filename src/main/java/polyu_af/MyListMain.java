package polyu_af;

/**
 * Created by liushanchen on 16/2/19.
 */
public class MyListMain {
    public static void main(String[] arg) {
//        int size = Integer.parseInt(arg[0]);
//        int n = Integer.parseInt(arg[1]);
        int n = 3;
        int size = 4;
        MyList1 myList = new MyList1(size);
        System.out.println("duplicate size:"+myList.duplicate(n).size());
    }
}
