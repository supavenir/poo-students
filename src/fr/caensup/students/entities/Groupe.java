package fr.caensup.students.entities;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Groupe {
    private String nom;
    private List<Etudiant> lesEtudiants;

    public Groupe(){
        this("Inconnu");
    }

    public Groupe(String nom){
        this.nom=nom;
        this.lesEtudiants=new LinkedList<>();
    }

    public void setNom(String nom){
        this.nom=nom;
    }

    public String getNom(){
        return this.nom;
    }

    public List<Etudiant> getLesEtudiants(){
        return lesEtudiants;
    }

    public void addEtudiant(Etudiant et) {
        lesEtudiants.add(et);
    }
    public boolean removeEtudiant(Etudiant et) {
        if(lesEtudiants.remove(et)){
            et.setLeGroupe(null);
            return true;
        }
        return false;
    }
}