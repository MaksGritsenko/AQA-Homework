package homeworknine;

public class Counter {

    private String name;
    private int occurrence;

    public Counter (String s , int i) {
        this.name = s;
        this.occurrence = i;
    }

    @Override
    public String toString() {
        return "{" +
                "name:'" + name + '\'' +
                ", occurrence:" + occurrence +
                '}';
    }
}
