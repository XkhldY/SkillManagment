/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import Dao.TitleHelper;
import Mapping.Title;
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
public class TitleConverter implements Converter{

    TitleHelper helper=null;
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        helper=new TitleHelper();
       return helper.getTitleByID(BigDecimal.valueOf(Long.parseLong(value)));
//       return helper.getTeamByID(Integer.parseInt(value));
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
                    helper=new TitleHelper();

                Title title=(Title) value;
                return title.getId().toString();
        
    }

}
