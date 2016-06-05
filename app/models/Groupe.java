package models;

import play.data.validation.Constraints;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by Tan-Vincent on 16/05/2016.
 */
@Entity
public class Groupe extends Model {

    @Id
    public Long id;

    public String groupe;

    @ManyToOne
    public User identifiant;

    public String tuteur;

    public String role;

    public String remarque;

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
    public void setGroupe(String Groupe) {
        this.groupe = groupe;
    }

    public User getIdentifiant(){ return identifiant; }
    public void setIdentifiant(User identifiant) { this.identifiant = identifiant; }

    public String getRemarque() {
        return remarque;
    }
    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public String getTuteur() {
        return tuteur;
    }
    public void setTuteur(String tuteur) {
        this.tuteur = tuteur;
    }
}
