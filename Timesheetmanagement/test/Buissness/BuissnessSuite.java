/*
 * BuissnessSuite.java
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
public class BuissnessSuite extends TestCase {
    
    public BuissnessSuite(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    /**
     * suite method automatically generated by JUnit module
     */
    public static Test suite() {
        TestSuite suite = new TestSuite("BuissnessSuite");
        suite.addTest(Buissness.Timesheet_hourTest.suite());
        suite.addTest(Buissness.timesheetTest.suite());
        suite.addTest(Buissness.employee_clientTest.suite());
        suite.addTest(Buissness.EmployeeTest.suite());
        suite.addTest(Buissness.HibernateUtilTest.suite());
        return suite;
    }
    
}
