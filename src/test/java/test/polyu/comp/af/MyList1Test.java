package test.polyu.comp.af;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import polyu_af.MyList1;

/**
 * MyList1 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>五月 12, 2016</pre>
 */
public class MyList1Test {
    MyList1 myList = null;

    @Before
    public void before() throws Exception {
        myList = new MyList1(2);
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: duplicate(int n)
     */
    @Test
    public void testDuplicate() throws Exception {
        assert myList.duplicate(3).size()==2;
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
     * Method: extend(ArrayList<String> result, String a_item)
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
     * Method: publicMethod(String p1)
     */
    @Test
    public void testPublicMethod() throws Exception {
//TODO: Test goes here...
    }


    /**
     * Method: forth()
     */
    @Test
    public void testForth() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = MyList1.getClass().getMethod("forth"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

} 
