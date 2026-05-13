class STudent {
    private String name;
    private int age;
    void setName(String name) {
        this.name = name;
    }
    void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        STudent s1 = new STudent();
        s1.setName("Navaneeth");
        s1.setAge(20);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}