//https://javastart.pl/baza-wiedzy/programowanie-obiektowe/dziedziczenie-i-konstrukcja-super
public class Teacher extends Person {
    private String universityTitle;

    public Teacher(String firstName, String lastName, int birthYear, String city, String universityTitle) {
        //Służy ona do wywoływania konstruktorów klasy nadrzędnej (tej, z której dziedziczymy) o podanych parametrach, lub w przypadku metod - odpowiedników o takiej samej nazwie i podanych parametrach.
        super(firstName, lastName, birthYear, city);
        this.universityTitle = universityTitle;
    }

    public String getUniversityTitle() {
        return universityTitle;
    }

    public void setUniversityTitle(String universityTitle) {
        this.universityTitle = universityTitle;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Degree: " + universityTitle);
    }
}
