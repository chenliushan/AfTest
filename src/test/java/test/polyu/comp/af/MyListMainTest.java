package test.polyu.comp.af;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import polyu.comp.af.MyListMain;

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
//TODO: Test goes here...
        MyListMain myListMain = new MyListMain();
//    String[] arg={"6","5"};
//    String[] arg={"4","5"};
        String[] arg = {"0", "0"};
        myListMain.main(arg);
    }


} 
