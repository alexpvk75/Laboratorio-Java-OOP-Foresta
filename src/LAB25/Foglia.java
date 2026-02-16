package LAB25;
import java.util.Random;

public class Foglia {
    private boolean alive = false;
    private int superficie = 0;
    private int tentativi = 0;
    private Random r = new Random();

    public void nasce(int oreLuce) {
        if (!this.alive) {
            this.tentativi++;
            double probabilita = calcolaProbabilita(oreLuce);
            if (r.nextDouble(0, 1) < probabilita) {
                this.alive = true;
                this.superficie = 0;
            }
        }
    }
    public void cresce(int oreDiLuce) {
        if (this.alive) {
            double probabilita = calcolaProbabilita(oreDiLuce);
            if (r.nextDouble(0, 1) < probabilita) {
                this.superficie += 1;
            }
            if (this.superficie > oreDiLuce) {
                if (r.nextDouble(0, 1) < 0.5) {
                    this.alive = false;
                }
            }
        }
    }
    public boolean isAlive() {
        return this.alive;
    }
    public int getTentativi() {
        return this.tentativi;
    }
    public int getSuperficie() {
        return this.superficie;
    }
    private double calcolaProbabilita(int oreDiLuce) {
        if (oreDiLuce <= 2) {
            return 0.05;
        }
        if (oreDiLuce <= 6) {
            return 0.30;
        }
        if (oreDiLuce <= 8) {
            return 0.80;
        }
        return 0.90;
    }
}

