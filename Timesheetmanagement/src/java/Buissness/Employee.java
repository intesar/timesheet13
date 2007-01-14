
package Buissness ;
/**
 * 
 *
 * @hibernate.class
 *     table="EMPLOYEE"
 *
 */
public class Employee {
 
  // <editor-fold defaultstate="collapsed" desc=" Property:   String username ">
  private String username;
/**
  *   @hibernate.property
  */
   public String getUsername () {
      return username;
   } 
   public void setUsername (String username) {
      this.username = username;
   }
   // </editor-fold>
 
  // <editor-fold defaultstate="collapsed" desc=" Property:   String password ">
  private String password;
/**
  *   @hibernate.property
  */
   public String getPassword () {
      return password;
   } 
   public void setPassword (String password) {
      this.password = password;
   }
   // </editor-fold>
 
  // <editor-fold defaultstate="collapsed" desc=" Property:   String firstname ">
  private String firstname;
/**
  *   @hibernate.property
  */
   public String getFirstname () {
      return firstname;
   } 
   public void setFirstname (String firstname) {
      this.firstname = firstname;
   }
   // </editor-fold>
 
  // <editor-fold defaultstate="collapsed" desc=" Property:   String lastname ">
  private String lastname;
/**
  *   @hibernate.property
  */
   public String getLastname () {
      return lastname;
   } 
   public void setLastname (String lastname) {
      this.lastname = lastname;
   }
   // </editor-fold>
 
  // <editor-fold defaultstate="collapsed" desc=" Property:   java.sql.Date dob">
  private java.sql.Date dob;
/**
  *   @hibernate.property
  */
   public java.sql.Date getdob () {
      return dob;
   } 
   public void setdob (java.sql.Date dob) {
      this.dob = dob;
   }
   // </editor-fold>
 
  // <editor-fold defaultstate="collapsed" desc=" Property:   int enable ">
  private int enable;
/**
  *   @hibernate.property
  */
   public int getEnable () {
      return enable;
   } 
   public void setEnable (int enable) {
      this.enable = enable;
   }
   // </editor-fold>

  // <editor-fold defaultstate="collapsed" desc=" PrimaryKey:   int id ">
   //never write Integer its int(changing Integer to int
   private int id;
/**
  *   @hibernate.id
  *     generator-class="increment"
  */
   public int getId () {
      return id;
   } 
   public void setId (int id) {
      this.id = id;
   }
   //</editor-fold>
}