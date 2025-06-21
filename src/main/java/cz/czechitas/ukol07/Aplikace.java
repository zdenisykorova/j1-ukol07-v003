package cz.czechitas.ukol07;

/**
 * Spouštěcí třída aplikace
 */
public class Aplikace {
    public static void main(String[] args) {

        KnihaSluzba knihaSluzba = new KnihaSluzba();


        knihaSluzba.nacistSeznamKnih();
        for (Kniha kniha : knihaSluzba.nacistSeznamKnih()) {
            System.out.println(kniha);
        }
        int pocetKnih = knihaSluzba.nacistSeznamKnih().size();
        System.out.println("Počet knih v databázi: " + pocetKnih);

        //knihaSluzba.nacistKnihyAutora("Karel Čapek");
        System.out.println(knihaSluzba.nacistKnihyAutora("Karel Čapek"));

        //knihaSluzba.nacistKnihyRokVydani(1845);
        System.out.println(knihaSluzba.nacistKnihyRokVydani(1845));


    }
}
