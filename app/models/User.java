package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.List;

@Entity
public class User extends Model {

    @Id
    public Long id;

    @Constraints.Required
    public String nom;


    public String prenom;

    public int role;

    public String email;

    @Constraints.Required
    public int identifiant;

    //@OneToMany(mappedBy = "promotion")
    //public List<Session> sessions;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(int Nom) {
        this.nom = nom;
    }

    public String getPrenom(){
        return prenom;
    }
        public void setPrenom(int Prenom){
        this.prenom = prenom;
    }

    public int getRole(){
        return role;
    }
    public void setRole(int Role){
        this.role = role;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(int Email){
        this.email = email;
    }

    public int getIdentifiant() {
        return identifiant;
    }
    public void setIDentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    //public List<Session> getSessions() { return sessions; }
    //public void setSessions(List<Session> sessions) { this.sessions = sessions; }




}