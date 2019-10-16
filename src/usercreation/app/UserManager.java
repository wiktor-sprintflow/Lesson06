package usercreation.app;

import usercreation.data.User;

import java.util.Scanner;

public class UserManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        String firstName = sc.nextLine();
        System.out.println("Podaj nazwisko: ");
        String lastName = sc.nextLine();
        System.out.println("Podaj wiek: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj pesel: ");
        String pesel = sc.nextLine();
        sc.close();

        User user = new User(pesel, age, firstName, lastName);

        System.out.println("Imię: " + user.getFirstName() + ", nazwisko: " + user.getLastName() +
                ", pesel: " + user.getPesel() + ", wiek: " + user.getAge());


    }
}
