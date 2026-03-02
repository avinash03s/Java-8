package Java_8_feature.realTimeuseFunctionInterface;


public class Student {
    private int id;
    private String name;
    private double percentage;
    private String skill;

    public Student(int id, String name, double percentage, String skill) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
        this.skill = skill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", skill='" + skill + '\'' +
                '}';
    }
}
