/*
 * Timesheet_hourTest.java
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
public class Timesheet_hourTest extends TestCase {
    
    public Timesheet_hourTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(Timesheet_hourTest.class);
        
        return suite;
    }

    /**
     * Test of getUsername method, of class Buissness.Timesheet_hour.
     */
    public void testGetUsername() {
        System.out.println("getUsername");
        
        Timesheet_hour instance = new Timesheet_hour();
        
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class Buissness.Timesheet_hour.
     */
    public void testSetUsername() {
        System.out.println("setUsername");
        
        String username = "";
        Timesheet_hour instance = new Timesheet_hour();
        
        instance.setUsername(username);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegular_hour method, of class Buissness.Timesheet_hour.
     */
    public void testGetRegular_hour() {
        System.out.println("getRegular_hour");
        
        Timesheet_hour instance = new Timesheet_hour();
        
        int expResult = 0;
        int result = instance.getRegular_hour();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegular_hour method, of class Buissness.Timesheet_hour.
     */
    public void testSetRegular_hour() {
        System.out.println("setRegular_hour");
        
        int regular_hour = 0;
        Timesheet_hour instance = new Timesheet_hour();
        
        instance.setRegular_hour(regular_hour);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOver_time method, of class Buissness.Timesheet_hour.
     */
    public void testGetOver_time() {
        System.out.println("getOver_time");
        
        Timesheet_hour instance = new Timesheet_hour();
        
        int expResult = 0;
        int result = instance.getOver_time();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOver_time method, of class Buissness.Timesheet_hour.
     */
    public void testSetOver_time() {
        System.out.println("setOver_time");
        
        int over_time = 0;
        Timesheet_hour instance = new Timesheet_hour();
        
        instance.setOver_time(over_time);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getT_date method, of class Buissness.Timesheet_hour.
     */
    public void testGetT_date() {
        System.out.println("getT_date");
        
        Timesheet_hour instance = new Timesheet_hour();
        
        String expResult = "";
        String result = instance.getT_date();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setT_date method, of class Buissness.Timesheet_hour.
     */
    public void testSetT_date() {
        System.out.println("setT_date");
        
        String t_date = "";
        Timesheet_hour instance = new Timesheet_hour();
        
        instance.setT_date(t_date);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDay method, of class Buissness.Timesheet_hour.
     */
    public void testGetDay() {
        System.out.println("getDay");
        
        Timesheet_hour instance = new Timesheet_hour();
        
        int expResult = 0;
        int result = instance.getDay();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDay method, of class Buissness.Timesheet_hour.
     */
    public void testSetDay() {
        System.out.println("setDay");
        
        int day = 0;
        Timesheet_hour instance = new Timesheet_hour();
        
        instance.setDay(day);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComment method, of class Buissness.Timesheet_hour.
     */
    public void testGetComment() {
        System.out.println("getComment");
        
        Timesheet_hour instance = new Timesheet_hour();
        
        String expResult = "";
        String result = instance.getComment();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComment method, of class Buissness.Timesheet_hour.
     */
    public void testSetComment() {
        System.out.println("setComment");
        
        String comment = "";
        Timesheet_hour instance = new Timesheet_hour();
        
        instance.setComment(comment);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Buissness.Timesheet_hour.
     */
    public void testGetId() {
        System.out.println("getId");
        
        Timesheet_hour instance = new Timesheet_hour();
        
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Buissness.Timesheet_hour.
     */
    public void testSetId() {
        System.out.println("setId");
        
        String id = "";
        Timesheet_hour instance = new Timesheet_hour();
        
        instance.setId(id);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
