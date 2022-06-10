package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
	/*
	 * Istruzioni:
	 * 1. Crea e inizializza array con nomi invitati
	 * 2. Chiedi nome all'utente
	 * 3. Verifica se il nome è nell'array
	 * 		Crea variabile booleana trovato = false
	 * 		Controlla se nomeUtente corrisponde a nomeLista[i] per un numero di volte quanto array.length
	 * 			Se non corrisponde, i++ e ripeti
	 * 			Se corrisponde, trovato = true ed esci dal ciclo
	 * 4. Se trovato, print "puoi entrare"
	 * 5. Altrimenti print "Accesso negato"
	 * 
	 * BONUS: Se hai usato un ciclo for, usa un ciclo while, e viceversa
	 * 
	 * Lista Invitati:
	 * Dua Lipa, Paris Hilton, Manuel Agnelli,
	 * J-Ax, Francesco Totti, Ilary Blasi,
	 * Bebe Vio, Luis, Pardis Zarei,
	 * Martina Maccherone, Rachel Zeilic
	 */

	public static void main(String[] args) {
		//Lista nomi
		String listaNomi[] = 
				{
				"DuaLipa",
				"ParisHilton",
				"ManuelAgnelli", 
				"J-Ax", 
				"FrancescoTotti", 
				"IlaryBlasi",
				"BebeVio",
				"Luis",
				"PardisZarei",
				"MartinaMaccherone",
				"RachelZeilic"
				};
		
		//Variabili
		String confermo = null;
		String datiUtente;
		
		Scanner scan = new Scanner(System.in);
		
		//Alla fine dell'esecuzione, l'utente può decidere se chiudere il programma o ripartire dall'inizio
		do {
			//Questo ciclo si ripete se l'utente non conferma i dati inseriti
			do {
				//Chiedi nome Utente
				System.out.println("Inserisci le tue credenziali");
				System.out.print("\r" + "Nome: ");
				datiUtente = scan.nextLine();

				//Alcuni utenti non hanno cognome
				System.out.println("(Lascia vuoto se non hai usato il cognome durante la registrazione)");
				System.out.print("Cognome: ");
				datiUtente = datiUtente + scan.nextLine(); //Qui verrà salvato il nome dell'utente
				System.out.print("Confermi i dati inseriti?\nScrivi 'SI' per confermare: ");
				confermo = scan.nextLine();

				//Chiedo se l'utente è sicuro dei dati inseriti
				if (confermo.equalsIgnoreCase("SI")) { //Se risponde SI, esegue il controllo array
				} else {
					System.out.println("\nRisposta non valida. Riprova.\n");
				}
			} while (!(confermo.equalsIgnoreCase("SI")));
			//Confronto con i nomi della lista
			int counter = 0;
			boolean check = false;
			//Versione base, con ciclo WHILE
			while (check == false && counter < listaNomi.length) {
				if (datiUtente.equalsIgnoreCase(listaNomi[counter])) {
					check = true;
				} else {
					counter++;
				}
			}
			
			//VERSIONE BONUS, con ciclo FOR
//			for (counter = 0; counter < listaNomi.length; counter++ ) {
//				if(datiUtente.equalsIgnoreCase(listaNomi[counter])) {
//					check = true;
//				} 
//			}
			
			//Comunico se ho trovato il nome nella lista
			if(check) {
				System.out.println("Accesso consentito. Divertiti!");
			}
			else {
				System.out.println("Accesso negato. Torna a casa!");
			}
			
			System.out.println("\nVuoi chiudere la checklist? Scrivi 'CHIUDI' per confermare o\npremi INVIO per ricominciare:");
			confermo = scan.nextLine();
		} while (!(confermo.equalsIgnoreCase("CHIUDI")));
		
		scan.close();

	}

}
