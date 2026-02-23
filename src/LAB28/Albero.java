package LAB28;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Albero {
    private int anni = 0;
    private int tronco = 0;
    private int altezza = 0;
    private int crescitaDiametroTronco = 0;
    private int crescitaAltezza = 0;
    private String ID = "";
    private int posX = 0;
    private int posY = 0;
    private List<Foglia> foglie = new ArrayList<Foglia>();
    private Random r = new Random();
    public int numeroCasuale(int min, int max){
        return this.r.nextInt(min, max+1);
    }
    public void setID(String id) {
        this.ID = id;
    }
    public String getID() {
        return this.ID;
    }
    public void setPosizione(int x, int y) {
        this.posX = x;
        this.posY = y;
    }
    public int[] getPosizione() {
        return new int[]{this.posX, this.posY};
    }
    protected void setCrescitaDiametroTronco(int x) { 
        this.crescitaDiametroTronco = x; //non cambia attributo tronco perche quella variabile e' privata, cambia solo crescitaDiametroTronco
    }
    protected void setCrescitaAltezza(int x) { 
        this.crescitaAltezza = x; //non cambia attributo altezza perche quella variabile e' privata, cambia solo crescitaAltezza
    }
    public void cresci(int oreDiLuce) {
        this.anni = this.anni + 1;
        int diametroPrecedente = this.tronco;
        this.tronco = this.crescitaDiametroTronco * this.anni;
        this.altezza = this.crescitaAltezza * this.anni;
        
        if (this.tronco > diametroPrecedente) {
            if (this.foglie.size() == 0 && this.tronco > 0) {
                int foglieNuove = this.numeroCasuale(1, 10);
                for (int i = 0; i < foglieNuove; i++) {
                    Foglia f = new Foglia();
                    f.nasce(oreDiLuce);
                    this.foglie.add(f);
                }
            } else if (this.foglie.size() > 0) {
                for (Foglia f : this.foglie) {
                    f.cresce(oreDiLuce);
                }
            }
        }
    }
    public int getAltezza() {
        return altezza;
    }
    public int getTronco() {
        return tronco;
    }
    Albero() {
        // System.out.println("è stato usato il costruttore di default");
    }
    public int getQuanteFoglie() {
        return this.foglie.size();
    }
    public int dimmiAnni() {
        return this.anni;
    }
    public void primavera() {
        int oreDiLuce = numeroCasuale(3, 6);;
        for (Foglia f : this.foglie) {
            if (!f.isAlive() && f.getTentativi() == 1) {
                f.nasce(oreDiLuce);
            }
        }
    }
}

