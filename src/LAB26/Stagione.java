package LAB26;
import java.util.Random;

public class Stagione {
    private int giorno = 0;
    private int numeroCasuale(int min, int max) {
        Random r = new Random();
        return r.nextInt(min, max+1);
    }

    public int nuovoGiorno() {
        this.giorno++;
        if (this.giorno > 365) {
            this.giorno = 1;
        }
        //gennaio e febbraio
        if(this.giorno <= 60){
            return numeroCasuale(0, 4);
        }
        //primavera
        if (this.giorno > 60 && this.giorno <= 150) {
            return numeroCasuale(3, 6);
        }
        //estate
        if (this.giorno > 150 && this.giorno <= 240) {
            return numeroCasuale(4, 8);
        }
        //autunno
        if (this.giorno > 240 && this.giorno <= 330) {
            return numeroCasuale(2, 5);
        }
        //dicembre
        return numeroCasuale(0, 4);
    }

    public boolean isPrimavera() {
        return (this.giorno > 60 && this.giorno <= 150);
    }
}

