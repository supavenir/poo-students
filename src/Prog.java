import fr.caensup.students.entities.Element;
import fr.caensup.students.entities.Etablissement;
import fr.caensup.students.entities.Etudiant;
import fr.caensup.students.entities.Groupe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {

        Groupe gr=new Groupe();
        gr.setNom("2 BTS SIO ALT");
        Etudiant et1=new Etudiant("Pierre","B");
        gr.addEtudiant(et1);
        System.out.println(gr.getElements());
        System.out.println(et1.getUnite());

        gr.addEtudiant(new Etudiant("Kevin","C"));



        gr.addElements(et1, new Etudiant(),new Etudiant("",""),et1,new Etablissement());

        /*Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        try {
            Integer.parseInt(s);
        }catch (NumberFormatException e){
            System.out.println("Error");
        }
        System.out.println("Vous avez saisi : "+s);*/
    }
}
