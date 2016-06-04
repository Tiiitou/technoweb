package models;

import play.data.validation.Constraints;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by Tan-Vincent on 16/05/2016.
 */
public class Remarque {

    @Id
    public Long id;

    @ManyToOne
    public User identifiant;

    public String remarque;

    public Date date;

    //@OneToMany(mappedBy = "promotion")
    //public List<Session> sessions;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getRemarque() {
        return remarque;
    }
    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }

    public User getIdentifiant(){ return identifiant; }
    public void setIdentifiant(User identifiant) { this.identifiant = identifiant; }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

}
