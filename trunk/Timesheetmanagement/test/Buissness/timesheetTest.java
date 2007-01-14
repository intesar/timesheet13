/*
 * timesheetTest.java
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
public class timesheetTest extends TestCase {
    
    public timesheetTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(timesheetTest.class);
        
        return suite;
    }

    /**
     * Test of getT_date method, of class Buissness.timesheet.
     */
    public void testGetT_date() {
        System.out.println("getT_date");
        
        timesheet instance = new timesheet();
        
        String expResult = "";
        String result = instance.getT_date();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setT_date method, of class Buissness.timesheet.
     */
    public void testSetT_date() {
        System.out.println("setT_date");
        
        String t_date = "";
        timesheet instance = new timesheet();
        
        instance.setT_date(t_date);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class Buissness.timesheet.
     */
    public void testGetUsername() {
        System.out.println("getUsername");
        
        timesheet instance = new timesheet();
        
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class Buissness.timesheet.
     */
    public void testSetUsername() {
        System.out.println("setUsername");
        
        String username = "";
        timesheet instance = new timesheet();
        
        instance.setUsername(username);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Buissness.timesheet.
     */
    public void testGetStatus() {
        System.out.println("getStatus");
        
        timesheet instance = new timesheet();
        
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Buissness.timesheet.
     */
    public void testSetStatus() {
        System.out.println("setStatus");
        
        String status = "";
        timesheet instance = new timesheet();
        
        instance.setStatus(status);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBilled method, of class Buissness.timesheet.
     */
    public void testGetBilled() {
        System.out.println("getBilled");
        
        timesheet instance = new timesheet();
        
        String expResult = "";
        String result = instance.getBilled();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBilled method, of class Buissness.timesheet.
     */
    public void testSetBilled() {
        System.out.println("setBilled");
        
        String billed = "";
        timesheet instance = new timesheet();
        
        instance.setBilled(billed);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPayed method, of class Buissness.timesheet.
     */
    public void testGetPayed() {
        System.out.println("getPayed");
        
        timesheet instance = new timesheet();
        
        String expResult = "";
        String result = instance.getPayed();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPayed method, of class Buissness.timesheet.
     */
    public void testSetPayed() {
        System.out.println("setPayed");
        
        String payed = "";
        timesheet instance = new timesheet();
        
        instance.setPayed(payed);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Buissness.timesheet.
     */
    public void testGetId() {
        System.out.println("getId");
        
        timesheet instance = new timesheet();
        
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Buissness.timesheet.
     */
    public void testSetId() {
        System.out.println("setId");
        
        String id = "";
        timesheet instance = new timesheet();
        
        instance.setId(id);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
