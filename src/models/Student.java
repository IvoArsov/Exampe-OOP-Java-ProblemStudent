package models;

public class Student extends Person {
    private int classOfStudent;
    private String school;

    public Student(String name, int age, String email, int classOfStudent, String school) {
        super(name, age, email);
        this.setClassOfStudent(classOfStudent);
        this.setSchool(school);
    }

    public Student(String name, int age, int classOfStudent, String school ){
        this(name, age, "no email provided", classOfStudent, school);
    }

    public Student(String name, int classOfStudent, String school ){
        this(name, -1, "no email provided", classOfStudent, school);
    }

    public Student(String name, String email, int classOfStudent, String school){
        this(name, -1, email, classOfStudent, school);
    }

    public int getClassOfStudent() {
        return classOfStudent;
    }

    public void setClassOfStudent(int classOfStudent) {
        if((classOfStudent < 1) || (classOfStudent > 12)){
            throw new IllegalArgumentException("Clas must be a positive number!");
        }
        this.classOfStudent = classOfStudent;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        if (school.length() <= 5){
            throw new IllegalArgumentException("School name must be minimum 6 characters long!");
        }
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name: " + this.getName() +
                "; Email: " + this.getEmail() +
                "; Age: " + this.getAge() +
                "; Class: " + this.getClassOfStudent() +
                "; School: " + this.getSchool() +
                '}';
    }
}
