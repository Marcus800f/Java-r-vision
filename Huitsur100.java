import java.util.Scanner;
public class Huitsur100 {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer votre premiere note");
        int note1 = sc.nextInt();
        
        System.out.println("Veuillez entrer votre DEUXIEME note");
         int note2 = sc.nextInt();

         System.out.println("Veuillez entrer votre troisieme note");
         int note3 = sc.nextInt();

         float moyenne = (note1+note2+note3)/3;

         if(moyenne>10)
         {
            System.out.println("Admis");
         }
         else if(moyenne <10 && moyenne >= 8)
         {
             System.out.println("Ratrappage");
         }
         else
         {
            System.out.println("Refusé");
         }
         sc.close();
    }
}
