/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Mapping.Team;
import Dao.TeamHelper;
import Mapping.Title;
import Dao.TitleHelper;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author giza
 */
@ManagedBean
@SessionScoped
public class TitleController {
    
  TitleHelper helper;
    public TitleController() {
        helper=new TitleHelper();
        
    }
    
    
    public List<Title> getTitles() {
        boolean selectOne=true;
        List<Title> entities=helper.getTitles();
//        int size = selectOne ? entities.size() + 1 : entities.size();
//        SelectItem[] items = new SelectItem[size];
//        int i = 0;
//        if (selectOne) {
//            items[0] = new SelectItem("", "---");
//            i++;
//        }
//        for (Title x : entities) {
//            items[i++] = new SelectItem(x, x.getName());
//        }
        return entities;
    }
    
    
    
}
