package af_test;

/**
 * Created by liushanchen on 16/2/19.
 */
public class Application {
    static int  n = 3;
    static int size = 4;
    public static void main(String[] arg) {

        MyList myList = new MyList(size);
        myList.extend("a");
        myList.extend("b");
        myList.extend("c");
        myList.extend("d");
        System.out.println("size:"+myList.count());
        MyList dupList=myList.duplicate(n);
        System.out.println("size:"+dupList.count());
//        for(int i=0;i<dupList.count();i++){
//            System.out.println(dupList.item());
//            dupList.forth();
//        }

    }
}
