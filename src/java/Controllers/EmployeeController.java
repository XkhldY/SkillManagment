 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Dao.EmployeeHelper;
import Mapping.Employee;
import Mapping.Team;
import Mapping.Title;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author giza
 */
@ManagedBean
@SessionScoped
public class EmployeeController implements Serializable{

    /**
     * Creates a new instance of EmployeeController
     */
    private Employee current;
    
    public DataModel emp;
    private int teamid;
    private int titleid;
    public Team t;
    public Title ti;
private EmployeeHelper helper=null;
//    private SelectItem team;
//    private SelectItem title;
    
    
    

    public EmployeeController() {
        
        helper=new EmployeeHelper();
    }
    public DataModel getEmp()
    {
          emp=new ListDataModel(helper.getEmployee());
        return emp;
    }
    public Employee getSelected() {
        if (current == null) {
            current = new Employee();
        }
        return current;
    }
//     public Team getTeamSelected() {
//        if (t == null) {
//            t = new Team();
//        }
//        return t;
//    }
//      public Title getTitleSelected() {
//        if (ti == null) {
//            ti = new Title();
//        }
//        return ti;
//    }
    public String saveEmp()
    {
        
//        t=(Team) team.getValue();
//        ti=(Title) getTitle().getValue();
        System.out.println("shit");
        //Employee m =new Employee(BigDecimal.valueOf(6),t,ti,current.getName());
        return helper.AddEmployee(current);
        
    }

    /**
     * @return the team
     */
    public Team getTeam() {
         if (t == null) {
            t = new Team();
        }
        return t;
    }

    /**
     * @param team the team to set
     */
    public void setTeam(Team team) {
        this.t = team;
    }

    /**
     * @return the title
     */
    public Title getTitle() {
        if (ti == null) {
            ti= new Title();
        }
        return ti;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(Title title) {
        this.ti = title;
    }

    /**
     * @return the teamid
     */
    public int getTeamid() {
        return teamid;
    }

    /**
     * @param teamid the teamid to set
     */
    public void setTeamid(int teamid) {
        this.teamid = teamid;
    }

    /**
     * @return the titleid
     */
    public int getTitleid() {
        return titleid;
    }

    /**
     * @param titleid the titleid to set
     */
    public void setTitleid(int titleid) {
        this.titleid = titleid;
    }

    
            
}
