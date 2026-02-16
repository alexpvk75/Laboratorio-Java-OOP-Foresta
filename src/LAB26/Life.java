package LAB26;

public class Life {
    private Stagione s = new Stagione();
    private int anni = 0;
    private int quarter = 0;
    public void nextYear(Foresta f) {
        for (int g = 1; g <= 365 + this.isBisestile(this.quarter); g++) {
            f.nuovoGiorno(s);
        }
        this.anni++;
        this.quarter++;
        if (this.quarter == 4) {
            this.quarter = 0;
        }
    }
    public int isBisestile(int quarter) {
        if (quarter == 3) {
            return 1;
        } else {
            return 0;
        }
    }
    public int getAnni(){
        return this.anni;
    }
}