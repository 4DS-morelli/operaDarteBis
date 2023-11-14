public class SculturaDeperibile extends Scultura{

    private int eta; //giorni
    private double fattDeperibilita; // m^3 al giorno

    public SculturaDeperibile(String titolo, String artista, double altezza, double larghezza, double profondita, int eta, double fattDeperibilita) throws Exception{
        super(titolo, artista, altezza, larghezza, profondita);
        if (eta<=0){
            throw new Exception("Inserire età positiva\n");
        }
        this.eta=eta;
        this.fattDeperibilita=fattDeperibilita;
    }

    public SculturaDeperibile(SculturaDeperibile sd1) throws Exception{
        super(sd1.titolo, sd1.artista, sd1.getAltezza(), sd1.getLarghezza(), sd1.getProfondita());
        if (eta<=0){
            throw new Exception("Inserire età positiva\n");
        }
        this.eta=sd1.getEta();
        this.fattDeperibilita=sd1.getFattDeperibilita();
    }

    public int getEta() {
        return eta;
    }

    public double getFattDeperibilita() {
        return fattDeperibilita;
    }

    public double calcolaIngombro() {
        return super.calcolaIngombro()-(eta*fattDeperibilita);
    }

    @Override
    public String toString() {
        return  super.toString() +
                "SculturaDeperibile{" +
                "eta=" + eta +
                ", fattDeperibilita=" + fattDeperibilita +
                '}';
    }
}
