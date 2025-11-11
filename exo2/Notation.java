package exo2;
import java.util.Scanner;
public class Notation {
    int note;
    int coef;
    Scanner sc= new Scanner(System.in);
    
    public Notation(){
        getCoef();
        getNote();

    }

private int getCoef()
{
System.out.println("Quelle est le coef?");
this.coef = sc.nextInt();
return this.coef;
}
public int getNote(){
System.out.println("Quelle est la note?");
this.note = sc.nextInt();
return this.note;
}

}

