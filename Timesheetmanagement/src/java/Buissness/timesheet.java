
package  Buissness;
/**
 * 
 *
 * @hibernate.class
 *     table="T_DATE"
 *
 */
public class timesheet {
 
  // <editor-fold defaultstate="collapsed" desc=" Property:   String t_date ">
  private String t_date;
/**
  *   @hibernate.property
  */
   public String getT_date () {
      return t_date;
   } 
   public void setT_date (String t_date) {
      this.t_date = t_date;
   }
   // </editor-fold>
 
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
 
  // <editor-fold defaultstate="collapsed" desc=" Property:   String status ">
  private String status;
/**
  *   @hibernate.property
  */
   public String getStatus () {
      return status;
   } 
   public void setStatus (String status) {
      this.status = status;
   }
   // </editor-fold>
 
  // <editor-fold defaultstate="collapsed" desc=" Property:   String billed ">
  private String billed;
/**
  *   @hibernate.property
  */
   public String getBilled () {
      return billed;
   } 
   public void setBilled (String billed) {
      this.billed = billed;
   }
   // </editor-fold>
 
  // <editor-fold defaultstate="collapsed" desc=" Property:   String payed ">
  private String payed;
/**
  *   @hibernate.property
  */
   public String getPayed () {
      return payed;
   } 
   public void setPayed (String payed) {
      this.payed = payed;
   }
   // </editor-fold>

   // <editor-fold defaultstate="collapsed" desc=" PrimaryKey:   String id ">
   private String id;
/**
  *   @hibernate.id
  *     generator-class="uuid.hex"
  */
   public String getId () {
      return id;
   } 
   public void setId (String id) {
      this.id = id;
   }
   //</editor-fold>
}