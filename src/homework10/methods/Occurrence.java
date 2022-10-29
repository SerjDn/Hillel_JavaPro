package homework10.methods;

public class Occurrence {

    private String name;
    private Integer count;

    public Occurrence(String name, Integer count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public Integer getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Occurrence{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
