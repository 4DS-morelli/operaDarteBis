public class Supporto {
    private double altezza;
    private double larghezza;
    private double profondita;

    public Supporto(double altezza, double larghezza, double profondita) throws Exception{
        if (altezza<=0){
            throw new Exception("Inserire altezza sipporto positiva\n");
        }
        if (larghezza<=0){
            throw new Exception("Inserire larghezza supporto positiva\n");
        }
        if (profondita<=0){
            throw new Exception("Inserire profondità supporto positiva\n");
        }
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.profondita = profondita;
    }

    public double ingombro(){
        return altezza*larghezza*profondita;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public double getProfondita() {
        return profondita;
    }

    @Override
    public String toString() {
        return "Supporto{" +
                "altezza=" + altezza +
                ", larghezza=" + larghezza +
                ", profondita=" + profondita +
                '}';
    }
}
