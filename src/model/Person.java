package model;

import model.enums.ProgrammingLanguage;

public abstract class Person {

    private String name;
    private ProgrammingLanguage language;
    private int age;
    private String gender;

    public Person() {
    }

    public Person(String name, ProgrammingLanguage language, int age, String gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProgrammingLanguage getLanguage() {
        return language;
    }

    public void setLanguage(ProgrammingLanguage language) {
        this.language = language;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                " Name: " + name +
                " Language: " + language +
                " Age=" + age +
                " Gender: " + gender;
    }
}
