/*
 * RequestBean1Test.java
 * JUnit based test
 *
 * Created on January 14, 2007, 2:13 AM
 */

package timesheetmanagement;

import junit.framework.*;
import com.sun.rave.web.ui.appbase.AbstractRequestBean;
import javax.faces.FacesException;

/**
 *
 * @author shoukat
 */
public class RequestBean1Test extends TestCase {
    
    public RequestBean1Test(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(RequestBean1Test.class);
        
        return suite;
    }

    /**
     * Test of init method, of class timesheetmanagement.RequestBean1.
     */
    public void testInit() {
        System.out.println("init");
        
        RequestBean1 instance = new RequestBean1();
        
        instance.init();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class timesheetmanagement.RequestBean1.
     */
    public void testDestroy() {
        System.out.println("destroy");
        
        RequestBean1 instance = new RequestBean1();
        
        instance.destroy();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSessionBean1 method, of class timesheetmanagement.RequestBean1.
     */
    public void testGetSessionBean1() {
        System.out.println("getSessionBean1");
        
        RequestBean1 instance = new RequestBean1();
        
        SessionBean1 expResult = null;
        SessionBean1 result = instance.getSessionBean1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApplicationBean1 method, of class timesheetmanagement.RequestBean1.
     */
    public void testGetApplicationBean1() {
        System.out.println("getApplicationBean1");
        
        RequestBean1 instance = new RequestBean1();
        
        ApplicationBean1 expResult = null;
        ApplicationBean1 result = instance.getApplicationBean1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
