/*
 * HibernateUtilTest.java
 * JUnit based test
 *
 * Created on January 14, 2007, 2:13 AM
 */

package Buissness;

import junit.framework.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

/**
 *
 * @author shoukat
 */
public class HibernateUtilTest extends TestCase {
    
    public HibernateUtilTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(HibernateUtilTest.class);
        
        return suite;
    }

    /**
     * Test of currentSession method, of class Buissness.HibernateUtil.
     */
    public void testCurrentSession() {
        System.out.println("currentSession");
        
        Session expResult = null;
        Session result = HibernateUtil.currentSession();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeSession method, of class Buissness.HibernateUtil.
     */
    public void testCloseSession() {
        System.out.println("closeSession");
        
        HibernateUtil.closeSession();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
