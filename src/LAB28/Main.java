package LAB28;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Simulazione della foresta");
        Terreno terreno = new Terreno();
        Foresta conifere=new Foresta();
        conifere.piantaAlbero("betulla",2, terreno);
        conifere.piantaAlbero("quercia", 3, terreno);
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