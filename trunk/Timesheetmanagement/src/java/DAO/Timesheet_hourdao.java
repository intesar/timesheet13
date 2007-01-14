/*
 * Timesheet_hour.java
 *
 * Created on January 13, 2007, 11:23 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package DAO;

import Buissness.Employee;
import Buissness.HibernateUtil;
import javax.transaction.SystemException;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

/**
 *
 * @author shoukat
 */
public class Timesheet_hourdao {
    
    /** Creates a new instance of Timesheet_hour */
    public Timesheet_hourdao() {
    }
      public void save(Timesheet_hourdao t) throws SystemException{
        Session session=null;
        Transaction tx=null;
        try{
            session=HibernateUtil.currentSession();
            session.save(t);
            tx.commit();
            
        }catch(Exception ee){
        tx.rollback();
    }finally{
        session.close();
    }
    
}
    public void update(Timesheet_hourdao u) throws SystemException{
        Session session=null;
        Transaction tx=null;
        try{
            session=HibernateUtil.currentSession();
            session.update(u);
            tx.commit();
        }catch(Exception ee){
            tx.rollback();
        }finally{
          session.close();  
        }
    }
    public void delete(Timesheet_hourdao u) throws SystemException{
        Session session=null;
        Transaction tx=null;
        try{
            session=HibernateUtil.currentSession();
            session.delete(u);
            tx.commit();
        }catch(Exception ee){
            tx.rollback();
        }finally{
          session.close();  
        }
    }
    public Employee findbyusername(String username){
        Session s=HibernateUtil.currentSession();
        return (Employee) s.createQuery("from Buissness.Employee e where e.username='"+username +"'").uniqueResult();
    }
    
}
