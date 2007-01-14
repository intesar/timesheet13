/*
 * Page1Test.java
 * JUnit based test
 *
 * Created on January 14, 2007, 2:13 AM
 */

package timesheetmanagement;

import junit.framework.*;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Listbox;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.Table;
import com.sun.rave.web.ui.component.TableColumn;
import com.sun.rave.web.ui.component.TableRowGroup;
import com.sun.rave.web.ui.component.TextArea;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.model.DefaultOptionsList;
import com.sun.rave.web.ui.model.DefaultTableDataProvider;
import javax.faces.FacesException;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author shoukat
 */
public class Page1Test extends TestCase {
    
    public Page1Test(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(Page1Test.class);
        
        return suite;
    }

    /**
     * Test of getPage1 method, of class timesheetmanagement.Page1.
     */
    public void testGetPage1() {
        System.out.println("getPage1");
        
        Page1 instance = new Page1();
        
        Page expResult = null;
        Page result = instance.getPage1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPage1 method, of class timesheetmanagement.Page1.
     */
    public void testSetPage1() {
        System.out.println("setPage1");
        
        Page p = null;
        Page1 instance = new Page1();
        
        instance.setPage1(p);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHtml1 method, of class timesheetmanagement.Page1.
     */
    public void testGetHtml1() {
        System.out.println("getHtml1");
        
        Page1 instance = new Page1();
        
        Html expResult = null;
        Html result = instance.getHtml1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHtml1 method, of class timesheetmanagement.Page1.
     */
    public void testSetHtml1() {
        System.out.println("setHtml1");
        
        Html h = null;
        Page1 instance = new Page1();
        
        instance.setHtml1(h);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHead1 method, of class timesheetmanagement.Page1.
     */
    public void testGetHead1() {
        System.out.println("getHead1");
        
        Page1 instance = new Page1();
        
        Head expResult = null;
        Head result = instance.getHead1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHead1 method, of class timesheetmanagement.Page1.
     */
    public void testSetHead1() {
        System.out.println("setHead1");
        
        Head h = null;
        Page1 instance = new Page1();
        
        instance.setHead1(h);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLink1 method, of class timesheetmanagement.Page1.
     */
    public void testGetLink1() {
        System.out.println("getLink1");
        
        Page1 instance = new Page1();
        
        Link expResult = null;
        Link result = instance.getLink1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLink1 method, of class timesheetmanagement.Page1.
     */
    public void testSetLink1() {
        System.out.println("setLink1");
        
        Link l = null;
        Page1 instance = new Page1();
        
        instance.setLink1(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBody1 method, of class timesheetmanagement.Page1.
     */
    public void testGetBody1() {
        System.out.println("getBody1");
        
        Page1 instance = new Page1();
        
        Body expResult = null;
        Body result = instance.getBody1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBody1 method, of class timesheetmanagement.Page1.
     */
    public void testSetBody1() {
        System.out.println("setBody1");
        
        Body b = null;
        Page1 instance = new Page1();
        
        instance.setBody1(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getForm1 method, of class timesheetmanagement.Page1.
     */
    public void testGetForm1() {
        System.out.println("getForm1");
        
        Page1 instance = new Page1();
        
        Form expResult = null;
        Form result = instance.getForm1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setForm1 method, of class timesheetmanagement.Page1.
     */
    public void testSetForm1() {
        System.out.println("setForm1");
        
        Form f = null;
        Page1 instance = new Page1();
        
        instance.setForm1(f);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListbox1 method, of class timesheetmanagement.Page1.
     */
    public void testGetListbox1() {
        System.out.println("getListbox1");
        
        Page1 instance = new Page1();
        
        Listbox expResult = null;
        Listbox result = instance.getListbox1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListbox1 method, of class timesheetmanagement.Page1.
     */
    public void testSetListbox1() {
        System.out.println("setListbox1");
        
        Listbox l = null;
        Page1 instance = new Page1();
        
        instance.setListbox1(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListbox1DefaultOptions method, of class timesheetmanagement.Page1.
     */
    public void testGetListbox1DefaultOptions() {
        System.out.println("getListbox1DefaultOptions");
        
        Page1 instance = new Page1();
        
        DefaultOptionsList expResult = null;
        DefaultOptionsList result = instance.getListbox1DefaultOptions();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListbox1DefaultOptions method, of class timesheetmanagement.Page1.
     */
    public void testSetListbox1DefaultOptions() {
        System.out.println("setListbox1DefaultOptions");
        
        DefaultOptionsList dol = null;
        Page1 instance = new Page1();
        
        instance.setListbox1DefaultOptions(dol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRh1 method, of class timesheetmanagement.Page1.
     */
    public void testGetRh1() {
        System.out.println("getRh1");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getRh1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRh1 method, of class timesheetmanagement.Page1.
     */
    public void testSetRh1() {
        System.out.println("setRh1");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setRh1(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEh1 method, of class timesheetmanagement.Page1.
     */
    public void testGetEh1() {
        System.out.println("getEh1");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getEh1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEh1 method, of class timesheetmanagement.Page1.
     */
    public void testSetEh1() {
        System.out.println("setEh1");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setEh1(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRh2 method, of class timesheetmanagement.Page1.
     */
    public void testGetRh2() {
        System.out.println("getRh2");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getRh2();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRh2 method, of class timesheetmanagement.Page1.
     */
    public void testSetRh2() {
        System.out.println("setRh2");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setRh2(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEh2 method, of class timesheetmanagement.Page1.
     */
    public void testGetEh2() {
        System.out.println("getEh2");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getEh2();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEh2 method, of class timesheetmanagement.Page1.
     */
    public void testSetEh2() {
        System.out.println("setEh2");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setEh2(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRh3 method, of class timesheetmanagement.Page1.
     */
    public void testGetRh3() {
        System.out.println("getRh3");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getRh3();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRh3 method, of class timesheetmanagement.Page1.
     */
    public void testSetRh3() {
        System.out.println("setRh3");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setRh3(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEh3 method, of class timesheetmanagement.Page1.
     */
    public void testGetEh3() {
        System.out.println("getEh3");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getEh3();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEh3 method, of class timesheetmanagement.Page1.
     */
    public void testSetEh3() {
        System.out.println("setEh3");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setEh3(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRh4 method, of class timesheetmanagement.Page1.
     */
    public void testGetRh4() {
        System.out.println("getRh4");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getRh4();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRh4 method, of class timesheetmanagement.Page1.
     */
    public void testSetRh4() {
        System.out.println("setRh4");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setRh4(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEh4 method, of class timesheetmanagement.Page1.
     */
    public void testGetEh4() {
        System.out.println("getEh4");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getEh4();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEh4 method, of class timesheetmanagement.Page1.
     */
    public void testSetEh4() {
        System.out.println("setEh4");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setEh4(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRh5 method, of class timesheetmanagement.Page1.
     */
    public void testGetRh5() {
        System.out.println("getRh5");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getRh5();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRh5 method, of class timesheetmanagement.Page1.
     */
    public void testSetRh5() {
        System.out.println("setRh5");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setRh5(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEh5 method, of class timesheetmanagement.Page1.
     */
    public void testGetEh5() {
        System.out.println("getEh5");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getEh5();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEh5 method, of class timesheetmanagement.Page1.
     */
    public void testSetEh5() {
        System.out.println("setEh5");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setEh5(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRh6 method, of class timesheetmanagement.Page1.
     */
    public void testGetRh6() {
        System.out.println("getRh6");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getRh6();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRh6 method, of class timesheetmanagement.Page1.
     */
    public void testSetRh6() {
        System.out.println("setRh6");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setRh6(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEh6 method, of class timesheetmanagement.Page1.
     */
    public void testGetEh6() {
        System.out.println("getEh6");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getEh6();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEh6 method, of class timesheetmanagement.Page1.
     */
    public void testSetEh6() {
        System.out.println("setEh6");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setEh6(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRh7 method, of class timesheetmanagement.Page1.
     */
    public void testGetRh7() {
        System.out.println("getRh7");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getRh7();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRh7 method, of class timesheetmanagement.Page1.
     */
    public void testSetRh7() {
        System.out.println("setRh7");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setRh7(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEh7 method, of class timesheetmanagement.Page1.
     */
    public void testGetEh7() {
        System.out.println("getEh7");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getEh7();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEh7 method, of class timesheetmanagement.Page1.
     */
    public void testSetEh7() {
        System.out.println("setEh7");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setEh7(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRh8 method, of class timesheetmanagement.Page1.
     */
    public void testGetRh8() {
        System.out.println("getRh8");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getRh8();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRh8 method, of class timesheetmanagement.Page1.
     */
    public void testSetRh8() {
        System.out.println("setRh8");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setRh8(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEh8 method, of class timesheetmanagement.Page1.
     */
    public void testGetEh8() {
        System.out.println("getEh8");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getEh8();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEh8 method, of class timesheetmanagement.Page1.
     */
    public void testSetEh8() {
        System.out.println("setEh8");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setEh8(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRh9 method, of class timesheetmanagement.Page1.
     */
    public void testGetRh9() {
        System.out.println("getRh9");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getRh9();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRh9 method, of class timesheetmanagement.Page1.
     */
    public void testSetRh9() {
        System.out.println("setRh9");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setRh9(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEh9 method, of class timesheetmanagement.Page1.
     */
    public void testGetEh9() {
        System.out.println("getEh9");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getEh9();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEh9 method, of class timesheetmanagement.Page1.
     */
    public void testSetEh9() {
        System.out.println("setEh9");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setEh9(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRh10 method, of class timesheetmanagement.Page1.
     */
    public void testGetRh10() {
        System.out.println("getRh10");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getRh10();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRh10 method, of class timesheetmanagement.Page1.
     */
    public void testSetRh10() {
        System.out.println("setRh10");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setRh10(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEh10 method, of class timesheetmanagement.Page1.
     */
    public void testGetEh10() {
        System.out.println("getEh10");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getEh10();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEh10 method, of class timesheetmanagement.Page1.
     */
    public void testSetEh10() {
        System.out.println("setEh10");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setEh10(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRh11 method, of class timesheetmanagement.Page1.
     */
    public void testGetRh11() {
        System.out.println("getRh11");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getRh11();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRh11 method, of class timesheetmanagement.Page1.
     */
    public void testSetRh11() {
        System.out.println("setRh11");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setRh11(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEh11 method, of class timesheetmanagement.Page1.
     */
    public void testGetEh11() {
        System.out.println("getEh11");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getEh11();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEh11 method, of class timesheetmanagement.Page1.
     */
    public void testSetEh11() {
        System.out.println("setEh11");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setEh11(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRh12 method, of class timesheetmanagement.Page1.
     */
    public void testGetRh12() {
        System.out.println("getRh12");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getRh12();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRh12 method, of class timesheetmanagement.Page1.
     */
    public void testSetRh12() {
        System.out.println("setRh12");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setRh12(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEh12 method, of class timesheetmanagement.Page1.
     */
    public void testGetEh12() {
        System.out.println("getEh12");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getEh12();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEh12 method, of class timesheetmanagement.Page1.
     */
    public void testSetEh12() {
        System.out.println("setEh12");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setEh12(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRh13 method, of class timesheetmanagement.Page1.
     */
    public void testGetRh13() {
        System.out.println("getRh13");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getRh13();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRh13 method, of class timesheetmanagement.Page1.
     */
    public void testSetRh13() {
        System.out.println("setRh13");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setRh13(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEh13 method, of class timesheetmanagement.Page1.
     */
    public void testGetEh13() {
        System.out.println("getEh13");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getEh13();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEh13 method, of class timesheetmanagement.Page1.
     */
    public void testSetEh13() {
        System.out.println("setEh13");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setEh13(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRh14 method, of class timesheetmanagement.Page1.
     */
    public void testGetRh14() {
        System.out.println("getRh14");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getRh14();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRh14 method, of class timesheetmanagement.Page1.
     */
    public void testSetRh14() {
        System.out.println("setRh14");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setRh14(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEh14 method, of class timesheetmanagement.Page1.
     */
    public void testGetEh14() {
        System.out.println("getEh14");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getEh14();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEh14 method, of class timesheetmanagement.Page1.
     */
    public void testSetEh14() {
        System.out.println("setEh14");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setEh14(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRh15 method, of class timesheetmanagement.Page1.
     */
    public void testGetRh15() {
        System.out.println("getRh15");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getRh15();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRh15 method, of class timesheetmanagement.Page1.
     */
    public void testSetRh15() {
        System.out.println("setRh15");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setRh15(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEh15 method, of class timesheetmanagement.Page1.
     */
    public void testGetEh15() {
        System.out.println("getEh15");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getEh15();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEh15 method, of class timesheetmanagement.Page1.
     */
    public void testSetEh15() {
        System.out.println("setEh15");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setEh15(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel1 method, of class timesheetmanagement.Page1.
     */
    public void testGetLabel1() {
        System.out.println("getLabel1");
        
        Page1 instance = new Page1();
        
        Label expResult = null;
        Label result = instance.getLabel1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel1 method, of class timesheetmanagement.Page1.
     */
    public void testSetLabel1() {
        System.out.println("setLabel1");
        
        Label l = null;
        Page1 instance = new Page1();
        
        instance.setLabel1(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel2 method, of class timesheetmanagement.Page1.
     */
    public void testGetLabel2() {
        System.out.println("getLabel2");
        
        Page1 instance = new Page1();
        
        Label expResult = null;
        Label result = instance.getLabel2();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel2 method, of class timesheetmanagement.Page1.
     */
    public void testSetLabel2() {
        System.out.println("setLabel2");
        
        Label l = null;
        Page1 instance = new Page1();
        
        instance.setLabel2(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel3 method, of class timesheetmanagement.Page1.
     */
    public void testGetLabel3() {
        System.out.println("getLabel3");
        
        Page1 instance = new Page1();
        
        Label expResult = null;
        Label result = instance.getLabel3();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel3 method, of class timesheetmanagement.Page1.
     */
    public void testSetLabel3() {
        System.out.println("setLabel3");
        
        Label l = null;
        Page1 instance = new Page1();
        
        instance.setLabel3(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel4 method, of class timesheetmanagement.Page1.
     */
    public void testGetLabel4() {
        System.out.println("getLabel4");
        
        Page1 instance = new Page1();
        
        Label expResult = null;
        Label result = instance.getLabel4();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel4 method, of class timesheetmanagement.Page1.
     */
    public void testSetLabel4() {
        System.out.println("setLabel4");
        
        Label l = null;
        Page1 instance = new Page1();
        
        instance.setLabel4(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel5 method, of class timesheetmanagement.Page1.
     */
    public void testGetLabel5() {
        System.out.println("getLabel5");
        
        Page1 instance = new Page1();
        
        Label expResult = null;
        Label result = instance.getLabel5();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel5 method, of class timesheetmanagement.Page1.
     */
    public void testSetLabel5() {
        System.out.println("setLabel5");
        
        Label l = null;
        Page1 instance = new Page1();
        
        instance.setLabel5(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel6 method, of class timesheetmanagement.Page1.
     */
    public void testGetLabel6() {
        System.out.println("getLabel6");
        
        Page1 instance = new Page1();
        
        Label expResult = null;
        Label result = instance.getLabel6();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel6 method, of class timesheetmanagement.Page1.
     */
    public void testSetLabel6() {
        System.out.println("setLabel6");
        
        Label l = null;
        Page1 instance = new Page1();
        
        instance.setLabel6(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel7 method, of class timesheetmanagement.Page1.
     */
    public void testGetLabel7() {
        System.out.println("getLabel7");
        
        Page1 instance = new Page1();
        
        Label expResult = null;
        Label result = instance.getLabel7();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel7 method, of class timesheetmanagement.Page1.
     */
    public void testSetLabel7() {
        System.out.println("setLabel7");
        
        Label l = null;
        Page1 instance = new Page1();
        
        instance.setLabel7(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel8 method, of class timesheetmanagement.Page1.
     */
    public void testGetLabel8() {
        System.out.println("getLabel8");
        
        Page1 instance = new Page1();
        
        Label expResult = null;
        Label result = instance.getLabel8();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel8 method, of class timesheetmanagement.Page1.
     */
    public void testSetLabel8() {
        System.out.println("setLabel8");
        
        Label l = null;
        Page1 instance = new Page1();
        
        instance.setLabel8(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel9 method, of class timesheetmanagement.Page1.
     */
    public void testGetLabel9() {
        System.out.println("getLabel9");
        
        Page1 instance = new Page1();
        
        Label expResult = null;
        Label result = instance.getLabel9();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel9 method, of class timesheetmanagement.Page1.
     */
    public void testSetLabel9() {
        System.out.println("setLabel9");
        
        Label l = null;
        Page1 instance = new Page1();
        
        instance.setLabel9(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel10 method, of class timesheetmanagement.Page1.
     */
    public void testGetLabel10() {
        System.out.println("getLabel10");
        
        Page1 instance = new Page1();
        
        Label expResult = null;
        Label result = instance.getLabel10();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel10 method, of class timesheetmanagement.Page1.
     */
    public void testSetLabel10() {
        System.out.println("setLabel10");
        
        Label l = null;
        Page1 instance = new Page1();
        
        instance.setLabel10(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel11 method, of class timesheetmanagement.Page1.
     */
    public void testGetLabel11() {
        System.out.println("getLabel11");
        
        Page1 instance = new Page1();
        
        Label expResult = null;
        Label result = instance.getLabel11();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel11 method, of class timesheetmanagement.Page1.
     */
    public void testSetLabel11() {
        System.out.println("setLabel11");
        
        Label l = null;
        Page1 instance = new Page1();
        
        instance.setLabel11(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel12 method, of class timesheetmanagement.Page1.
     */
    public void testGetLabel12() {
        System.out.println("getLabel12");
        
        Page1 instance = new Page1();
        
        Label expResult = null;
        Label result = instance.getLabel12();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel12 method, of class timesheetmanagement.Page1.
     */
    public void testSetLabel12() {
        System.out.println("setLabel12");
        
        Label l = null;
        Page1 instance = new Page1();
        
        instance.setLabel12(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel13 method, of class timesheetmanagement.Page1.
     */
    public void testGetLabel13() {
        System.out.println("getLabel13");
        
        Page1 instance = new Page1();
        
        Label expResult = null;
        Label result = instance.getLabel13();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel13 method, of class timesheetmanagement.Page1.
     */
    public void testSetLabel13() {
        System.out.println("setLabel13");
        
        Label l = null;
        Page1 instance = new Page1();
        
        instance.setLabel13(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel14 method, of class timesheetmanagement.Page1.
     */
    public void testGetLabel14() {
        System.out.println("getLabel14");
        
        Page1 instance = new Page1();
        
        Label expResult = null;
        Label result = instance.getLabel14();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel14 method, of class timesheetmanagement.Page1.
     */
    public void testSetLabel14() {
        System.out.println("setLabel14");
        
        Label l = null;
        Page1 instance = new Page1();
        
        instance.setLabel14(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel15 method, of class timesheetmanagement.Page1.
     */
    public void testGetLabel15() {
        System.out.println("getLabel15");
        
        Page1 instance = new Page1();
        
        Label expResult = null;
        Label result = instance.getLabel15();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel15 method, of class timesheetmanagement.Page1.
     */
    public void testSetLabel15() {
        System.out.println("setLabel15");
        
        Label l = null;
        Page1 instance = new Page1();
        
        instance.setLabel15(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel16 method, of class timesheetmanagement.Page1.
     */
    public void testGetLabel16() {
        System.out.println("getLabel16");
        
        Page1 instance = new Page1();
        
        Label expResult = null;
        Label result = instance.getLabel16();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel16 method, of class timesheetmanagement.Page1.
     */
    public void testSetLabel16() {
        System.out.println("setLabel16");
        
        Label l = null;
        Page1 instance = new Page1();
        
        instance.setLabel16(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel17 method, of class timesheetmanagement.Page1.
     */
    public void testGetLabel17() {
        System.out.println("getLabel17");
        
        Page1 instance = new Page1();
        
        Label expResult = null;
        Label result = instance.getLabel17();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel17 method, of class timesheetmanagement.Page1.
     */
    public void testSetLabel17() {
        System.out.println("setLabel17");
        
        Label l = null;
        Page1 instance = new Page1();
        
        instance.setLabel17(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel18 method, of class timesheetmanagement.Page1.
     */
    public void testGetLabel18() {
        System.out.println("getLabel18");
        
        Page1 instance = new Page1();
        
        Label expResult = null;
        Label result = instance.getLabel18();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel18 method, of class timesheetmanagement.Page1.
     */
    public void testSetLabel18() {
        System.out.println("setLabel18");
        
        Label l = null;
        Page1 instance = new Page1();
        
        instance.setLabel18(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel19 method, of class timesheetmanagement.Page1.
     */
    public void testGetLabel19() {
        System.out.println("getLabel19");
        
        Page1 instance = new Page1();
        
        Label expResult = null;
        Label result = instance.getLabel19();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel19 method, of class timesheetmanagement.Page1.
     */
    public void testSetLabel19() {
        System.out.println("setLabel19");
        
        Label l = null;
        Page1 instance = new Page1();
        
        instance.setLabel19(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField31 method, of class timesheetmanagement.Page1.
     */
    public void testGetTextField31() {
        System.out.println("getTextField31");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getTextField31();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField31 method, of class timesheetmanagement.Page1.
     */
    public void testSetTextField31() {
        System.out.println("setTextField31");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setTextField31(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel20 method, of class timesheetmanagement.Page1.
     */
    public void testGetLabel20() {
        System.out.println("getLabel20");
        
        Page1 instance = new Page1();
        
        Label expResult = null;
        Label result = instance.getLabel20();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel20 method, of class timesheetmanagement.Page1.
     */
    public void testSetLabel20() {
        System.out.println("setLabel20");
        
        Label l = null;
        Page1 instance = new Page1();
        
        instance.setLabel20(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField32 method, of class timesheetmanagement.Page1.
     */
    public void testGetTextField32() {
        System.out.println("getTextField32");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getTextField32();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField32 method, of class timesheetmanagement.Page1.
     */
    public void testSetTextField32() {
        System.out.println("setTextField32");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setTextField32(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel21 method, of class timesheetmanagement.Page1.
     */
    public void testGetLabel21() {
        System.out.println("getLabel21");
        
        Page1 instance = new Page1();
        
        Label expResult = null;
        Label result = instance.getLabel21();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel21 method, of class timesheetmanagement.Page1.
     */
    public void testSetLabel21() {
        System.out.println("setLabel21");
        
        Label l = null;
        Page1 instance = new Page1();
        
        instance.setLabel21(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField33 method, of class timesheetmanagement.Page1.
     */
    public void testGetTextField33() {
        System.out.println("getTextField33");
        
        Page1 instance = new Page1();
        
        TextField expResult = null;
        TextField result = instance.getTextField33();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField33 method, of class timesheetmanagement.Page1.
     */
    public void testSetTextField33() {
        System.out.println("setTextField33");
        
        TextField tf = null;
        Page1 instance = new Page1();
        
        instance.setTextField33(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton1 method, of class timesheetmanagement.Page1.
     */
    public void testGetButton1() {
        System.out.println("getButton1");
        
        Page1 instance = new Page1();
        
        Button expResult = null;
        Button result = instance.getButton1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton1 method, of class timesheetmanagement.Page1.
     */
    public void testSetButton1() {
        System.out.println("setButton1");
        
        Button b = null;
        Page1 instance = new Page1();
        
        instance.setButton1(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton2 method, of class timesheetmanagement.Page1.
     */
    public void testGetButton2() {
        System.out.println("getButton2");
        
        Page1 instance = new Page1();
        
        Button expResult = null;
        Button result = instance.getButton2();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton2 method, of class timesheetmanagement.Page1.
     */
    public void testSetButton2() {
        System.out.println("setButton2");
        
        Button b = null;
        Page1 instance = new Page1();
        
        instance.setButton2(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel22 method, of class timesheetmanagement.Page1.
     */
    public void testGetLabel22() {
        System.out.println("getLabel22");
        
        Page1 instance = new Page1();
        
        Label expResult = null;
        Label result = instance.getLabel22();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel22 method, of class timesheetmanagement.Page1.
     */
    public void testSetLabel22() {
        System.out.println("setLabel22");
        
        Label l = null;
        Page1 instance = new Page1();
        
        instance.setLabel22(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton3 method, of class timesheetmanagement.Page1.
     */
    public void testGetButton3() {
        System.out.println("getButton3");
        
        Page1 instance = new Page1();
        
        Button expResult = null;
        Button result = instance.getButton3();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton3 method, of class timesheetmanagement.Page1.
     */
    public void testSetButton3() {
        System.out.println("setButton3");
        
        Button b = null;
        Page1 instance = new Page1();
        
        instance.setButton3(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class timesheetmanagement.Page1.
     */
    public void testInit() {
        System.out.println("init");
        
        Page1 instance = new Page1();
        
        instance.init();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preprocess method, of class timesheetmanagement.Page1.
     */
    public void testPreprocess() {
        System.out.println("preprocess");
        
        Page1 instance = new Page1();
        
        instance.preprocess();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prerender method, of class timesheetmanagement.Page1.
     */
    public void testPrerender() {
        System.out.println("prerender");
        
        Page1 instance = new Page1();
        
        instance.prerender();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class timesheetmanagement.Page1.
     */
    public void testDestroy() {
        System.out.println("destroy");
        
        Page1 instance = new Page1();
        
        instance.destroy();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSessionBean1 method, of class timesheetmanagement.Page1.
     */
    public void testGetSessionBean1() {
        System.out.println("getSessionBean1");
        
        Page1 instance = new Page1();
        
        SessionBean1 expResult = null;
        SessionBean1 result = instance.getSessionBean1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApplicationBean1 method, of class timesheetmanagement.Page1.
     */
    public void testGetApplicationBean1() {
        System.out.println("getApplicationBean1");
        
        Page1 instance = new Page1();
        
        ApplicationBean1 expResult = null;
        ApplicationBean1 result = instance.getApplicationBean1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestBean1 method, of class timesheetmanagement.Page1.
     */
    public void testGetRequestBean1() {
        System.out.println("getRequestBean1");
        
        Page1 instance = new Page1();
        
        RequestBean1 expResult = null;
        RequestBean1 result = instance.getRequestBean1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eh9_processValueChange method, of class timesheetmanagement.Page1.
     */
    public void testEh9_processValueChange() {
        System.out.println("eh9_processValueChange");
        
        ValueChangeEvent event = null;
        Page1 instance = new Page1();
        
        instance.eh9_processValueChange(event);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eh7_processValueChange method, of class timesheetmanagement.Page1.
     */
    public void testEh7_processValueChange() {
        System.out.println("eh7_processValueChange");
        
        ValueChangeEvent event = null;
        Page1 instance = new Page1();
        
        instance.eh7_processValueChange(event);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
