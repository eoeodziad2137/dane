import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class dane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz opcję metody:");
        System.out.println("1. Imię");
        System.out.println("2. Imię i nazwisko");
        System.out.println("3. Imię nazwisko i wiek");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Podaj imię: ");
                String imie = scanner.next();
                zapisz(imie);
                break;
            case 2:
                System.out.println("Podaj imię: ");
                String imie2 = scanner.next();
                System.out.println("Podaj nazwisko: ");
                String nazwisko2 = scanner.next();
                zapisz(imie2, nazwisko2);
                break;
            case 3:
                System.out.println("Podaj imię: ");
                String imie3 = scanner.next();
                System.out.println("Podaj nazwisko: ");
                String nazwisko3 = scanner.next();
                System.out.println("Podaj wiek: ");
                int wiek3 = scanner.nextInt();
                zapisz(imie3, nazwisko3, wiek3);
                break;
            default:
                System.out.println("Nieprawidłowe dane.");
                break;
        }
        scanner.close();
    }

    public static void zapisz(String imie) {
        try {
            FileWriter writer = new FileWriter("dane.txt");
            writer.write("Imię: " + imie);
            writer.close();
            System.out.println("Dane zapisane do pliku.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void zapisz(String imie, String nazwisko) {
        try {
            FileWriter writer = new FileWriter("dane.txt");
            writer.write("Imię:  " + imie + " \n");
            writer.write("Nazwisko:  " + nazwisko);
            writer.close();
            System.out.println("Dane zapisane do pliku.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void zapisz(String imie, String nazwisko, int wiek) {
        try {
            FileWriter writer = new FileWriter("dane.txt");
            writer.write("Imię:  " + imie + " \n");
            writer.write("Nazwisko:  " + nazwisko + " \n");
            writer.write("Wiek:  " + wiek);
            writer.close();
            System.out.println("Dane zapisane do pliku.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}