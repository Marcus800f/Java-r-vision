import java.util.Scanner;

public class Neufsur100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer le premier chiffre :");
        int chiffre1 = sc.nextInt();

        System.out.println("Veuillez entrer le signe (+, -, *, /) :");
        String signe = sc.next(); // 👉 next() lit juste un mot, pas toute la ligne

        System.out.println("Veuillez entrer le deuxième chiffre :");
        int chiffre2 = sc.nextInt();

        switch (signe) {
            case "+":
                System.out.println("Résultat : " + (chiffre1 + chiffre2));
                break;

            case "-":
                System.out.println("Résultat : " + (chiffre1 - chiffre2));
                break;

            case "*":
                System.out.println("Résultat : " + (chiffre1 * chiffre2));
                break;

            case "/":
                if (chiffre2 == 0) {
                    System.out.println("Erreur : division par zéro !");
                } else {
                    System.out.println("Résultat : " + (chiffre1 / chiffre2));
                }
                break;

            default:
                System.out.println("Signe invalide !");
                break;
        }

        sc.close();
    }
}
