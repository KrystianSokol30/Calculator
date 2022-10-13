import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Witaj w aplikacji kalkulator");

        System.out.println("Podaj pierwszą liczbę");
        double number1 = scan.nextDouble();
        System.out.println("Podaj drugą liczbę");
        double number2 = scan.nextDouble();

        System.out.println("Wybierz operacje:");
        System.out.println("1.Dodawanie");
        System.out.println("2.Odejmowanie");
        System.out.println("3.Mnożenie");
        System.out.println("4.Dzielenie");
        System.out.println("5.Reszta z dzielenia");

        int option = scan.nextInt();

        switch (option){
            case 1:
                add(number1, number2);
                break;
            case 2:
                substract(number1, number2);
                break;
            case 3:
                multiple(number1, number2);
                break;
            case 4:
                devide(number1,number2);
                break;
            case 5:
                rest(number1, number2);
                break;
        }
    }
    public static void add(double a, double b){
        System.out.println("Wynik działania to: " + (a + b)); ;
    }
    public static void substract(double a, double b){
        System.out.println("Wynik działania to: " + (a - b)); ;
    }
    public static void multiple(double a, double b){
        System.out.println("Wynik działania to: " + (a * b)); ;
    }
    public static void devide(double a, double b){
        System.out.println("Wynik działania to: " + (a / b));
    }
    public static void rest(double a, double b){
        System.out.println("Reszta z dzielenia to: " + (a % b));
    }
}