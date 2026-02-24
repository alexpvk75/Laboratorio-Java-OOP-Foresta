package LAB28;
import java.util.ArrayList;
import java.util.List;

public class Foresta {
    private int quantitaAlberi = 0;
    private List<Albero> piante = new ArrayList<Albero>();
    private List<String> pianteID = new ArrayList<String>();
    public Foresta(){
        // costruttore default
    }
    public void piantaAlbero(String specie, Terreno t) {
        boolean piantato = false;
        if (specie.equals("betulla")) {
            Betulla b = new Betulla();
            b.setID("b"+String.format("%04d", this.quantitaAlberi+1));
            if(t.verificaSpazioPerCrescere(b, false)){
                this.piante.add(b);
                this.pianteID.add(b.getID());
                piantato = true;
                b.cresco = true;
            }
        }
        if (specie.equals("quercia")) {
            Quercia q = new Quercia();
            q.setID("q"+String.format("%04d", this.quantitaAlberi+1));
            if(t.verificaSpazioPerCrescere(q, false)){
                this.piante.add(q);
                this.pianteID.add(q.getID());
                piantato = true;
                q.cresco = true;
            }
        }
        if(piantato) {
            this.quantitaAlberi++;
        }
    }

    public void piantaAlbero(String specie, int quantita, Terreno t) {
        for (int i = 0; i < quantita; i++) {
            this.piantaAlbero(specie, t);
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
    public void nuovoGiorno(Terreno t, Stagione s) {
        int oreDiLuce = s.nuovoGiorno();
        if (oreDiLuce > 4) {
            for (int i = 0; i < this.piante.size(); i++) {
                Albero a = this.piante.get(i);
                a.cresci(t, oreDiLuce);
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

