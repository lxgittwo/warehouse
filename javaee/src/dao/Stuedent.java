package dao;

public class Stuedent {
    String name;
     int age;

     Stuedent() {
    }

     Stuedent(String name, int age) {
        this.name = name;
        this.age = age;
    }

     String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

     int getAge() {
        return age;
    }

     void setAge(int age) {
        this.age = age;
    }
}
