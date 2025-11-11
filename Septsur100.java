import java.util.Scanner;

public class Septsur100  {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quelle est votre prénom?");
        String prenom = sc.nextLine();
        System.out.println("Quellle est votre nom");
        String nom = sc.nextLine();
        System.out.println("Quelle age avez vous?");
        int age = sc.nextInt();
        System.out.println("Bonjour "+nom +prenom+", tu as " +age+" ans");
        sc.close();
    }
}
