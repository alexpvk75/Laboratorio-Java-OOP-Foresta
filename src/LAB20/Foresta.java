package LAB20;
import java.util.ArrayList;
import java.util.List;

public class Foresta {
    private int quantitaAlberi = 0;
    private List<Albero> piante = new ArrayList<Albero>();
    public Foresta(){


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
}
