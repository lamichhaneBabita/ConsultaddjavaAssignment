package Task06;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;

    }

    public Student() {
        this.name = "Unknown";
    }

    public static void main(String[] args) {
        Student st = new Student("Babita");
        Student student = new Student();
        System.out.println(st.name);
        System.out.println(student.name);

    }

}
