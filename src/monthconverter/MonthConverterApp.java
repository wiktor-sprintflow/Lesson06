package monthconverter;

public class MonthConverterApp {
    public static void main(String[] args) {
        MonthConverter monthConverter = new MonthConverter();

        System.out.println(monthConverter.converter(-4));
        System.out.println(monthConverter.converter(0));
        System.out.println(monthConverter.converter(3));
        System.out.println(monthConverter.converter(6));
        System.out.println(monthConverter.converter(10));
        System.out.println(monthConverter.converter(12));
        System.out.println(monthConverter.converter(13));
    }
}
