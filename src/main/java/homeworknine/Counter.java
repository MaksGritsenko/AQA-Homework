package homeworknine;

public class Counter {

    private String name;
    private int count;

    public Counter (String s , int i) {
        this.name = s;
        this.count = i;
    }

    @Override
    public String toString() {
        return "{" +
                "name:'" + name + '\'' +
                ", count:" + count +
                '}';
    }
}
