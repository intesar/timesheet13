
package Buissness ;
/**
 * 
 *
 * @hibernate.class
 *     table="TIMESHEET_HOUR"
 *
 */
public class Timesheet_hour {
 
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
 
  // <editor-fold defaultstate="collapsed" desc=" Property:   int regular_hour ">
  private int regular_hour;
/**
  *   @hibernate.property
  */
   public int getRegular_hour () {
      return regular_hour;
   } 
   public void setRegular_hour (int regular_hour) {
      this.regular_hour = regular_hour;
   }
   // </editor-fold>
 
  // <editor-fold defaultstate="collapsed" desc=" Property:   int over_time ">
  private int over_time;
/**
  *   @hibernate.property
  */
   public int getOver_time () {
      return over_time;
   } 
   public void setOver_time (int over_time) {
      this.over_time = over_time;
   }
   // </editor-fold>
 
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
 
  // <editor-fold defaultstate="collapsed" desc=" Property:   int day ">
  private int day;
/**
  *   @hibernate.property
  */
   public int getDay () {
      return day;
   } 
   public void setDay (int day) {
      this.day = day;
   }
   // </editor-fold>
 
  // <editor-fold defaultstate="collapsed" desc=" Property:   String comment ">
  private String comment;
/**
  *   @hibernate.property
  */
   public String getComment () {
      return comment;
   } 
   public void setComment (String comment) {
      this.comment = comment;
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