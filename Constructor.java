class Student {
    String name;
    int age;
    Student(String n, int a) { //parameterized constructor takes two parameter string and int
        this.name = n;
        this.age = a;
    }
    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Navaneeth", 20);
        s1.display();
    }
}