/*
 * Timesheet_hourdaoTest.java
 * JUnit based test
 *
 * Created on January 14, 2007, 2:13 AM
 */

package DAO;

import junit.framework.*;
import Buissness.Employee;
import Buissness.HibernateUtil;
import javax.transaction.SystemException;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

/**
 *
 * @author shoukat
 */
public class Timesheet_hourdaoTest extends TestCase {
    
    public Timesheet_hourdaoTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(Timesheet_hourdaoTest.class);
        
        return suite;
    }

    /**
     * Test of save method, of class DAO.Timesheet_hourdao.
     */
    public void testSave() throws Exception {
        System.out.println("save");
        
        Timesheet_hourdao t = null;
        Timesheet_hourdao instance = new Timesheet_hourdao();
        
        instance.save(t);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class DAO.Timesheet_hourdao.
     */
    public void testUpdate() throws Exception {
        System.out.println("update");
        
        Timesheet_hourdao u = null;
        Timesheet_hourdao instance = new Timesheet_hourdao();
        
        instance.update(u);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class DAO.Timesheet_hourdao.
     */
    public void testDelete() throws Exception {
        System.out.println("delete");
        
        Timesheet_hourdao u = null;
        Timesheet_hourdao instance = new Timesheet_hourdao();
        
        instance.delete(u);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findbyusername method, of class DAO.Timesheet_hourdao.
     */
    public void testFindbyusername() {
        System.out.println("findbyusername");
        
        String username = "";
        Timesheet_hourdao instance = new Timesheet_hourdao();
        
        Employee expResult = null;
        Employee result = instance.findbyusername(username);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
