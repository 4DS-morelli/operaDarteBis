public class Cornice {
        private double altezza;
        private double larghezza;
        private double spessore;

        public Cornice(double altezza, double larghezza, double spessore) throws Exception {
            if (altezza<=0){
                throw new Exception("Inserire altezza cornice positiva\n");
            }
            if (larghezza<=0){
                throw new Exception("Inserire larghezza cornice positiva\n");
            }
            if (spessore<=0){
                throw new Exception("Inserire spessore cornice positiva\n");
            }
            this.altezza = altezza;
            this.larghezza = larghezza;
            this.spessore = spessore;
        }

        public double ingombro(){
            return altezza*larghezza*spessore;
        }

        public double getAltezza() {
            return altezza;
        }

        public double getLarghezza() {
            return larghezza;
        }

        public double getSpessore() {
            return spessore;
        }

        @Override
        public String toString() {
            return "Supporto{" +
                    "altezza=" + altezza +
                    ", larghezza=" + larghezza +
                    ", profondita=" + spessore +
                    '}';
        }
}

