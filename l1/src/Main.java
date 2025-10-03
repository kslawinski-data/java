import java.util.Scanner;
//Znalezione na javastart.pl potrzebne do wprowadzania danych przez użytkownika
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //To samo co w pierwszym komentarzu
        Person[] Persons = new Person[5];
        //Pętla for zaporzyczona z c, menu 2 poziomowe poznane w c
        for (; ; ) {
            System.out.println("---MENU---");
            System.out.println("1. Tworzenie osoby (0-4)");
            System.out.println("2. Wyswietlenie osoby (0-4)");
            System.out.println("3. Zmiana osoby (0-4)");
            System.out.println("4. Usunięcie osoby (0-4)");
            System.out.println("5. Wyjscie");
            int i = scan.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Wprowadz numer osoby:");
                    int a = scan.nextInt();
                    //Czyszczenie buforu bo inaczej nie działało to poprawnie
                    scan.nextLine();
                    if (Persons[a] == null) {
                        Persons[a] = new Person();
                    }
                    System.out.println("Wprowadz imie osoby");
                    Persons[a].name = scan.nextLine();
                    System.out.println("Wprowadz miasto osoby");
                    Persons[a].city = scan.nextLine();
                    System.out.println("Podaj numer osoby");
                    Persons[a].phone = scan.nextInt();
                    break;

                case 2:
                    System.out.println("Wprowadz numer osoby:");
                    int b = scan.nextInt();
                    scan.nextLine();
                    if (Persons[b] == null) {
                        System.out.println("Dana osoba nie istnieje");
                    } else {
                        System.out.println(Persons[b].name);
                        System.out.println(Persons[b].city);
                        System.out.println(Persons[b].phone);
                    }
                    break;
                case 3:
                        /*Nie chciałem robić 3 poziomu menu aby wprowadzać zmiany tylko jednej wartości ale mniej więcej wyglądało by to tak:
                        System.out.println("Wprowadz numer osoby:");
                        int c = scan.nextInt();
                        scan.nextLine();
                        if (Persons[c] == null) {
                            System.out.println("Dana osoba nie istnieje");
                        }
                        else {
                            System.out.println("1. Zmiana imienia");
                            System.out.println("2. Zmiana miasta");
                            System.out.println("3. Zmiana telefonu");
                            int e = scan.nextInt();
                            switch (e) {
                                case 1:
                                    System.out.println("Wprowadz imie osoby");
                                    Persons[c].name = " ";
                                    Persons[c].name = scan.nextLine();
                                    scan.nextLine();
                                    break;
                                case 2:
                                    System.out.println("Wprowadz miasto osoby");
                                    Persons[c].city = " ";
                                    Persons[c].city = scan.nextLine();
                                    scan.nextLine();
                                    break;
                                case 3:
                                    System.out.println("Podaj numer osoby");
                                    Persons[c].phone = 0;
                                    Persons[c].phone = scan.nextInt();
                                    scan.nextLine();
                                    break;
                                default:
                                    System.out.println("Zły wybór");
                                    return;
                            }

                        }
                         */
                    System.out.println("Wprowadz numer osoby:");
                    int c = scan.nextInt();
                    scan.nextLine();
                    if (Persons[c] == null) {
                        System.out.println("Dana osoba nie istnieje");
                    }
                    else {
                        System.out.println("Wprowadz imie osoby");
                        Persons[c].name = scan.nextLine();
                        System.out.println("Wprowadz miasto osoby");
                        Persons[c].city = scan.nextLine();
                        System.out.println("Podaj numer osoby");
                        Persons[c].phone = scan.nextInt();
                    }
                        break;
                        case 4:
                            //Na zajęciach stierdzono że nie da się usunąć osoby z tabeli więc zeruje dane w tabeli aby "usunąć" osobę z tabeli
                            System.out.println("Wprowadz numer osoby:");
                            int d = scan.nextInt();
                            scan.nextLine();
                            if (Persons[d] == null) {
                                System.out.println("Dana osoba nie istnieje");
                            } else {
                                Persons[d].name = "";
                                Persons[d].city = "";
                                Persons[d].phone = 0;
                            }
                            break;
                        case 5:
                            return;
                        default:
                            System.out.println("Nie poprawny wybor.");
            }
        }
    }
}