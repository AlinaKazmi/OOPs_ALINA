class Student {
    String name;
    int age;

    // Constructor 1
    Student() {// "this as method
        //calling parameterized constructor
        this("Unknown", 0); // "this" as a method
        
        System.out.println("Default constructor called");
    }

    // Constructor 2
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Calls default constructor, which internally calls parameterized constructor
        Student s1 = new Student();
        s1.display();

        // Directly calls parameterized constructor
        Student s2 = new Student("Surabhi", 22);
        s2.display();
    }
}
