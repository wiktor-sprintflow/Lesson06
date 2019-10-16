package switchtest;

public class SwitchTest {
    public static void main(String[] args) {

        String name = "Wojtek";

        switch (name){
            case "Jan":
                System.out.println("Witaj Jan");
                break;
            case "Zosia":
                System.out.println("Witaj Zosia");
                break;
            case "Wojtek":
                System.out.println("Witaj Wojtek");
                break;
            default:
                System.out.println("Witaj nieznajomy");
        }
    }
}
