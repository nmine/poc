package be.nmine.validations;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class PersonneBean {
  
  private String nom;
  private String Prenom;
  private Date dateNaissance;

  public PersonneBean(String nom, String prenom, Date dateNaissance) {
    super();
    this.nom = nom;
    Prenom = prenom;
    this.dateNaissance = dateNaissance;
  }

  @NotNull
  @Size(max=50)
  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  @NotNull
  @Size(max=50)
  public String getPrenom() {
    return Prenom;
  }

  public void setPrenom(String prenom) {
    Prenom = prenom;
  }

  @Past
  public Date getDateNaissance() {
    return dateNaissance;
  }

  public void setDateNaissance(Date dateNaissance) {
    this.dateNaissance = dateNaissance;
  }
  
}