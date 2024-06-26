public class App {
    public static void main(String[] args) throws Exception {

        // presentazione();
        // studente();
        // contoBancario();
        // elencoTelefonico();
        // sistemaDiVotazione();
        // SistemadiPrenotazioneHotel();
        // impiegato_Manager();
        // sistemaDiPrenotazioneAlberghiera();
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

    public static void studente() throws Exception {
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

    public static void contoBancario() throws Exception{
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

    public static void elencoTelefonico() throws Exception {
        ElencoTelefonico elencoTelefonico = new ElencoTelefonico();

        try {
            Contatto contatto1 = new Contatto("Gigi Ilbullo", " ");
            elencoTelefonico.aggiungiContatto(contatto1);
            System.out.println("Contatto aggiunto: " + contatto1.getNome() + ", " + contatto1.getNumeroTelefono());
        } catch (IllegalArgumentException e) {
            System.out.println("Errore nell'aggiunta del contatto: " +  e.getMessage());
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
            System.out.println("Contatto trovato : " + risultatoRicerca.getNome() + " telefono: " + risultatoRicerca.getNumeroTelefono());
        } else {
            System.out.println(nomeDaCercare + " non c'è");
        }

        String nomeDaRimuovere = "Lupo Lucio";
        elencoTelefonico.rimuoviContatto(nomeDaRimuovere);
        System.out.println(nomeDaRimuovere + " rimosso");
    }

    public static void sistemaDiVotazione() throws Exception{
        SistemaElettorale sistemaElettorale = new SistemaElettorale();

        Candidato candidato1 = new Candidato("Giorgia", "Tettoni");
        Candidato candidato2 = new Candidato("Giuseppe", "Duca");

        sistemaElettorale.registraCandidato(candidato1);
        sistemaElettorale.registraCandidato(candidato2);

        Elettore elettore1 = new Elettore("Lupo", "Lucio");
        Elettore elettore2 = new Elettore("Pippo", "Baudo");

        try {
            elettore1.vota(candidato1, sistemaElettorale);
            elettore2.vota(candidato2, sistemaElettorale);
            // seconda votazione di candidato1 dovrebbe dare errore 
            elettore1.vota(candidato1, sistemaElettorale); 
        } catch (IllegalArgumentException e) {
            System.out.println("votazione illegale " + e.getMessage());
        }

        
        sistemaElettorale.stampaRisultati();
    }

    public static void SistemadiPrenotazioneHotel() throws Exception{
        SistemaPrenotazioni sistema = new SistemaPrenotazioni();

        Camera camera1 = new Camera(101, "Singola");
        Camera camera2 = new Camera(102, "Doppia");

        sistema.aggiungiCamera(camera1);
        
        sistema.aggiungiCamera(camera2);

        Cliente cliente1 = new Cliente("Pippo", "Baudo", "123");
        Cliente cliente2 = new Cliente("Lupo", "Lucio", "456");

        try {
            sistema.effettuaPrenotazione(cliente1, camera1);

            sistema.effettuaPrenotazione(cliente2, camera2);

            sistema.modificaPrenotazione(cliente1, camera2);

            sistema.cancellaPrenotazione(cliente2);

            sistema.modificaPrenotazione(cliente1, camera2);
            sistema.stampaPrenotazioni();
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }

        sistema.stampaPrenotazioni();
    }

    public static void impiegato_Manager() throws Exception{
        Impiegato[] impiegati = new Impiegato[3];
        
        impiegati[0] = new Impiegato("Pippo", "Baudo", 1500);
        impiegati[1] = new Manager("Lupo", "Lucio", 2000, 800);
        impiegati[2] = new Impiegato("Gino", "Vagino", 1200);

        try {
            for (Impiegato impiegato : impiegati) {
                impiegato.aumentaSalario(20);
            }
        } catch (Exception e) {
            System.out.println("Errore nell'aumento del salario: " + e.getMessage());
        }

        for (Impiegato impiegato : impiegati) {
            System.out.println(impiegato);
        }
    }

    public static void sistemaDiPrenotazioneAlberghiera() throws Exception{
        SistemaPrenotazioneAlberghiera sistema = new SistemaPrenotazioneAlberghiera();

        CameraAlbergo singola1 = new CameraSingola(666);
        CameraAlbergo doppia1 = new CameraDoppia(777);
        CameraAlbergo suite1 = new Suite(123);

        try {
            sistema.aggiungiCamera(singola1);
            sistema.aggiungiCamera(doppia1);
            sistema.aggiungiCamera(suite1);

            sistema.stampaCamereDisponibili();

            sistema.rimuoviCamera(doppia1);

            sistema.stampaCamereDisponibili();
        } catch (Exception e) {
            System.out.println("Errore nella gestione delle camere: " + e.getMessage());
        }
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
 * ---------------------------------------------------------------------------
 * 
 * POMERIGGIO
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES5: Sistema di Votazione
 * 
 * Crea classi per Candidato e Elettore, dove ogni Elettore può votare per un
 * Candidato. Implementa un meccanismo usando mappe per tenere traccia dei voti
 * ricevuti da ogni candidato. Assicurati di gestire le eccezioni per casi come
 * doppi voti o voti a candidati non esistenti.
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES6: Sistema di Prenotazione Hotel
 * 
 * Definisci classi per Camera, Cliente, e Prenotazione. Utilizza una mappa per
 * associare clienti a prenotazioni e una lista di camere disponibili.
 * Implementa metodi per effettuare, modificare e cancellare prenotazioni,
 * assicurandoti di gestire eccezioni come camere non disponibili o
 * cancellazioni tardive.
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES7: Impiegato e Manager
 * 
 * Crea una classe Impiegato con attributi come nome, salario e metodi per
 * aumentaSalario(int percentuale). Deriva da questa una classe Manager che
 * aggiunge l'attributo bonus. Il metodo aumentaSalario del manager dovrebbe
 * considerare anche il bonus nell'aumento. Mostra come puoi utilizzare il
 * polimorfismo per gestire diversi tipi di impiegati in un array di tipo
 * Impiegato.
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES8: Sistema di Prenotazione Alberghiera
 * 
 * Progetta una classe astratta CameraAlbergo con metodi come calcolaCosto() e
 * numeroLetti(). Deriva da questa diverse classi specifiche come CameraSingola,
 * CameraDoppia e Suite. Implementa calcolaCosto in modo diverso per ogni tipo
 * di camera. Utilizza una collezione per gestire tutte le camere disponibili in
 * un albergo.
 * 
 * ---------------------------------------------------------------------------
 */