package view;

import java.util.Scanner;

import model.ToDo;

public class TodoList {
    private ToDo[] lista;

    public TodoList() {
        lista = new ToDo[10];
    }

    public void inserisciTodo(Scanner scanner) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null || lista[i].getDescrizione().equals("vuoto")) {
                System.out.print("Inserisci descrizione: ");
                String descrizione = scanner.nextLine();
                System.out.print("Inserisci data (es: 2025-04-14): ");
                String data = scanner.nextLine();
                lista[i] = new ToDo(descrizione, data);
                System.out.println("TODO aggiunto nella posizione " + i);
                return;
            }
        }
        System.out.println("Lista piena! Elimina un elemento prima di aggiungerne uno nuovo.");
    }

    public void eliminaTodo(Scanner scanner) {
        System.out.print("Inserisci ID da eliminare (0-9): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Pulisce il buffer
        if (id >= 0 && id < lista.length && lista[id] != null) {
            lista[id] = new ToDo("vuoto", "");
            System.out.println("Elemento " + id + " eliminato.");
        } else {
            System.out.println("ID non valido o già vuoto.");
        }
    }

    public void stampaLista() {
        System.out.println("\n--- Lista TODO ---");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null || lista[i].getDescrizione().equals("vuoto")) {
                System.out.println(i + ": vuoto");
            } else {
                System.out.println(i + ": " + lista[i]);
            }
        }
        System.out.println("-------------------");
    }

    public void stampaMenu() {
        System.out.println("\n---- Menu ----");
        System.out.println("1. Inserisci nuovo todo");
        System.out.println("2. Elimina todo");
        System.out.println("3. Stampa intera lista");
        System.out.println("4. Chiudi Programma");
        System.out.println("---------------");
        System.out.print("Scelta: ");
    }
}
