import java.util.InputMismatchException;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int capacita=0, scelta;
        String luogo, nome;
        boolean flag= false;
        System.out.print("Inserisci il nome della collezione: ");
        nome = input.next();
        System.out.print("Inserisci il luogo della collezione: ");
        luogo = input.next();
        System.out.print("Inserisci la capacità della collezione: ");
        capacita = input.nextInt();

        Collezione miaCollezione=null;
        OperaDarte nuovaOpera= null;

        do {
            try {
                flag=true;
                miaCollezione = new Collezione(nome, capacita, luogo);
            } catch (Exception e) {
                System.out.print(e.getMessage());
                System.out.print("Inserisci la capacità della collezione: ");
                capacita=input.nextInt();
                flag=false;
            }
        }while(!flag);

        do {
            System.out.println("Menu:");
            System.out.println("1. Inserisci Opera");
            System.out.println("2. Stampa Collezione");
            System.out.println("3. Stampa Ingombro di un'Opera");
            System.out.println("0. Esci");

            do {
                try {
                    flag=true;
                    System.out.print("Inserisci la tua scelta: ");
                    scelta = input.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Errore: inserisci un numero intero per la scelta.");
                    flag=false;
                    scelta=input.nextInt();
                }
            }while(!flag);


            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il titolo dell'opera: ");
                    String titolo = input.next();
                    System.out.print("Inserisci l'artista dell'opera: ");
                    String artista = input.next();
                    int tipoOpera;
                    do {
                        System.out.print("Tipo di opera (1. Quadro, 2. Scultura): ");
                        tipoOpera = input.nextInt();
                    }while(tipoOpera!=1 && tipoOpera!=2);

                    if (tipoOpera == 1) {
                        System.out.print("Inserisci altezza del quadro: ");
                        double altezzaQuadro = input.nextDouble();
                        System.out.print("Inserisci larghezza del quadro: ");
                        double larghezzaQuadro = input.nextDouble();
                        try {
                            nuovaOpera = new Quadro(titolo, artista, altezzaQuadro, larghezzaQuadro);
                            miaCollezione.inserisciOpera(nuovaOpera);
                            System.out.println("Quadro inserito con successo!");
                        }catch (Exception e){
                            System.out.print(e.getMessage());
                        }
                    } else {
                        System.out.print("Inserisci altezza della scultura: ");
                        double altezzaScultura = input.nextDouble();
                        System.out.print("Inserisci larghezza della scultura: ");
                        double larghezzaScultura = input.nextDouble();
                        System.out.print("Inserisci profondità della scultura: ");
                        double profonditaScultura = input.nextDouble();
                        try {
                            nuovaOpera = new Scultura(titolo, artista, altezzaScultura, larghezzaScultura, profonditaScultura);
                            miaCollezione.inserisciOpera(nuovaOpera);
                            System.out.println("Scultura inserita con successo!");
                        }catch (Exception e){
                            System.out.print(e.getMessage());
                        }
                    }

                    break;

                case 2:
                    System.out.print(miaCollezione.stampaCollezione());
                    break;

                case 3:
                    System.out.print("Inserisci il titolo dell'opera: ");
                    titolo = input.next();
                    System.out.print("Inserisci l'artista dell'opera: ");
                    artista = input.next();
                    do {
                        System.out.print("Tipo di opera (1. Quadro, 2. Scultura): ");
                        tipoOpera = input.nextInt();
                    }while(tipoOpera!=1 && tipoOpera!=2);

                    if (tipoOpera == 1) {
                        System.out.print("Inserisci altezza del quadro: ");
                        double altezzaQuadro = input.nextDouble();
                        System.out.print("Inserisci larghezza del quadro: ");
                        double larghezzaQuadro = input.nextDouble();
                        try {
                            nuovaOpera = new Quadro(titolo, artista, altezzaQuadro, larghezzaQuadro);
                        }catch (Exception e){
                            System.out.print(e.getMessage());
                        }
                    } else {
                        System.out.print("Inserisci altezza della scultura: ");
                        double altezzaScultura = input.nextDouble();
                        System.out.print("Inserisci larghezza della scultura: ");
                        double larghezzaScultura = input.nextDouble();
                        System.out.print("Inserisci profondità della scultura: ");
                        double profonditaScultura = input.nextDouble();
                        try {
                            nuovaOpera = new Scultura(titolo, artista, altezzaScultura, larghezzaScultura, profonditaScultura);
                        }catch (Exception e){
                            System.out.print(e.getMessage());
                        }
                    }

                    try{
                        System.out.print("Ingombro opera: "+ miaCollezione.stampaIngombroOpera(nuovaOpera));
                    }catch (Exception e){
                        System.out.print(e.getMessage());
                    }
                    break;

                case 0:
                    System.out.println("Uscita dal programma.");
                    break;

                default:
                    System.out.println("Scelta non valida. Riprova.");
            }

        } while (scelta != 0);
    }
}
