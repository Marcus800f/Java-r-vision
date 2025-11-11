import java.util.Scanner;
public class Sixsur100 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quelle est votre prénom?");
        String prenom = sc.nextLine();
        System.out.println("Bienvenue " + prenom);
        sc.close();
    }
}
