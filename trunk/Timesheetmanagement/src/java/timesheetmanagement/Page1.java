/*
 * Page1.java
 *
 * Created on January 13, 2007, 2:33 PM
 * Copyright shoukat
 */
package timesheetmanagement;

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
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class Page1 extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    
    private Page page1 = new Page();
    
    public Page getPage1() {
        return page1;
    }
    
    public void setPage1(Page p) {
        this.page1 = p;
    }
    
    private Html html1 = new Html();
    
    public Html getHtml1() {
        return html1;
    }
    
    public void setHtml1(Html h) {
        this.html1 = h;
    }
    
    private Head head1 = new Head();
    
    public Head getHead1() {
        return head1;
    }
    
    public void setHead1(Head h) {
        this.head1 = h;
    }
    
    private Link link1 = new Link();
    
    public Link getLink1() {
        return link1;
    }
    
    public void setLink1(Link l) {
        this.link1 = l;
    }
    
    private Body body1 = new Body();
    
    public Body getBody1() {
        return body1;
    }
    
    public void setBody1(Body b) {
        this.body1 = b;
    }
    
    private Form form1 = new Form();
    
    public Form getForm1() {
        return form1;
    }
    
    public void setForm1(Form f) {
        this.form1 = f;
    }

    private Listbox listbox1 = new Listbox();

    public Listbox getListbox1() {
        return listbox1;
    }

    public void setListbox1(Listbox l) {
        this.listbox1 = l;
    }

    private DefaultOptionsList listbox1DefaultOptions = new DefaultOptionsList();

    public DefaultOptionsList getListbox1DefaultOptions() {
        return listbox1DefaultOptions;
    }

    public void setListbox1DefaultOptions(DefaultOptionsList dol) {
        this.listbox1DefaultOptions = dol;
    }

    private TextField rh1 = new TextField();

    public TextField getRh1() {
        return rh1;
    }

    public void setRh1(TextField tf) {
        this.rh1 = tf;
    }

    private TextField eh1 = new TextField();

    public TextField getEh1() {
        return eh1;
    }

    public void setEh1(TextField tf) {
        this.eh1 = tf;
    }

    private TextField rh2 = new TextField();

    public TextField getRh2() {
        return rh2;
    }

    public void setRh2(TextField tf) {
        this.rh2 = tf;
    }

    private TextField eh2 = new TextField();

    public TextField getEh2() {
        return eh2;
    }

    public void setEh2(TextField tf) {
        this.eh2 = tf;
    }

    private TextField rh3 = new TextField();

    public TextField getRh3() {
        return rh3;
    }

    public void setRh3(TextField tf) {
        this.rh3 = tf;
    }

    private TextField eh3 = new TextField();

    public TextField getEh3() {
        return eh3;
    }

    public void setEh3(TextField tf) {
        this.eh3 = tf;
    }

    private TextField rh4 = new TextField();

    public TextField getRh4() {
        return rh4;
    }

    public void setRh4(TextField tf) {
        this.rh4 = tf;
    }

    private TextField eh4 = new TextField();

    public TextField getEh4() {
        return eh4;
    }

    public void setEh4(TextField tf) {
        this.eh4 = tf;
    }

    private TextField rh5 = new TextField();

    public TextField getRh5() {
        return rh5;
    }

    public void setRh5(TextField tf) {
        this.rh5 = tf;
    }

    private TextField eh5 = new TextField();

    public TextField getEh5() {
        return eh5;
    }

    public void setEh5(TextField tf) {
        this.eh5 = tf;
    }

    private TextField rh6 = new TextField();

    public TextField getRh6() {
        return rh6;
    }

    public void setRh6(TextField tf) {
        this.rh6 = tf;
    }

    private TextField eh6 = new TextField();

    public TextField getEh6() {
        return eh6;
    }

    public void setEh6(TextField tf) {
        this.eh6 = tf;
    }

    private TextField rh7 = new TextField();

    public TextField getRh7() {
        return rh7;
    }

    public void setRh7(TextField tf) {
        this.rh7 = tf;
    }

    private TextField eh7 = new TextField();

    public TextField getEh7() {
        return eh7;
    }

    public void setEh7(TextField tf) {
        this.eh7 = tf;
    }

    private TextField rh8 = new TextField();

    public TextField getRh8() {
        return rh8;
    }

    public void setRh8(TextField tf) {
        this.rh8 = tf;
    }

    private TextField eh8 = new TextField();

    public TextField getEh8() {
        return eh8;
    }

    public void setEh8(TextField tf) {
        this.eh8 = tf;
    }

    private TextField rh9 = new TextField();

    public TextField getRh9() {
        return rh9;
    }

    public void setRh9(TextField tf) {
        this.rh9 = tf;
    }

    private TextField eh9 = new TextField();

    public TextField getEh9() {
        return eh9;
    }

    public void setEh9(TextField tf) {
        this.eh9 = tf;
    }

    private TextField rh10 = new TextField();

    public TextField getRh10() {
        return rh10;
    }

    public void setRh10(TextField tf) {
        this.rh10 = tf;
    }

    private TextField eh10 = new TextField();

    public TextField getEh10() {
        return eh10;
    }

    public void setEh10(TextField tf) {
        this.eh10 = tf;
    }

    private TextField rh11 = new TextField();

    public TextField getRh11() {
        return rh11;
    }

    public void setRh11(TextField tf) {
        this.rh11 = tf;
    }

    private TextField eh11 = new TextField();

    public TextField getEh11() {
        return eh11;
    }

    public void setEh11(TextField tf) {
        this.eh11 = tf;
    }

    private TextField rh12 = new TextField();

    public TextField getRh12() {
        return rh12;
    }

    public void setRh12(TextField tf) {
        this.rh12 = tf;
    }

    private TextField eh12 = new TextField();

    public TextField getEh12() {
        return eh12;
    }

    public void setEh12(TextField tf) {
        this.eh12 = tf;
    }

    private TextField rh13 = new TextField();

    public TextField getRh13() {
        return rh13;
    }

    public void setRh13(TextField tf) {
        this.rh13 = tf;
    }

    private TextField eh13 = new TextField();

    public TextField getEh13() {
        return eh13;
    }

    public void setEh13(TextField tf) {
        this.eh13 = tf;
    }

    private TextField rh14 = new TextField();

    public TextField getRh14() {
        return rh14;
    }

    public void setRh14(TextField tf) {
        this.rh14 = tf;
    }

    private TextField eh14 = new TextField();

    public TextField getEh14() {
        return eh14;
    }

    public void setEh14(TextField tf) {
        this.eh14 = tf;
    }

    private TextField rh15 = new TextField();

    public TextField getRh15() {
        return rh15;
    }

    public void setRh15(TextField tf) {
        this.rh15 = tf;
    }

    private TextField eh15 = new TextField();

    public TextField getEh15() {
        return eh15;
    }

    public void setEh15(TextField tf) {
        this.eh15 = tf;
    }

    private Label label1 = new Label();

    public Label getLabel1() {
        return label1;
    }

    public void setLabel1(Label l) {
        this.label1 = l;
    }

    private Label label2 = new Label();

    public Label getLabel2() {
        return label2;
    }

    public void setLabel2(Label l) {
        this.label2 = l;
    }

    private Label label3 = new Label();

    public Label getLabel3() {
        return label3;
    }

    public void setLabel3(Label l) {
        this.label3 = l;
    }

    private Label label4 = new Label();

    public Label getLabel4() {
        return label4;
    }

    public void setLabel4(Label l) {
        this.label4 = l;
    }

    private Label label5 = new Label();

    public Label getLabel5() {
        return label5;
    }

    public void setLabel5(Label l) {
        this.label5 = l;
    }

    private Label label6 = new Label();

    public Label getLabel6() {
        return label6;
    }

    public void setLabel6(Label l) {
        this.label6 = l;
    }

    private Label label7 = new Label();

    public Label getLabel7() {
        return label7;
    }

    public void setLabel7(Label l) {
        this.label7 = l;
    }

    private Label label8 = new Label();

    public Label getLabel8() {
        return label8;
    }

    public void setLabel8(Label l) {
        this.label8 = l;
    }

    private Label label9 = new Label();

    public Label getLabel9() {
        return label9;
    }

    public void setLabel9(Label l) {
        this.label9 = l;
    }

    private Label label10 = new Label();

    public Label getLabel10() {
        return label10;
    }

    public void setLabel10(Label l) {
        this.label10 = l;
    }

    private Label label11 = new Label();

    public Label getLabel11() {
        return label11;
    }

    public void setLabel11(Label l) {
        this.label11 = l;
    }

    private Label label12 = new Label();

    public Label getLabel12() {
        return label12;
    }

    public void setLabel12(Label l) {
        this.label12 = l;
    }

    private Label label13 = new Label();

    public Label getLabel13() {
        return label13;
    }

    public void setLabel13(Label l) {
        this.label13 = l;
    }

    private Label label14 = new Label();

    public Label getLabel14() {
        return label14;
    }

    public void setLabel14(Label l) {
        this.label14 = l;
    }

    private Label label15 = new Label();

    public Label getLabel15() {
        return label15;
    }

    public void setLabel15(Label l) {
        this.label15 = l;
    }

    private Label label16 = new Label();

    public Label getLabel16() {
        return label16;
    }

    public void setLabel16(Label l) {
        this.label16 = l;
    }

    private Label label17 = new Label();

    public Label getLabel17() {
        return label17;
    }

    public void setLabel17(Label l) {
        this.label17 = l;
    }

    private Label label18 = new Label();

    public Label getLabel18() {
        return label18;
    }

    public void setLabel18(Label l) {
        this.label18 = l;
    }

    private Label label19 = new Label();

    public Label getLabel19() {
        return label19;
    }

    public void setLabel19(Label l) {
        this.label19 = l;
    }

    private TextField textField31 = new TextField();

    public TextField getTextField31() {
        return textField31;
    }

    public void setTextField31(TextField tf) {
        this.textField31 = tf;
    }

    private Label label20 = new Label();

    public Label getLabel20() {
        return label20;
    }

    public void setLabel20(Label l) {
        this.label20 = l;
    }

    private TextField textField32 = new TextField();

    public TextField getTextField32() {
        return textField32;
    }

    public void setTextField32(TextField tf) {
        this.textField32 = tf;
    }

    private Label label21 = new Label();

    public Label getLabel21() {
        return label21;
    }

    public void setLabel21(Label l) {
        this.label21 = l;
    }

    private TextField textField33 = new TextField();

    public TextField getTextField33() {
        return textField33;
    }

    public void setTextField33(TextField tf) {
        this.textField33 = tf;
    }

    private Button button1 = new Button();

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button b) {
        this.button1 = b;
    }

    private Button button2 = new Button();

    public Button getButton2() {
        return button2;
    }

    public void setButton2(Button b) {
        this.button2 = b;
    }

    private Label label22 = new Label();

    public Label getLabel22() {
        return label22;
    }

    public void setLabel22(Label l) {
        this.label22 = l;
    }

    private Button button3 = new Button();

    public Button getButton3() {
        return button3;
    }

    public void setButton3(Button b) {
        this.button3 = b;
    }
    
    // </editor-fold>
    
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public Page1() {
    }
    
    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     *
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("Page1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }
    
    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    public void preprocess() {
    }
    
    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    public void prerender() {
    }
    
    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    public void destroy() {
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1)getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1)getBean("ApplicationBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1)getBean("RequestBean1");
    }

    public void eh9_processValueChange(ValueChangeEvent event) {
        // TODO: Replace with your code
        
    }

    public void eh7_processValueChange(ValueChangeEvent event) {
        // TODO: Replace with your code
        
    }
}

