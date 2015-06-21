/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Mapping.Employee;
import Mapping.HibernateUtil;
import Mapping.Title;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author giza
 */
public class TitleHelper {
        private Session s=null;

public TitleHelper()
        {
    s=HibernateUtil.getSessionFactory().openSession();
            }
public List getTitles()
{

        Transaction tx=s.beginTransaction();
      List<Employee> em= s.createQuery("from Title").list(); 
      
        return em;
}

public Title getTitleByID(BigDecimal x)
{

        Transaction tx=s.beginTransaction();
      Title em= (Title) s.createQuery("FROM Title e WHERE e.id =" + x ).list().get(0); 
      
        return em;
}
}
