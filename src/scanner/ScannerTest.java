package scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        String name = klawiatura.nextLine();
        System.out.println("Podaj wiek");
        int age = klawiatura.nextInt();
        klawiatura.nextLine(); //nowa linia żeby wczytać enter po podaniu inta
        System.out.println("Podaj ulubiony kolor");
        String color = klawiatura.nextLine();
        klawiatura.close();

        System.out.println("Twoje imie: " + name + ", wiek: " + age + ". Twój ulubiony kolor to: " + color);

    }
}
