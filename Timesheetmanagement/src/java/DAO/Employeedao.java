/*
 * Employeedao.java
 *
 * Created on January 13, 2007, 10:09 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package DAO;

import Buissness.Employee;
import Buissness.HibernateUtil;
import javax.transaction.SystemException;
import javax.transaction.Transaction;
import org.hibernate.Session;

/**
 *
 * @author shoukat
 */
public class Employeedao {
    
    /** Creates a new instance of Employeedao */
    public Employeedao() {
    }
    public void save(Employee e) throws SystemException{
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
    public void update(Employee u) throws SystemException{
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
    public void delete(Employee u) throws SystemException{
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