import model.Mentor;
import model.Person;
import model.Student;
import model.enums.Degree;
import model.enums.Payment;
import model.enums.ProgrammingLanguage;

public class Main {
    public static void main(String[] args) {

        Mentor mentor = new Mentor("Kane", ProgrammingLanguage.JAVA, 30, "Male", Degree.SENIOR);
        Mentor mentor1 = new Mentor("Asel", ProgrammingLanguage.JAVASCRIPT, 28, "Female", Degree.MIDDLE);
        Mentor mentor2 = new Mentor("Rino", ProgrammingLanguage.FLUTTER, 25, "Female", Degree.JUNIOR);

        Student student = new Student("Tim", ProgrammingLanguage.JAVA, 22, "Male", Payment.PAYED);
        Student student2 = new Student("Rin", ProgrammingLanguage.JAVASCRIPT, 19, "Male", Payment.HALFPAYED);
        Student student3 = new Student("Mil", ProgrammingLanguage.FLUTTER, 21, "Female", Payment.FREE);

        for (ProgrammingLanguage pl : ProgrammingLanguage.values()) {
            System.out.println(pl.name() + " number is: " + pl.ordinal());
        }
        Person[] people = new Person[] {mentor, mentor1, mentor2, student, student2, student3};

        for (Person p : people) {
            System.out.println(p);
        }

    }
}

