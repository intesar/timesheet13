
package Buissness;
/**
 * 
 *
 * @hibernate.class
 *     table="EMPLOYEE_CLIENT"
 *
 */
public class employee_client {
 
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
 
  // <editor-fold defaultstate="collapsed" desc=" Property:   String client ">
  private String client;
/**
  *   @hibernate.property
  */
   public String getClient () {
      return client;
   } 
   public void setClient (String client) {
      this.client = client;
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