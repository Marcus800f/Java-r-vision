public class NoteEleve {
    String nom;
    String prenom;
    int note1;
    int note3;
    int note2;
    float moyenne;

    public NoteEleve(String nom, String prenom, int note1, int note2, int note3){
        this.nom = nom;
        this.prenom = prenom;
        this.note1= note1;
        this.note2= note2;
        this.note3= note3;
        

    }
    public void affichermoyenne(){
        this.moyenne =  (note1+note2+note3)/3;
        
        System.out.println(nom+" " +prenom+" tu as "+moyenne+ " de moyenne");
    }
} 
