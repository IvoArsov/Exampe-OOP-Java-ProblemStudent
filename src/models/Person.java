package models;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.setName(name);
        this.setAge(age);
        this.setEmail(email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!Character.isUpperCase(name.codePointAt(0))){
            throw new IllegalArgumentException("Names must start with capital letter!");
        }else if(name.length() <= 3){
            throw new IllegalArgumentException("Name is too short!");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if((age <= -2) || (age >= 100)){
            throw new IllegalArgumentException("Please, enter a valid age!");
        }
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email == "no email provided"){
            this.email = email;
        }else if(!isValid(email)){
            this.email = "invalid email provided";
        }else {
            this.email = email;
        }

    }

    private boolean isValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }
}
