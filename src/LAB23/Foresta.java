package LAB23;
import java.util.ArrayList;
import java.util.List;

public class Foresta {
    private int quantitaAlberi = 0;
    private List<Albero> piante = new ArrayList<Albero>();
    public Foresta(){
        // costruttore default
    }
    public void piantaAlbero(String specie ){
        Albero a = new Albero();
        if(specie.equals("betulla")){
            a.setCrescitaDiametroTronco(3);
        }
        if(specie.equals("quercia")){
            a.setCrescitaDiametroTronco(2);
        }
        this.piante.add(a);
        this.quantitaAlberi++;
    }
    public void piantaAlbero(String specie, int quantita ) {
        for (int i=0; i<quantita; i++) {
            this.piantaAlbero(specie);
        }
    }
    public int getQuantiAlberi(){
        return this.quantitaAlberi;
    }
    public int getDiametroTotAlberi(){
        int totalberi = 0;
        for (int x = 0; x < this.piante.size(); x++){
            Albero a = this.piante.get(x);
            totalberi = totalberi + a.getTronco();
        }
        return totalberi;
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
        int oreluce = s.nuovoGiorno();
        if(oreluce>4){
            for (int x = 0; x < this.piante.size(); x++){
                Albero a = this.piante.get(x);
                a.cresci(oreluce);
            }
        }
    }
}