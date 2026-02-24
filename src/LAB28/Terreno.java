package LAB28;
public class Terreno {
    private Albero[][] terreno = new Albero[50][50];
    public boolean verificaSpazioPerCrescere(Albero a, boolean cresco) {
        if(!cresco){
            for(int x = 0; x<50; x++) {
                for(int y = 0; y<50; y++) {
                    if(terreno[x][y] == null) {
                        int xc = x-a.getAltezza();
                        int yc = y-a.getAltezza();
                        boolean spazioLibero = true;
                        while(xc<=x+a.getAltezza() && spazioLibero) {
                            while(yc<=y+a.getAltezza() && spazioLibero) {
                                if(xc>=0 && xc<50 && yc>=0 && yc<50) {
                                    if(terreno[xc][yc] != null) {
                                        spazioLibero = false;
                                    }
                                }
                                yc++;
                            }
                            xc++;
                        }
                        if(spazioLibero) {
                            a.setPosizione(x, y);
                            terreno[x][y] = a;
                            return true;
                        }
                    }
                }
            }
            return false;
        } else {
            int x = a.getPosizione()[0];
            int y = a.getPosizione()[1];
            int xc = x-a.getAltezza();
            int yc = y-a.getAltezza();
            boolean spazioLibero = true;
            while(xc<=x+a.getAltezza() && spazioLibero) {
                while(yc<=y+a.getAltezza() && spazioLibero) {
                    if(xc>=0 && xc<50 && yc>=0 && yc<50) {
                        if(terreno[xc][yc] != null && !terreno[xc][yc].equals(a)) {
                            spazioLibero = false;
                        }
                    }
                    yc++;
                }
                xc++;
            }
            return spazioLibero;
        }  
    }    
}
