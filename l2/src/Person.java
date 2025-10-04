public class Person {
    private String firstName;
    private String lastName;
    private final int birthYear;
    private String city;

    public Person(String firstName, String lastName, int birthYear, String city) {
        setFirstName(firstName);
        setLastName(lastName);
        this.birthYear = birthYear;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() >= 2 && Character.isUpperCase(firstName.charAt(0))) {
            this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        } else {
            throw new IllegalArgumentException("The name must be at least 2 characters long and start with a capital letter");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() >= 2 && Character.isUpperCase(lastName.charAt(0))) {
            this.lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        } else {
            throw new IllegalArgumentException("The name must be at least 2 characters long and start with a capital letter");
        }
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return java.time.Year.now().getValue() - birthYear;
    }

    public void showInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Birth year: " + birthYear);
        System.out.println("Age: " + getAge());
        System.out.println("City: " + city);
    }
}
