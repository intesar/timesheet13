/*
 * EmployeedaoTest.java
 * JUnit based test
 *
 * Created on January 14, 2007, 2:13 AM
 */

package DAO;

import junit.framework.*;
import Buissness.Employee;
import Buissness.HibernateUtil;
import javax.transaction.SystemException;
import javax.transaction.Transaction;
import org.hibernate.Session;

/**
 *
 * @author shoukat
 */
public class EmployeedaoTest extends TestCase {
    
    public EmployeedaoTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(EmployeedaoTest.class);
        
        return suite;
    }

    /**
     * Test of save method, of class DAO.Employeedao.
     */
    public void testSave() throws Exception {
        System.out.println("save");
        
        Employee e = null;
        Employeedao instance = new Employeedao();
        
        instance.save(e);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class DAO.Employeedao.
     */
    public void testUpdate() throws Exception {
        System.out.println("update");
        
        Employee u = null;
        Employeedao instance = new Employeedao();
        
        instance.update(u);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class DAO.Employeedao.
     */
    public void testDelete() throws Exception {
        System.out.println("delete");
        
        Employee u = null;
        Employeedao instance = new Employeedao();
        
        instance.delete(u);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findbyusername method, of class DAO.Employeedao.
     */
    public void testFindbyusername() {
        System.out.println("findbyusername");
        
        String username = "";
        Employeedao instance = new Employeedao();
        
        Employee expResult = null;
        Employee result = instance.findbyusername(username);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
