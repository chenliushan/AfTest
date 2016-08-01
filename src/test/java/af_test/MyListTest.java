package af_test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * MyList Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>七月 28, 2016</pre>
 */
public class MyListTest {
    MyList myList;

    @Before
    public void before() throws Exception {
        myList = new MyList(5);
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testMyList() throws Exception {
        myList.extend("a");
        myList.extend("b");
        myList.extend("c");
        myList.extend("d");
        System.out.println("size:"+myList.count());
        MyList dupList=myList.duplicate(3);
        System.out.println("size:"+dupList.count());
//TODO: Test goes here...
    }
    @Test
    public void testMyList1() throws Exception {
        myList.extend("a");
        myList.extend("b");
        System.out.println("size:"+myList.count());
        MyList dupList=myList.duplicate(2);
        System.out.println("size:"+dupList.count());
//TODO: Test goes here...
    }
    @Test
    public void testMyListMake() throws Exception {
        myList = new MyList(0);
//TODO: Test goes here...
    }

    /**
     * Method: duplicate(int n)
     */
    @Test
    public void testDuplicate() throws Exception {
        myList.duplicate(4);
//TODO: Test goes here...
    }

    /**
     * Method: after()
     */
    @Test
    public void testAfter() throws Exception {
        myList.after();
//TODO: Test goes here... 
    }

    /**
     * Method: item()
     */
    @Test
    public void testItem() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: has(String a_item)
     */
    @Test
    public void testHas() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: off()
     */
    @Test
    public void testOff() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: count()
     */
    @Test
    public void testCount() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: extend(String a_item)
     */
    @Test
    public void testExtend() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: remove()
     */
    @Test
    public void testRemove() throws Exception {
//TODO: Test goes here... 
    }


    /**
     * Method: start()
     */
    @Test
    public void testStart() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = MyList.getClass().getMethod("start"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: forth()
     */
    @Test
    public void testForth() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = MyList.getClass().getMethod("forth"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

} 
