/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import Dao.TeamHelper;
import Mapping.Team;
import java.math.BigDecimal;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
/**
 *
 * @author giza
 */

@RequestScoped
@ManagedBean
public class TeamConverter implements Converter{

    TeamHelper helper=null;
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        helper=new TeamHelper();
       return helper.getTeamByID(BigDecimal.valueOf(Long.parseLong(value)));
//       return helper.getTeamByID(Integer.parseInt(value));
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
                    helper=new TeamHelper();

                Team team=(Team) value;
                return team.getId().toString();
        
    }

}
