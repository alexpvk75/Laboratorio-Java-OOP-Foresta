package LAB21;
public class Albero {

    private int anni = 0;
    private int tronco=0;
    private int crescitaDiametroTronco=0;
    public void setCrescitaDiametroTronco(int x) {
        this.crescitaDiametroTronco=x;
    }
    public void cresci() {
        this.anni = this.anni + 1;
        this.tronco=this.crescitaDiametroTronco*this.anni;
    }
    public int getTronco () {
        return tronco;
    }
    Albero() {
        System.out.println("è stato usato il costruttore di default");
    }
    public int dimmiAnni() {
        return this.anni;
    }

}