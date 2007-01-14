/*
 * EmployeeTest.java
 * JUnit based test
 *
 * Created on January 14, 2007, 2:13 AM
 */

package Buissness;

import junit.framework.*;

/**
 *
 * @author shoukat
 */
public class EmployeeTest extends TestCase {
    
    public EmployeeTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(EmployeeTest.class);
        
        return suite;
    }

    /**
     * Test of getUsername method, of class Buissness.Employee.
     */
    public void testGetUsername() {
        System.out.println("getUsername");
        
        Employee instance = new Employee();
        
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class Buissness.Employee.
     */
    public void testSetUsername() {
        System.out.println("setUsername");
        
        String username = "";
        Employee instance = new Employee();
        
        instance.setUsername(username);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Buissness.Employee.
     */
    public void testGetPassword() {
        System.out.println("getPassword");
        
        Employee instance = new Employee();
        
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Buissness.Employee.
     */
    public void testSetPassword() {
        System.out.println("setPassword");
        
        String password = "";
        Employee instance = new Employee();
        
        instance.setPassword(password);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstname method, of class Buissness.Employee.
     */
    public void testGetFirstname() {
        System.out.println("getFirstname");
        
        Employee instance = new Employee();
        
        String expResult = "";
        String result = instance.getFirstname();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstname method, of class Buissness.Employee.
     */
    public void testSetFirstname() {
        System.out.println("setFirstname");
        
        String firstname = "";
        Employee instance = new Employee();
        
        instance.setFirstname(firstname);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastname method, of class Buissness.Employee.
     */
    public void testGetLastname() {
        System.out.println("getLastname");
        
        Employee instance = new Employee();
        
        String expResult = "";
        String result = instance.getLastname();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastname method, of class Buissness.Employee.
     */
    public void testSetLastname() {
        System.out.println("setLastname");
        
        String lastname = "";
        Employee instance = new Employee();
        
        instance.setLastname(lastname);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBirthdate method, of class Buissness.Employee.
     */
    public void testGetBirthdate() {
        System.out.println("getBirthdate");
        
        Employee instance = new Employee();
        
        String expResult = "";
        String result = instance.getBirthdate();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBirthdate method, of class Buissness.Employee.
     */
    public void testSetBirthdate() {
        System.out.println("setBirthdate");
        
        String birthdate = "";
        Employee instance = new Employee();
        
        instance.setBirthdate(birthdate);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnable method, of class Buissness.Employee.
     */
    public void testGetEnable() {
        System.out.println("getEnable");
        
        Employee instance = new Employee();
        
        int expResult = 0;
        int result = instance.getEnable();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnable method, of class Buissness.Employee.
     */
    public void testSetEnable() {
        System.out.println("setEnable");
        
        int enable = 0;
        Employee instance = new Employee();
        
        instance.setEnable(enable);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Buissness.Employee.
     */
    public void testGetId() {
        System.out.println("getId");
        
        Employee instance = new Employee();
        
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Buissness.Employee.
     */
    public void testSetId() {
        System.out.println("setId");
        
        String id = "";
        Employee instance = new Employee();
        
        instance.setId(id);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
