package Exercice4;

public class Person {

    public  String firstName;
    public  String lastName;
    public  int age;

    public Person(String firstName, String lastName, int age) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    public String introduce() {
        return "Hello, my name is ["+firstName + "] [ "+ lastName +"] and I am ["+ age + "] years old.";
    }

    

    
    
}
