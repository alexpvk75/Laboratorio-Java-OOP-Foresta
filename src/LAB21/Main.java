package LAB21;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Simulazione della foresta");
        System.out.println("Inserisci la quantita di giorni: ");
        int giorni = in.nextInt();
        Foresta conifere=new Foresta();
        conifere.piantaAlbero("betulla",2);
        conifere.piantaAlbero("quercia");
        int q=conifere.getQuantiAlberi();
        System.out.println("nella foresta ci sono " + q + " alberi");
        
        for (int g = 1; g<=giorni; g++){
            conifere.nuovoGiorno();
            int n=conifere.getDiametroTotAlberi();
            System.out.println("il diametro totale " + n);
        }
        in.close();
    }
}