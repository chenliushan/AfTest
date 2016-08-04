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
    public void testDuplicateNotEmpty() throws Exception {
        myList.extend("a");
        myList.extend("b");
        MyList dupList=myList.duplicate(1);
    }

    /**
     * Method: duplicate(int n)
     */
    @Test
    public void testDuplicateEmpty() throws Exception {
        myList.duplicate(1);
    }

}
