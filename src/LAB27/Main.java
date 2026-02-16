package LAB27;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Simulazione della foresta");
        Foresta conifere=new Foresta();
        conifere.piantaAlbero("betulla",2);
        conifere.piantaAlbero("quercia", 3);
        int q=conifere.getQuantiAlberi();
        System.out.println("nella foresta ci sono " + q + " alberi");
        Life vita = new Life();
        for (int i = 0; i < 5; i++) {
            vita.nextYear(conifere);
        }
        System.out.println("Sono passati " + vita.getAnni() + " anni");
        int n=conifere.getDiametroTotAlberi();
        System.out.println("il diametro totale " + n);
        int f = conifere.getFoglieTotali();
        System.out.println("il numero totale di foglie è " + f);
        in.close();
    }
}