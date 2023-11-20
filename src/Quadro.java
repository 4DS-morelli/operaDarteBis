class Quadro extends OperaDarte {
    private double altezza;
    private double larghezza;

    private Cornice c1;

    public Quadro(String titolo, String artista, double altezza, double larghezza, double altezzaC1, double larghezzaC1, double spessoreC1) throws Exception{
        super(titolo, artista);
        if (altezza<=0){
            throw new Exception("Inserire altezza positiva\n");
        }
        if (larghezza<=0){
            throw new Exception("Inserire larghezza positiva\n");
        }
        c1=new Cornice(altezzaC1, larghezzaC1, spessoreC1);
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    @Override
    public double calcolaIngombro() {
        return altezza * larghezza+ c1.ingombro();
    }

    public double getAltezza() {
        return altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Quadro{" +
                "altezza=" + altezza +
                ", larghezza=" + larghezza +
                '}';
    }
}
