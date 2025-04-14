package view;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();
        boolean attivo = true;

        while (attivo) {
            todoList.stampaMenu();
            int scelta = scanner.nextInt();
            scanner.nextLine(); // Pulisce il buffer

            switch (scelta) {
                case 1:
                    todoList.inserisciTodo(scanner);
                    break;
                case 2:
                    todoList.eliminaTodo(scanner);
                    break;
                case 3:
                    todoList.stampaLista();
                    break;
                case 4:
                    attivo = false;
                    System.out.println("Chiusura programma...");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }

        scanner.close();
    }
}