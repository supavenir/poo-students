import fr.caensup.students.entities.Etudiant;
import fr.caensup.students.entities.Groupe;

import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        /*Etudiant st=new Etudiant();
        System.out.println(st.getNom());

        Groupe gr = new Groupe("nomGroupe");
        System.out.println(gr.getNom());

        gr.addEtudiant(st);
        gr.addEtudiant(new Etudiant());
        System.out.println(gr.getLesEtudiants());
        gr.removeEtudiant(st);
        System.out.println(gr.getLesEtudiants());
        gr.removeEtudiant(new Etudiant());*/

        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        try {
            Integer.parseInt(s);
        }catch (NumberFormatException e){
            System.out.println("Error");
        }
        System.out.println("Vous avez saisi : "+s);
    }
}
