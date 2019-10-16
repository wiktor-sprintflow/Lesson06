package ifology;

public class IfologyApp {
    public static void main(String[] args) {
        int number = -13;
        checkNumber(number);
    }

    static void checkNumber(int number) {
        int modulo = number % 2;
        switch (modulo) {
            case 0:
                System.out.printf("Liczba %d jest parzysta", number);
                break;
            case 1:
                System.out.printf("Liczba %d jest nieparzysta", number);
                break;
            case -1:
                System.out.printf("Liczba %d jest ujemna i nieparzysta", number);
                break;
            default:
                System.out.println("Inny typ liczby");
        }
    }
}
