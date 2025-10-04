//https://javastart.pl/baza-wiedzy/programowanie-obiektowe/dziedziczenie-i-konstrukcja-super
public class Student extends Person {
    private int studentNumber;
    private int startLearnYear;

    public Student(String firstName, String lastName, int birthYear, String city, int studentNumber, int startLearnYear) {
        super(firstName, lastName, birthYear, city);
        this.studentNumber = studentNumber;
        this.startLearnYear = startLearnYear;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getStartLearnYear() {
        return startLearnYear;
    }

    public void setStartLearnYear(int startLearnYear) {
        this.startLearnYear = startLearnYear;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Index number: " + studentNumber);
        System.out.println("Year of start studies: " + startLearnYear);
    }
}
