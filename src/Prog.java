import fr.caensup.students.entities.Etudiant;
import fr.caensup.students.entities.Groupe;

import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {

        Groupe gr=new Groupe();
        gr.setNom("2 BTS SIO ALT");
        Etudiant et1=new Etudiant("Pierre","B");
        gr.addElement(et1);
        System.out.println(gr.getElements());
        System.out.println(et1.getUnite());

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
