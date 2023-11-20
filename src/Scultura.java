class Scultura extends OperaDarte {
    private double altezza;
    private double larghezza;
    private double profondita;
    private Supporto s1;

    public Scultura(String titolo, String artista, double altezza, double larghezza, double profondita, double altezzaS1, double larghezzaS1, double profonditaS1 ) throws Exception{
        super(titolo, artista);
        if (altezza<=0){
            throw new Exception("Inserire altezza positiva\n");
        }
        if (larghezza<=0){
            throw new Exception("Inserire larghezza positiva\n");
        }
        if (profondita<=0){
            throw new Exception("Inserire profondità positiva\n");
        }
        s1= new Supporto(altezzaS1, larghezzaS1, profonditaS1);
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.profondita = profondita;
    }

    @Override
    public double calcolaIngombro() {
        return altezza * larghezza * profondita+ s1.ingombro();
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
        return super.toString()+
                "Scultura{" +
                "altezza=" + altezza +
                ", larghezza=" + larghezza +
                ", profondita=" + profondita +
                '}';
    }
}