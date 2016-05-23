package polyu_af;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * MyListMain Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>二月 24, 2016</pre>
 */
public class MyListMainTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: main(String[] arg)
     */
    @Test
    public void testMain() throws Exception {
        MyListMain myListMain = new MyListMain();
//    String[] arg={"6","5"};
        String[] arg = {"4", "5"};
//        String[] arg = {"0", "0"};
        myListMain.main(arg);
    }


} 
