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
		
		//Importazioni
		Scanner scan = new Scanner(System.in);
		
		//Lista nomi
		String listaNomi[] = 
				{
				"Dua Lipa",
				"Paris Hilton",
				"Manuel Agnelli", 
				"J-Ax", 
				"Francesco Totti", 
				"Ilary Blasi",
				"Bebe Vio",
				"Luis",
				"Pardis Zarei",
				"Martina Maccherone",
				"Rachel Zeilic"
				};
		
		//Chiedi nome Utente
		System.out.println("Inserisci le tue credenziali");
		System.out.print("\r" + "Nome: ");
		String datiUtente = scan.nextLine();
		System.out.print("Cognome: ");
		datiUtente = datiUtente + " " + scan.nextLine();
		System.out.println("Sei " + datiUtente);
	}

}
