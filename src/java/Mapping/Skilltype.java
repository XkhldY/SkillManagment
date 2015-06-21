package Mapping;
// Generated Jun 19, 2015 3:46:43 PM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Skilltype generated by hbm2java
 */
public class Skilltype  implements java.io.Serializable {


     private BigDecimal id;
     private Skillcategory skillcategory;
     private String name;
     private Set<Skillspecialization> skillspecializations = new HashSet<Skillspecialization>(0);

    public Skilltype() {
    }

	
    public Skilltype(BigDecimal id, String name) {
        this.id = id;
        this.name = name;
    }
    public Skilltype(BigDecimal id, Skillcategory skillcategory, String name, Set<Skillspecialization> skillspecializations) {
       this.id = id;
       this.skillcategory = skillcategory;
       this.name = name;
       this.skillspecializations = skillspecializations;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public Skillcategory getSkillcategory() {
        return this.skillcategory;
    }
    
    public void setSkillcategory(Skillcategory skillcategory) {
        this.skillcategory = skillcategory;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set<Skillspecialization> getSkillspecializations() {
        return this.skillspecializations;
    }
    
    public void setSkillspecializations(Set<Skillspecialization> skillspecializations) {
        this.skillspecializations = skillspecializations;
    }




}

