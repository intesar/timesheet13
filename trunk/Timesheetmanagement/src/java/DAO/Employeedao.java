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

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author shoukat
 */
public class Employeedao {
    
    /** Creates a new instance of Employeedao */
    public Employeedao() {
    }
    public void save(Employee e) throws SystemException, Exception{
        Session session=null;
        Transaction tx=null;
        try{
            session=HibernateUtil.currentSession();
            tx = session.beginTransaction();
            session.save(e);
            tx.commit();
            
        }catch(Exception ee){
            ee.printStackTrace();
            tx.rollback();
            throw ee;
        
    }finally{
        HibernateUtil.closeSession();
    }
    
}
    public void update(Employee u) throws SystemException{
        Session session=null;
        Transaction tx=null;
        try{
            session=HibernateUtil.currentSession();
            tx=session.beginTransaction();
            session.update(u);
            tx.commit();
        }catch(Exception ee){
            ee.printStackTrace();
            tx.rollback();
        }finally{
          session.close();  
        }
    }
    public void delete(Employee e) throws SystemException{
        Session session=null;
        Transaction tx=null;
        try{
            session=HibernateUtil.currentSession();
            tx=session.beginTransaction();
            //Employee em=new Employee();
            e.getId();
            
            session.delete(e);
            tx.commit();
        }catch(Exception ee){
            tx.rollback();
        }finally{
          session.close();  
        }
    }
    public Employee findbyusername(String name){
        Session s=HibernateUtil.currentSession();       
       return (Employee)s.createQuery("from Buissness.Employee e where e.username='"+name+"'").uniqueResult();
    
   
    }
}