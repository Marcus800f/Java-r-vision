public class Personne{
    
    String prenom;
    int age;
    
    public Personne (String prenom, int age)
    {
        this.prenom= prenom;
        this.age = age;
    }
    public void afficherInfos ()
    {
        System.out.println("Bonjour "+ this.prenom);
        System.out.println(" tu as "+ this.age + " ans");


    }
}