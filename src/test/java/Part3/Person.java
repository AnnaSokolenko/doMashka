package Part3;

public class Person {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("Monty", 3);}
    String fullName;
    int age;
    public void move() {
        System.out.println("Person moves");}
    public void talk() {
        System.out.println("Person talk");}
    public Person() {}
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;}
}

