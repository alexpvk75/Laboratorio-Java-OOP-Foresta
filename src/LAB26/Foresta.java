package LAB26;
import java.util.ArrayList;
import java.util.List;

public class Foresta {
    private int quantitaAlberi = 0;
    private List<Albero> piante = new ArrayList<Albero>();
    public Foresta(){
        // costruttore default
    }
    public void piantaAlbero(String specie) {
        if (specie.equals("betulla")) {
            this.piante.add(new Betulla());
        }
        if (specie.equals("quercia")) {
            this.piante.add(new Quercia());
        }
        this.quantitaAlberi++;
    }

    public void piantaAlbero(String specie, int quantita) {
        for (int i = 0; i < quantita; i++) {
            this.piantaAlbero(specie);
        }
    }
    public int getQuantiAlberi() {
        return this.quantitaAlberi;
    }
    public int getDiametroTotAlberi() {
        int diametroTotale = 0;
        for (int i = 0; i < this.piante.size(); i++) {
            Albero a = this.piante.get(i);
            diametroTotale += a.getTronco();
        }
        return diametroTotale;
    }
    public int getFoglieTotali(){
        int totalFoglie = 0;
        for (int x = 0; x < this.piante.size(); x++){
            Albero a = this.piante.get(x);
            totalFoglie = totalFoglie + a.getQuanteFoglie();
        }
        return totalFoglie;
    }
    public void nuovoGiorno(Stagione s) {
        int oreDiLuce = s.nuovoGiorno();
        if (oreDiLuce > 4) {
            for (int i = 0; i < this.piante.size(); i++) {
                Albero a = this.piante.get(i);
                a.cresci(oreDiLuce);
            }
        }
        if (s.isPrimavera()) {
            for (int i = 0; i < this.piante.size(); i++) {
                Albero a = this.piante.get(i);
                a.primavera();
            }
        }
    }
}

