public class App {
    public static void main(String[] args) throws Exception {

        // presentazione();
        // studente();
        // contoBancario();
        elencoTelefonico();
    }

    public static void presentazione() throws Exception {
        Prenotazione teatro = new Prenotazione();

        try {
            teatro.prenota(10);
            System.out.println("Posto prenotato con successo.");
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Prenotazione del posto fallita: " + e.getMessage());
        }

        try {
            if (teatro.isDisponibile(10)) {
                System.out.println("Il posto è disponibile.");
            } else {
                System.out.println("Il posto è già prenotato.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Verifica disponibilità del posto fallita: " + e.getMessage());
        }

        // se commento annullaPrenotazione() in ciSonoPostiDisponibili il numero 10 risulta prenotato
        try {
            teatro.annullaPrenotazione(10);
            System.out.println("Prenotazione del posto annullata con successo.");
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Annullamento della prenotazione del posto fallita: " + e.getMessage());
        }

        if (teatro.ciSonoPostiDisponibili()) {
            System.out.println("Ci sono posti disponibili.");
        } else {
            System.out.println("Nessun posto disponibile.");
        }

        teatro.stampaPosti();
    }

    public static void studente() {
        Studente studente = new Studente("Mario", "Rossi", "12345");

        try {
            studente.aggiungiVoto(8);
            System.out.println("Voto aggiunto con successo.");
        } catch (IllegalArgumentException e) {
            System.out.println("Errore nell'aggiunta del voto: " + e.getMessage());
        }

        try {
            studente.aggiungiVoto(10);
            System.out.println("Voto aggiunto con successo.");
        } catch (IllegalArgumentException e) {
            System.out.println("Errore nell'aggiunta del voto: " + e.getMessage());
        }

        try {
            studente.aggiungiVoto(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Errore nell'aggiunta del voto: " + e.getMessage());
        }

        try {
            studente.aggiungiVoto(35); 
        } catch (IllegalArgumentException e) {
            System.out.println("Errore nell'aggiunta del voto: " + e.getMessage());
        }

        studente.stampaDettagli();
    }

    public static void contoBancario(){
        ContoBancario conto = new ContoBancario("Gino Vagino", 500.0);

        try {
            conto.deposita(500.0);
            System.out.println("Deposito effettuato con successo. Saldo attuale: " + conto.getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println("Errore nel deposito: " + e.getMessage());
        }

        try {
            conto.preleva(200.0);
            System.out.println("Prelievo effettuato con successo. Saldo attuale: " + conto.getSaldo());
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Errore nel prelievo: " + e.getMessage());
        }

        try {
            conto.preleva(2000.0);
            System.out.println("Prelievo effettuato con successo. Saldo attuale: " + conto.getSaldo());
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Errore nel prelievo: " + e.getMessage());
        }

        try {
            conto.preleva(-50.0);
            System.out.println("Prelievo effettuato con successo. Saldo attuale: " + conto.getSaldo());
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Errore nel prelievo: " + e.getMessage());
        }

        System.out.println("Saldo finale: " + conto.getSaldo());
    }

    public static void elencoTelefonico() {
        ElencoTelefonico elencoTelefonico = new ElencoTelefonico();

        try {
            Contatto contatto1 = new Contatto("Gigi Ilbullo", "0123456789");
            elencoTelefonico.aggiungiContatto(contatto1);
            System.out.println("Contatto aggiunto: " + contatto1.getNome() + ", " + contatto1.getNumeroTelefono());
        } catch (IllegalArgumentException e) {
            System.out.println("Errore nell'aggiunta del contatto: " + e.getMessage());
        }

        try {
            Contatto contatto2 = new Contatto("Lupo Lucio", "9876543210");
            elencoTelefonico.aggiungiContatto(contatto2);
            System.out.println("Contatto aggiunto: " + contatto2.getNome() + ", " + contatto2.getNumeroTelefono());
        } catch (IllegalArgumentException e) {
            System.out.println("Errore nell'aggiunta del contatto: " + e.getMessage());
        }
        try {
            Contatto contatto2 = new Contatto("Pippo Baudo", "123456789");
            elencoTelefonico.aggiungiContatto(contatto2);
            System.out.println("Contatto aggiunto: " + contatto2.getNome() + ", " + contatto2.getNumeroTelefono());
        } catch (IllegalArgumentException e) {
            System.out.println("Errore nell'aggiunta del contatto: " + e.getMessage());
        }

        String nomeDaCercare = "Pippo Baudo";
        Contatto risultatoRicerca = elencoTelefonico.cercaContatto(nomeDaCercare);
        if (risultatoRicerca != null) {
            System.out.println("Contatto trovato : " + risultatoRicerca.getNome() + "- telefono: " + risultatoRicerca.getNumeroTelefono());
        } else {
            System.out.println(nomeDaCercare + " non c'è");
        }

        String nomeDaRimuovere = "Lupo Lucio";
        elencoTelefonico.rimuoviContatto(nomeDaRimuovere);
        System.out.println(nomeDaRimuovere + " rimosso");
    }
}


/**
 * TODO:
 * 
 * ES0: Creare un repository su GitHub con il seguente nome:
 * 2024-06-26-java-end-1
 * 
 * Caricare tutti gli esercizi in un unico progetto sulla stessa repo
 * 
 * 
 * ES1: Sistema di Prenotazioni
 * 
 * Crea una classe Prenotazione che possa essere utilizzata da un teatro per
 * tenere traccia delle prenotazioni dei posti. Utilizza un array di booleani
 * per rappresentare i posti: true se il posto è prenotato, false altrimenti.
 * Implementa metodi per prenotare un posto, annullare la prenotazione e
 * verificare se un o piu' posti sono disponibili.
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES2: Registro Studenti
 * 
 * Crea una classe Studente con attributi come nome, matricola, e voti (usa un
 * ArrayList). Aggiungi metodi per aggiungere voti, calcolare la media dei voti,
 * e stampare i dettagli dello studente. Implementa la gestione delle eccezioni
 * per evitare errori nell'inserimento dei voti.
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES3: Simulatore di Banca
 * 
 * Definisci una classe ContoBancario con metodi per depositare denaro,
 * prelevare denaro e ottenere il saldo. Assicurati di gestire il caso in cui si
 * tenta di prelevare più denaro di quanto disponibile con un'eccezione.
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES4: Elenco Telefonico
 * 
 * Implementa una classe Contatto che rappresenti un contatto telefonico con
 * nome e numero di telefono (stringa). Crea una classe ElencoTelefonico che gestisca una
 * lista di contatti. Includi metodi per aggiungere, rimuovere e cercare
 * contatti. Gestisci eventuali eccezioni relative all'inserimento di numeri di
 * telefono non validi.
 * 
 */