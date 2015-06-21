/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Mapping.Team;
import Dao.TeamHelper;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author giza
 */
@ManagedBean
@SessionScoped
public class TeamController {

    /**
     * Creates a new instance of TeamController
     */
    
    TeamHelper helper;
    public TeamController() {
        helper=new TeamHelper();
    }
    
    
    public List<Team> getTeams() {
        boolean selectOne=true;
        List<Team> entities=helper.getTeams();
//        int size = selectOne ? entities.size() + 1 : entities.size();
//        SelectItem[] items = new SelectItem[size];
//        int i = 0;
//        if (selectOne) {
//            items[0] = new SelectItem("", "---");
//            i++;
//        }
//        for (Team x : entities) {
//            items[i++] = new SelectItem(x, x.getName());
//        }
        return entities;
    }
    
    
    
}
