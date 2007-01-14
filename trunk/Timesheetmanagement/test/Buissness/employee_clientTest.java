/*
 * employee_clientTest.java
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
public class employee_clientTest extends TestCase {
    
    public employee_clientTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(employee_clientTest.class);
        
        return suite;
    }

    /**
     * Test of getUsername method, of class Buissness.employee_client.
     */
    public void testGetUsername() {
        System.out.println("getUsername");
        
        employee_client instance = new employee_client();
        
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class Buissness.employee_client.
     */
    public void testSetUsername() {
        System.out.println("setUsername");
        
        String username = "";
        employee_client instance = new employee_client();
        
        instance.setUsername(username);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClient method, of class Buissness.employee_client.
     */
    public void testGetClient() {
        System.out.println("getClient");
        
        employee_client instance = new employee_client();
        
        String expResult = "";
        String result = instance.getClient();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClient method, of class Buissness.employee_client.
     */
    public void testSetClient() {
        System.out.println("setClient");
        
        String client = "";
        employee_client instance = new employee_client();
        
        instance.setClient(client);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Buissness.employee_client.
     */
    public void testGetId() {
        System.out.println("getId");
        
        employee_client instance = new employee_client();
        
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Buissness.employee_client.
     */
    public void testSetId() {
        System.out.println("setId");
        
        String id = "";
        employee_client instance = new employee_client();
        
        instance.setId(id);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
