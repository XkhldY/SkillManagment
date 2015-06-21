/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Mapping.Employee;
import Mapping.HibernateUtil;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author giza
 */
public class EmployeeHelper {
    private Session s=null;
    
    public EmployeeHelper()
    {
        s=HibernateUtil.getSessionFactory().openSession();
    }
    public List getEmployee()
    {
        Transaction tx=s.beginTransaction();
      List<Employee> em= s.createQuery("from Employee").list(); 
      
        return em;
    }
    
    public String AddEmployee(Employee emp)
    {
        Transaction tx=s.beginTransaction();
        try{
            List<Employee> list=getEmployee();
            Employee x=list.get(list.size()-1);
            emp.setId(x.getId().add(new BigDecimal(1)));
            
            s.save(emp);
            tx.commit();
            return "done";
        }
        catch(Exception e )
        {
            return "failed";
        }
        
    }
    

    
    
}
