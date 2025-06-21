package cz.czechitas.ukol07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KnihaSluzbaTest {
    private KnihaSluzba knihaSluzba;

    @BeforeEach
    void setUp() {
        knihaSluzba = new KnihaSluzba();
    }

    @Test
    void testNacistSeznamKnih() {
        knihaSluzba.nacistSeznamKnih().add(new Kniha("Viktor Dyk", "Krysař", 1912));
        knihaSluzba.nacistSeznamKnih().add(new Kniha("Honza Vojtko", "Vztahy a mýty", 1920));
        knihaSluzba.nacistSeznamKnih().add(new Kniha("Ivo Pajorek", "Mencius", 2023));
        List<Kniha> knihy = knihaSluzba.nacistSeznamKnih();
        assertEquals(knihy.size(), 3, "Seznam obsahuje tři knihy.");
    }


    @Test
    void testNacistKnihyAutora() {
        knihaSluzba.nacistSeznamKnih().add(new Kniha("Viktor Dyk", "Krysař", 1912));
        knihaSluzba.nacistSeznamKnih().add(new Kniha("Viktor Dyk", "Devátá vlna", 2014));
        knihaSluzba.nacistSeznamKnih().add(new Kniha("Ivo Pajorek", "Mencius", 2023));
        List<Kniha> knihy = knihaSluzba.nacistKnihyAutora("Viktor Dyk");
        assertEquals(knihy.size(), 2, "Seznam obsahuje dvě knihy Viktora Dyka.");
        List<Kniha> knihas = knihaSluzba.nacistKnihyAutora("Božena Němcová");
        assertEquals(knihas.size(), 0, "Seznam neobsahuje knihy Boženy Němcové.");
        assertTrue(knihas.isEmpty(), "Seznam je prázdný.");
    }

    @Test
    void testNacistKnihyRokVydani() {
        knihaSluzba.nacistSeznamKnih().add(new Kniha("Viktor Dyk", "Krysař", 1912));
        knihaSluzba.nacistSeznamKnih().add(new Kniha("Viktor Dyk", "Devátá vlna", 2014));
        knihaSluzba.nacistSeznamKnih().add(new Kniha("Ivo Pajorek", "Mencius", 2023));
        List<Kniha> kniha = knihaSluzba.nacistKnihyRokVydani(2014);
        assertEquals(1, kniha.size(), "Seznam obsahuje jednu knihu z roku 2014.");
        List<Kniha> knihas = knihaSluzba.nacistKnihyRokVydani(1905);
        assertTrue(knihas.isEmpty(), "Seznam neobsahuje knihy z roku 1905.");
    }
}





