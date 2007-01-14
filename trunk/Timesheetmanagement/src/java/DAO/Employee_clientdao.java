/*
 * Employee_client.java
 *
 * Created on January 13, 2007, 11:27 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package DAO;

import Buissness.Employee;
import Buissness.HibernateUtil;
import Buissness.employee_client;
import javax.transaction.SystemException;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

/**
 *
 * @author shoukat
 */
public class Employee_clientdao {
    
    /** Creates a new instance of Employee_client */
    public Employee_clientdao() {
    }
      public void save(employee_client e) throws SystemException{
        Session session=null;
        Transaction tx=null;
        try{
            session=HibernateUtil.currentSession();
            session.save(e);
            tx.commit();
            
        }catch(Exception ee){
        tx.rollback();
    }finally{
        session.close();
    }
    
}
    public void update(employee_client u) throws SystemException{
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
    public void delete(employee_client u) throws SystemException{
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
