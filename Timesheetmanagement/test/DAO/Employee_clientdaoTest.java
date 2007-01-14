/*
 * Employee_clientdaoTest.java
 * JUnit based test
 *
 * Created on January 14, 2007, 2:13 AM
 */

package DAO;

import junit.framework.*;
import Buissness.Employee;
import Buissness.HibernateUtil;
import Buissness.employee_client;
import javax.transaction.SystemException;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

/**
 *
 * @author shoukat
 */
public class Employee_clientdaoTest extends TestCase {
    
    public Employee_clientdaoTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(Employee_clientdaoTest.class);
        
        return suite;
    }

    /**
     * Test of save method, of class DAO.Employee_clientdao.
     */
    public void testSave() throws Exception {
        System.out.println("save");
        
        employee_client e = null;
        Employee_clientdao instance = new Employee_clientdao();
        
        instance.save(e);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class DAO.Employee_clientdao.
     */
    public void testUpdate() throws Exception {
        System.out.println("update");
        
        employee_client u = null;
        Employee_clientdao instance = new Employee_clientdao();
        
        instance.update(u);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class DAO.Employee_clientdao.
     */
    public void testDelete() throws Exception {
        System.out.println("delete");
        
        employee_client u = null;
        Employee_clientdao instance = new Employee_clientdao();
        
        instance.delete(u);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findbyusername method, of class DAO.Employee_clientdao.
     */
    public void testFindbyusername() {
        System.out.println("findbyusername");
        
        String username = "";
        Employee_clientdao instance = new Employee_clientdao();
        
        Employee expResult = null;
        Employee result = instance.findbyusername(username);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
