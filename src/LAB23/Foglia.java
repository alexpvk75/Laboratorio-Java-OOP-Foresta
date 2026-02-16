package LAB23;
import java.util.Random;

public class Foglia {
    private boolean alive = false;
    private int superficie = 0;
    private int tentativi = 0;
    Random r = new Random();

    public void nasce(int oreluce) {
        if (!this.alive) {
            this.tentativi++;
            double probabilita = probabilita(oreluce);
            if (r.nextDouble() < probabilita) {
                this.alive = true;
                this.superficie = 0;
            } else {
                this.alive = false;
            }   
        }
    }

    public void cresce(int oreluce) {
        if (this.alive) {
            double probabilita = probabilita(oreluce);
            if (r.nextDouble() < probabilita) {
                this.superficie += 1;
            }
            if (this.superficie > oreluce) {
                if (r.nextDouble() < 0.5) {
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

    public double probabilita(int oreluce) {
        if (oreluce <= 2) {
            return 0.05;
        }
        if (oreluce <= 6) {
            return 0.30;
        }
        if (oreluce <= 8) {
            return 0.80;
        }
        return 0.90;
    }
}