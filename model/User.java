package src.main.java.example.com.Typing_Speed_Test.model;

public class User {
   private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("=== User Info ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
