package model;

import model.enums.Degree;
import model.enums.ProgrammingLanguage;

public class Mentor extends Person{

    private Degree degree;


    public Mentor(String name, ProgrammingLanguage language, int age, String gender, Degree degree) {
        super(name, language, age, gender);
        this.degree = degree;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Mentor -> " + super.toString() + " Degree: " + degree;
    }
}
