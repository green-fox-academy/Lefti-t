package com.company.teacherStudent;

public class TeacherStudentMain {

    public static void main(String[] args) {

        Student Mary = new Student();
        Teacher John = new Teacher();

        Mary.question(John);
        John.teach(Mary);
    }
}
