import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[100];
        int index = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n------- MENU -------");
            System.out.println("1. Create person");
            System.out.println("2. View all people");
            System.out.println("3. Edit person");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Who do you want to add?");
                    System.out.println("1. Person");
                    System.out.println("2. Student");
                    System.out.println("3. Teacher");
                    int type = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("First name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Last name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Birth year: ");
                    int birthYear = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("City: ");
                    String city = scanner.nextLine();
                    //https://javastart.pl/baza-wiedzy/programowanie-obiektowe/wyjatki-blok-try-catch
                    try {
                        if (type == 1) {
                            people[index++] = new Person(firstName, lastName, birthYear, city);
                        } else if (type == 2) {
                            System.out.print("Index number: ");
                            int indexNumber = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Year of start study: ");
                            int startYear = scanner.nextInt();
                            scanner.nextLine();
                            people[index++] = new Student(firstName, lastName, birthYear, city, indexNumber, startYear);
                        } else if (type == 3) {
                            System.out.print("Degree: ");
                            String title = scanner.nextLine();
                            people[index++] = new Teacher(firstName, lastName, birthYear, city, title);
                        } else {
                            System.out.println("Wrong choice.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    for (int i = 0; i < index; i++) {
                        System.out.println("\nPerson nr " + i);
                        people[i].showInfo();
                    }
                    break;

                case 3:
                    System.out.print("Enter the number of the person to edit: ");
                    int editIndex = scanner.nextInt();
                    scanner.nextLine();
                    if (editIndex < 0 || editIndex >= index) {
                        System.out.println("Incorrect number person.");
                        break;
                    }

                    Person p = people[editIndex];
                    System.out.print("New first name: ");
                    p.setFirstName(scanner.nextLine());
                    System.out.print("New last name: ");
                    p.setLastName(scanner.nextLine());
                    System.out.print("New city: ");
                    p.setCity(scanner.nextLine());

                    if (p instanceof Student) {
                        Student s = (Student) p;
                        System.out.print("New index number: ");
                        s.setStudentNumber(scanner.nextInt());
                        System.out.print("New year of start study: ");
                        s.setStartLearnYear(scanner.nextInt());
                        scanner.nextLine();
                    } else if (p instanceof Teacher) {
                        Teacher t = (Teacher) p;
                        System.out.print("Degree: ");
                        t.setUniversityTitle(scanner.nextLine());
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Unknown option.");
            }
        }
    }
}
