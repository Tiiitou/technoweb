package models;

import play.data.validation.Constraints;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by Tan-Vincent on 16/05/2016.
 */
public class Seance {

    @Id
    public Long id;

    @Constraints.Required
    public String groupe;

    @ManyToOne
    public User identifiant;

    public Date date;

    public int absence;

    //@OneToMany(mappedBy = "promotion")
    //public List<Session> sessions;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupe() {
        return groupe;
    }
    public void setGroupe(int Groupe) {
        this.groupe = groupe;
    }

    public User getIdentifiant(){ return identifiant; }
    public void setIdentifiant(User identifiant) { this.identifiant = identifiant; }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public int getAbsence() {
        return absence;
    }
    public void setAbsence(int absence) {
        this.absence = absence;
    }
}
