package model;

import model.enums.Payment;
import model.enums.ProgrammingLanguage;

public class Student extends Person{

    private Payment payment;

    public Student() {
    }

    public Student(String name, ProgrammingLanguage language, int age, String gender, Payment payment) {
        super(name, language, age, gender);
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Student -> " + super.toString() + " Payment: " + payment;
    }
}
