package exo2;
import java.util.Scanner;
public class Etudiant {
    String nom;
    float moyenne;
    String avis;
    int note;
    Scanner sc = new Scanner(System.in);
    public Etudiant(){
        nom();
        moyenne();
        avis();
        afficher();
    }
    public float moyenne(){
        Notation n = new Notation();
        this.note = n.getNote();
        this.moyenne = note/1;
        return moyenne;
    }
    public String avis(){
        if(moyenne<10)
        {
            this.avis = "défavorable";
            return avis;
        }
        else{
            this.avis = "favorable";
            return avis;
        }
       
    
    }
     public void afficher(){
            System.out.println(avis+moyenne+nom);
        }
        public String nom(){
            System.out.println("Quelle est ton nom?");
            this.nom= sc.nextLine();
            return nom;
        }
}
