/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Mapping.Employee;
import Mapping.HibernateUtil;
import Mapping.Team;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author giza
 */
public class TeamHelper {

    private Session s=null;

public TeamHelper()
        {
    s=HibernateUtil.getSessionFactory().openSession();
            }
public List getTeams()
{

        Transaction tx=s.beginTransaction();
      List<Team> em= s.createQuery("from Team").list(); 
      
        return em;
}

public Team getTeamByID(BigDecimal x)
{

        Transaction tx=s.beginTransaction();
      Team em= (Team) s.createQuery("FROM Team e WHERE e.id =" + x ).list().get(0); 
      
        return em;
}

}