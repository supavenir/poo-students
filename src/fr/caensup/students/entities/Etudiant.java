package fr.caensup.students.entities;

public class Etudiant {
    private String prenom;
    private String nom;

    private Groupe leGroupe;

    public Etudiant(){
        this.prenom = "Inconnu";
        this.nom = "Inconnu";
    }

    public Etudiant(String prenom, String nom){
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public void setLeGroupe(Groupe leGroupe){
        this.leGroupe = leGroupe;
    }
}
