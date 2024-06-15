package homeworkthirteen;

public class Student {

    private String name;
    private Integer age;
    private Double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + '(' +
                "Age:" + age +
                ", Grade:" + grade +
                ')';
    }
}
