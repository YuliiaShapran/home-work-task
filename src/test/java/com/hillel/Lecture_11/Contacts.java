package com.hillel.Lecture_11;

public enum Contacts {
    MOTHER("Jenifer", "45", "+565600000000"), // +58465767677
    FATHER("David", "51", "+95486845575"),
    BROTHER("Andrew", "11", "+489645657657"),
    SISTER("Sara", "24", "+676586787687"),
    FRIEND("John", "18", "+565475676588");

    private String name;
    private String age;
    private String phoneNumber;

    Contacts(String name, String age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
