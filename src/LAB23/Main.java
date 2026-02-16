package LAB23;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Simulazione della foresta");
        Foresta conifere=new Foresta();
        Stagione s = new Stagione();
        conifere.piantaAlbero("betulla",2);
        conifere.piantaAlbero("quercia");
        int q=conifere.getQuantiAlberi();
        System.out.println("nella foresta ci sono " + q + " alberi");
        for (int g = 1; g<=165; g++){
            conifere.nuovoGiorno(s);
        }
        int n=conifere.getDiametroTotAlberi();
        System.out.println("il diametro totale " + n);
        int f = conifere.getFoglieTotali();
        System.out.println("il numero totale di foglie è " + f);
        in.close();
    }
}