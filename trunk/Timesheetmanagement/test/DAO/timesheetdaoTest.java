/*
 * timesheetdaoTest.java
 * JUnit based test
 *
 * Created on January 14, 2007, 2:13 AM
 */

package DAO;

import junit.framework.*;
import Buissness.Employee;
import Buissness.HibernateUtil;
import Buissness.timesheet;
import javax.transaction.SystemException;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

/**
 *
 * @author shoukat
 */
public class timesheetdaoTest extends TestCase {
    
    public timesheetdaoTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(timesheetdaoTest.class);
        
        return suite;
    }

    /**
     * Test of save method, of class DAO.timesheetdao.
     */
    public void testSave() throws Exception {
        System.out.println("save");
        
        timesheet e = null;
        timesheetdao instance = new timesheetdao();
        
        instance.save(e);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class DAO.timesheetdao.
     */
    public void testUpdate() throws Exception {
        System.out.println("update");
        
        timesheet u = null;
        timesheetdao instance = new timesheetdao();
        
        instance.update(u);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class DAO.timesheetdao.
     */
    public void testDelete() throws Exception {
        System.out.println("delete");
        
        timesheet u = null;
        timesheetdao instance = new timesheetdao();
        
        instance.delete(u);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findbyusername method, of class DAO.timesheetdao.
     */
    public void testFindbyusername() {
        System.out.println("findbyusername");
        
        String username = "";
        timesheetdao instance = new timesheetdao();
        
        Employee expResult = null;
        Employee result = instance.findbyusername(username);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
